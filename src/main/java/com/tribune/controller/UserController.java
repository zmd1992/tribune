package com.tribune.controller;

import com.tribune.pojo.User;
import com.tribune.service.UserService;
import com.tribune.util.DateUtils;
import net.sf.cglib.core.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * created by zhangmengdan
 * created at 2018/12/16 23:21
 * 用户控制层
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;

    /**
     * 跳到用户注册页面
     *
     * @return
     */
    @RequestMapping(value = "registerPage")
    public String toRegisterPage() {
        return "user/register";
    }

    /**
     * 处理注册
     *
     * @param request
     * @return
     * @throws ParseException
     */
    @RequestMapping("registerUser")
    public ModelAndView registerUser(HttpServletRequest request) throws ParseException {
        String username = request.getParameter("username");
        ModelAndView modelAndView=new ModelAndView();
        if (username.equals("")){
            return modelAndView=new ModelAndView("/user/userIsNull");
        }
        List<User> userList=userService.checkUserNameRepeat(username);
        if (userList.size()>0&&userList!=null){
            return   modelAndView=new ModelAndView("/user/checkUsernameRepeat");
        }
        String password=request.getParameter("password");
        if (password.equals("")){
            return modelAndView=new ModelAndView("/user/passIsNull");
        }
        String sex = request.getParameter("sex");
        String birthday = request.getParameter("birthday");
        if (birthday.equals("")){
            return modelAndView=new ModelAndView("/user/isNotNull");
        }
        String email = request.getParameter("email");
        String headImg = request.getParameter("headImg");
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        user.setSex(sex);
        user.setHeadImg(headImg);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = simpleDateFormat.parse(birthday);
        user.setBirthday(birthdayDate);
        user.setEmail(email);
        int insertUser=userService.addUser(user);
        if (insertUser==1){
           return   modelAndView=new ModelAndView("user/login");
        }
        return modelAndView;

    }

    @RequestMapping(value = "/loginPage")
    public String toLoginPage() {
        return "user/login";
    }

    /*
     *处理登录页面
     */
    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request, Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        ModelAndView modelAndView = null;
        if (username != null && !username.equals("")) {
            User user = userService.findUserByUsername(username);
            model.addAttribute("user", user);
            request.getSession().setAttribute("user", user);
            if (user.getPassword() != null && !user.getPassword().equals("") && user.getPassword().equals(password)) {
                modelAndView = new ModelAndView("pageHome");
            } else {
                modelAndView = new ModelAndView("/user/checkUser");
            }
        } else if (this.paramIsNull(new String[]{username, password})) {
            modelAndView = new ModelAndView("/user/userIsNotNull");
        }
        return modelAndView;
    }

    /**
     * 验证用户名和密码是否为空
     */
    public boolean paramIsNull(String[] params) {
        for (String param : params) {
            if (param == "" || param == null) {
                return true;
            }
        }
        return false;
    }

    /**
     * 跳到我的资料页面
     *
     * @return
     */
    @RequestMapping(value = "/myInfoPage")
    public String toMyInfoPage() {
        return "/my/myInfo";
    }

    /**
     * 处理我的资料页面
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/doMyInfo")
    public String doMyInfo(HttpServletRequest request, Model model) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         User user = (User) request.getSession().getAttribute("user");
        String birthdayStr = DateUtils.dateFormatString(user.getBirthday());
        model.addAttribute("user", user);
        model.addAttribute("birthdayStr", birthdayStr);
        return "my/myInfo";
    }

    /**
     * 跳到修改资料页面
     *
     * @return
     */
    @RequestMapping(value = "toModifyMyInfoPage")
    public String modifyUser() {
        return "my/modifyMyInfo";
    }

    /**
     * 处理修改个人资料
     *
     * @param request
     * @return
     */
    @RequestMapping("/doModifyUser")
    public String doModifyUser(HttpServletRequest request, Model model) {
        User loginUser = (User) request.getSession().getAttribute("user");
        User user = userService.findUserByUsername(loginUser.getUserName());
        model.addAttribute("user", user);
        userService.modifyUserByUserId(user.getId());
        return "my/myInfo";
    }
}
