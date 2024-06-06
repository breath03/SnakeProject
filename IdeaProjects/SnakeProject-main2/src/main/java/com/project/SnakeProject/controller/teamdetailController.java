package com.project.SnakeProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class teamdetailController {
  @GetMapping("/teamdetail")
  public String teamdetail(){
    return "content/teamdetail";
  }
}