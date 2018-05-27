package com.zhang.controller;

import com.zhang.service.LoginService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/5/27 0027.
 */
@Configuration
public class Test {

    @Bean
    public UserCenter userCenter(LoginService loginService) {
        UserCenter userCenter = new UserCenter();
        userCenter.setLoginService(loginService);
        return userCenter;
    }

    @Bean
    public LoginService loginService() {
        return new LoginService();
    }
}
