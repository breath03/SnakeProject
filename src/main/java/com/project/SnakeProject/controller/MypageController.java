package com.project.SnakeProject.controller;

import com.project.SnakeProject.service.MemberService;
import com.project.SnakeProject.service.impl.CommunityServiceImpl;
import com.project.SnakeProject.service.impl.MemberServiceImpl;
import com.project.SnakeProject.vo.CommunityCategoryVo;
import com.project.SnakeProject.vo.CommunityVo;
import com.project.SnakeProject.vo.MemberVo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class MypageController {
    @Autowired
    private MemberServiceImpl memberService;
    @Autowired
    private CommunityServiceImpl communityServiceImpl;

    @RequestMapping(value="/mypage", method = RequestMethod.GET)
    public String mypage(String id, Model model, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        if(session.getAttribute("userid") != null) {
            // 개인정보 가져오는 service
            MemberVo member = memberService.selectInfo(id);
            model.addAttribute("data", member);

            // 개인 좌석 시간 및 룸 시간 충전

            // 개인이 작성한 글 보여주는 게시판
            List<CommunityVo> community = new ArrayList<>();
            community.addAll(memberService.MyPageCommunity(id));

            //^_^
            model.addAttribute("community", community);
            model.addAttribute("title", "마이페이지");
            return "content/mypage";
        } else {
            model.addAttribute("msg", "비정상 접근입니다.");
            model.addAttribute("url", "/");
            return "content/alert";

        }
    }

    @GetMapping("/ShowContent")
    @ResponseBody
    public List<List<List<CommunityVo>>>ShowContent(String id) {
//        List<CommunityVo> Ctables = new ArrayList<CommunityVo>();
//        Ctables.addAll(memberService.MyPageCommunity(id));
        List<CommunityVo> Ctables = memberService.MyPageCommunity(id);
//        List<CommunityVo> community = new ArrayList<>();

        List<List<CommunityVo>> twoList = new ArrayList<>();
        for(int i = 0; i < Ctables.size(); i += 3) {
            int end = Math.min(i + 3, Ctables.size());
            twoList.add(Ctables.subList(i, end));
        }

        List<List<List<CommunityVo>>> threeList = new ArrayList<>();
        for(int i = 0; i < twoList.size(); i += 3) {
            int end = Math.min(i + 3, twoList.size());
            threeList.add(twoList.subList(i, end));
        }

//        model.addAttribute("twoList", twoList);
//        model.addAttribute("threeList", threeList);
//        model.addAttribute("pageGroup", parameterPageGroup);
//        model.addAttribute("groupCommunity", parameterCommunity);

        return threeList;
    }

    @PostMapping("/MemberUpdate")
//    @RequestMapping(value="/MemberUpdate/{id}", method = RequestMethod.POST)
    public String updateInfo(@RequestParam(value="id") String id, MemberVo member, Model model) throws Exception {
        member.setMemberId(id);
//        int result = memberService.updateInfo(member);

        if(memberService.updateInfo(member) > 0) {
            model.addAttribute("msg", "개인정보가 수정되었습니다.");
            model.addAttribute("url", "/mypage?id=" + id);
            return "content/alert";
        } else {
            model.addAttribute("msg", "개인정보 수정에 실패하였습니다.");
            model.addAttribute("url", "/mypage");
            return "content/alert";
        }
    }
}
