package com.tribune.controller;

import com.tribune.core.Student;
import com.tribune.function.IStudentFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by zhangmengdan
 * created at 2018/12/16 20:51
 **/
@Controller
public class LoginController {
    @Autowired
    IStudentFunction iStudentFunction;

    @RequestMapping(value = "/hello")
    public String hello() {
        System.out.println("接收到请求，hello");
        return "hi";
    }

    @RequestMapping(value = "/login")
    public String login(String sName, String sPass) {
        try {
            Student student = iStudentFunction.login(sName, sPass);
            if (student == null) {
                System.out.println("登录失败");
            } else {
                System.out.println("登录成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.fillInStackTrace());
            System.out.println("登录失败");
        }
        return null;
    }
}
