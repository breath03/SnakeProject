package com.project.SnakeProject.controller;

import com.project.SnakeProject.service.CommunityCategory;
import com.project.SnakeProject.service.impl.CommunityCategoryImpl;
import com.project.SnakeProject.service.impl.CommunityImpl;
import com.project.SnakeProject.vo.CommunityCategoryVo;
import com.project.SnakeProject.vo.CommunityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MessageBoardController {

    @Autowired
    private CommunityCategoryImpl communityCategoryImpl;
    @Autowired
    private CommunityImpl communityImpl;

    @GetMapping("/messageBoard")
    public String messageBoard(Model model) {
        List<CommunityCategoryVo> CCtables = communityCategoryImpl.ViewCommunityCategory();
        List<CommunityVo> Ctables = communityImpl.ViewCommunity();

        model.addAttribute("ViewCommunityCategory", CCtables);
        model.addAttribute("ViewCommunity", Ctables);

        return "content/messageBoard";
    }
}
