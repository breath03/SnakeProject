package com.project.SnakeProject.controller;

import com.project.SnakeProject.service.impl.CommunityCategoryImpl;
import com.project.SnakeProject.service.impl.CommunityImpl;
import com.project.SnakeProject.service.impl.StudyGInfoImpl;
import com.project.SnakeProject.vo.CommunityCategoryVo;
import com.project.SnakeProject.vo.CommunityVo;
import com.project.SnakeProject.vo.StudyGInfoVo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PostUpdateController {

  @Autowired
  private CommunityImpl communityimpl;
  @Autowired
  private CommunityCategoryImpl communityCategoryimpl;
  @Autowired
  private StudyGInfoImpl studyGInfo;

  @GetMapping("/postUpdate")
  public String home(@RequestParam("postNum") int parameterPostNum, Model model, HttpServletRequest request){

    List<CommunityVo> communityTable = communityimpl.ViewContent(parameterPostNum);
    List<CommunityCategoryVo> categoryTable = communityCategoryimpl.ViewCommunityCategory();
    List<StudyGInfoVo> groupTable = studyGInfo.ViewStudyGInfo();

    Object Ctable = communityTable.get(0);
    String TogetherMemberName = ((CommunityVo) Ctable).getTogetherMemberName();
    String TogetherMemberId = ((CommunityVo) Ctable).getTogetherMemberId();


    if(TogetherMemberName != null && !TogetherMemberName.isEmpty()) {
      String[] MemberName = TogetherMemberName.split(", ");
      model.addAttribute("MemberName", MemberName);
    }

    if(TogetherMemberId != null && !TogetherMemberId.isEmpty()) {
      String[] MemberId = TogetherMemberId.split(", ");
      model.addAttribute("MemberId", MemberId);
    }

    HttpSession session = request.getSession();
    String sessionId = (String) session.getAttribute("userid");

    model.addAttribute("parameterPostNum", parameterPostNum);
    model.addAttribute("communityTable", communityTable);
    model.addAttribute("categoryTable", categoryTable);
    model.addAttribute("groupTable", groupTable);

    if(sessionId != null && !sessionId.isEmpty()) {
      return "content/postUpdate";
    }
    else{
      return "content/postAlert";
    }
  }

  @PostMapping("/postRewrite")
  public String postRewrite(@RequestParam("postNum") int parameterPostNum, CommunityVo communityVo,
                            HttpServletRequest httpServletRequest, Model model) {

    //가져오는 날짜값을 sql적용시키기위해서 조금 변형한 것
    communityVo.setComStartDate((communityVo.getComStartDate().replace("T", " ")));
    communityVo.setComEndDate((communityVo.getComEndDate().replace("T", " ")));

    String RbuttonRS =  httpServletRequest.getParameter("inlineRadioOptions");
    String roomRbuttonRS = httpServletRequest.getParameter("studyroomSelection");

    if(RbuttonRS.contains("온라인")) {
      communityVo.setComAddress(RbuttonRS);
      communityVo.setComplace("");
      communityVo.setComZipcode("");
    }else if(RbuttonRS.contains("스터디룸")) {
      communityVo.setComAddress(roomRbuttonRS);
      communityVo.setComplace("");
      communityVo.setComZipcode("");
    }


    int rs = communityimpl.updatePost(parameterPostNum, communityVo);

    if(rs > 0) {
      model.addAttribute("msg", "게시글수정이 완료되었습니다.");
      model.addAttribute("url", "/messageBoard?category=0&pageGroup=1&groupCommunity=1");
    }else{
      model.addAttribute("msg", "게시글수정이 실패했습니다. 다시 시도해주세요.");
      model.addAttribute("url", "/messageBoard?category=0&pageGroup=1&groupCommunity=1");
    }

    return "content/alert";
  }
}