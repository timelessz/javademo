package com.timeless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/tologin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String pwd) {
        // 向session记录用户身份信息
        System.out.println("接收前端===" + username);
        session.setAttribute("user", username);
        return "success";
    }

    //退出登陆
    @RequestMapping("/logout")
    public String logout(HttpSession session) throws Exception {
        // session 过期
        session.invalidate();
        return "login";
    }

    @RequestMapping("/index")
    public String index() {
        return "userindex";
    }

}
