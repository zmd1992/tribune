package com.tribune.controller;

import com.tribune.pojo.User;
import com.tribune.service.UserService;
import com.tribune.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * created by zhangmengdan
 * created at 2018/12/16 23:21
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

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
