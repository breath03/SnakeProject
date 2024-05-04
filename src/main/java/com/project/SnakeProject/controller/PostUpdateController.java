package com.project.SnakeProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostUpdateController {
  @GetMapping("/postUpdate")
  public String home(){
    return "content/postUpdate";
  }
}