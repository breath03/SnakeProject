package com.project.SnakeProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    @RequestMapping(value = "test")
    public String test(){
        return "test";
    }
}
