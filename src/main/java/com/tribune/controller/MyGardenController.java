package com.tribune.controller;

import com.tribune.pojo.MyGarden;
import com.tribune.pojo.User;
import com.tribune.service.MyGardenService;
import com.tribune.service.UserService;
import com.tribune.util.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("myGarden")
public class MyGardenController {
    @Resource
    private MyGardenService myGardenService;
    @Resource
    private UserService userService;

    /**
     * 跳到我的园子页面
     *
     * @return
     */
    @RequestMapping(value = "toMyGardenPage")
    public String toMyGardenPage(HttpServletRequest request, Model model) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "/my/myGarden";
    }

    /**
     * 发布内容
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "pushContent")
    public String pushContent(HttpServletRequest request, Model model) throws ParseException {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        String content = request.getParameter("content");
        MyGarden myGarden = new MyGarden();
        myGarden.setContent(content);
        if (myGarden.getContent().equals("")) {
        }
        myGarden.setCreatedAt(new Date());
        myGarden.setCreatedPersonId(user.getId());
        myGardenService.pushContent(myGarden);

        return "/my/myGarden";
    }

    /**
     * 跳到全站页面
     *
     * @return
     */
    @RequestMapping(value = "toTotalStationPage")
    public String toTotalStation(HttpServletRequest request, Model model) {
        return "/my/totalStation";
    }

    /**
     * 处理全站页面
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "doTotalStation")
    public String doTatalStation(HttpServletRequest request, Model model) {
        //查询用户列表
        List<User> userList = userService.findUserList();
        List<Integer> userIdList = new ArrayList<>();
        userList.forEach(x -> {
            //获取用户ID
            userIdList.add(x.getId());
        });
        model.addAttribute("userList", userList);
        //根据用户ID查询全站内容，并获取创建人ID
//        List<Integer> createdPersonIdList = new ArrayList<>();
//        List<MyGarden> gardenList = myGardenService.findMyGardenContentById(userIdList);
//        gardenList.forEach(x -> {
//            String createdAtStr = DateUtils.dateFormatString(x.getCreatedAt());
//            model.addAttribute("createdAtStr", createdAtStr);
//            createdPersonIdList.add(x.getCreatedPersonId());
//        });
//        //根据全站内容创建人ID获取用户名称
//        List<User> list=userService.findUserListByIds(createdPersonIdList);
//        model.addAttribute("list", list);
//        model.addAttribute("gardenList", gardenList);
        //查询全站内容
        List<MyGarden> myGardenList = myGardenService.findTotalStationContent();
        //获取创建人ID
        List<Integer> createdPersonIdList = new ArrayList<>();
        myGardenList.forEach(x -> {
            createdPersonIdList.add(x.getCreatedPersonId());
        });
        List<User> userListByIds = userService.findUserListByIds(createdPersonIdList);
        List<MyGarden> list = new ArrayList<>();
        //根据内容ID和创建人ID查询发布内容
        for (Integer createdPersonId : createdPersonIdList) {
            for (MyGarden myGarden : myGardenList) {
                myGarden.setId(myGarden.getId());
                myGarden.setCreatedPersonId(createdPersonId);
                myGarden = myGardenService.findMyGardenContentByIds(myGarden);
                list.add(myGarden);
            }
        }
        model.addAttribute("list", list);
        model.addAttribute("userListByIds", userListByIds);
        return "/my/totalStation";
    }

    /**
     * 删除我发布的内容
     *
     * @return
     */
    @RequestMapping(value = "removeMyGardenContent")
    public String removeMyGardenContent(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        MyGarden myGarden = new MyGarden();
        myGarden.setCreatedPersonId(user.getId());
        String id = request.getParameter("id");
        myGarden.setId(Integer.valueOf(id));
        myGardenService.removeMyGardenContent(myGarden);
        return "/my/myGarden";
    }
}
