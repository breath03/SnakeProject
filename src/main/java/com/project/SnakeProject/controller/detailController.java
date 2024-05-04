package com.project.SnakeProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class detailController {
    @GetMapping("/detail")
    public String detail() {
        return "content/detail";
    }
}
