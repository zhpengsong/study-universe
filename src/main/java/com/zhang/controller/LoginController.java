package com.zhang.controller;

import com.zhang.domain.entity.User;
import com.zhang.service.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/5/26 0026.
 */
@RestController
@RequestMapping("/user")
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping("/login")
    public User login(){
        User user = loginService.getById();
        return user;
    }
}