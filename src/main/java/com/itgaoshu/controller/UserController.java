package com.itgaoshu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class UserController {

    @RequestMapping("test.do")
    public String test1(){

        return "login.html";
    }
}
