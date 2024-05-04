package com.project.SnakeProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class joinController {
    @GetMapping("join")
    public String join(){
        return "content/join";
    }

    @GetMapping("/join2")
    public String join2() {
        return "content/join2";
    }
}




