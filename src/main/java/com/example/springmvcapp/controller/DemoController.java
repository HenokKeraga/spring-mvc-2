package com.example.springmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/home")
    public String displayWelcom(){
        return "welcome";
    }
}
