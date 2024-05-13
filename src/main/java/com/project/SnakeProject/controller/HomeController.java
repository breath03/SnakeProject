package com.project.SnakeProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.project.SnakeProject.service.impl.StudyInInfoImpl;
import com.project.SnakeProject.vo.StudyInInfoVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private StudyInInfoImpl studyInInfoImpl;

    @RequestMapping(value = "/")
    public String home(Model model){
        List<StudyInInfoVo> tables = new ArrayList<>();
        tables.addAll(studyInInfoImpl.ViewStudyInInfo());

        model.addAttribute("ViewStudyInInfo", tables);
        return "content/home";
    }
}