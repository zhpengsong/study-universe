package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/5/26 0026.
 */
/*@RestController
@RequestMapping("/user")
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping("/login")
    public User login(){
        User user = loginService.getById();
        return user;
    }
}*/

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(HttpSession session){
        session.setAttribute("userName","zhangsan");
        return "loginSuccess";
    }
    @RequestMapping("/buy")
    public String buy(HttpSession session){
        return "buy";
    }
    @RequestMapping("/plogin")
    public String plogin(HttpSession session){

        return "login";
    }
}