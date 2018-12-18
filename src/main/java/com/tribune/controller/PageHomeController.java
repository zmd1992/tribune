package com.tribune.controller;

import com.mysql.cj.Session;
import com.tribune.pojo.User;
import com.tribune.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 论坛首页控制层
 */
@Controller
@RequestMapping("/pageHome")
public class PageHomeController {
    @Resource
    private UserService userService;

    @RequestMapping("/toHome")
    public String toHome() {
        return "pageHome";
    }

    @RequestMapping("/doPageHome")
    public String doPageHome(HttpServletRequest request, Model model) {
      Session session  = (Session) request.getSession().getAttribute("user");
      model.addAttribute("a",session);
      return "pageHome";
    }
}
