package com.project.SnakeProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageBoardController {
    @GetMapping("/messageBoard")
    public String Order() {
        return "content/messageBoard";
    }
}
