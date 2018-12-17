package com.tribune.controller;

import com.tribune.pojo.User;
import com.tribune.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * created by zhangmengdan
 * created at 2018/12/16 23:21
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/u1")
    public String user(HttpServletRequest request, Model model) {
        return "addUser";

    }

    /**
     * 插入用户
     *
     * @return
     */
    @RequestMapping(value = "/insert")
    public String addUser(HttpServletRequest request, Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String company = request.getParameter("company");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        user.setCompany(company);
        user.setAge(age);
        user.setSex(sex);
        userService.addUser(user);
        return "/addUse";

    }

    /*
     *根据id查询
     */
    public ModelAndView queryById(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        String id = request.getParameter("id");
        try {
            User user = userService.findById(Integer.valueOf(id));
            modelAndView.setViewName("index");
            modelAndView.addObject("var", user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }
}
