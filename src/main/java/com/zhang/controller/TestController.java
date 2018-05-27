package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/5/27 0027.
 */
@Controller
public class TestController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
