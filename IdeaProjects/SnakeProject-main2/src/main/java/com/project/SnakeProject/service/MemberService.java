package com.project.SnakeProject.service;

import com.project.SnakeProject.vo.CommunityVo;
import com.project.SnakeProject.vo.MemberVo;
import jakarta.servlet.http.HttpSession;

import java.util.List;

public interface MemberService {
    public int addMember(MemberVo memberVo);
    // 중복확인
    public boolean selectId(String Id);
    // 로그인
    public String login(MemberVo memberVo, HttpSession session);
    // 개인정보수정 이동시 나오는 정보들
    public MemberVo selectInfo(String id);
    // 개인정보 수정
    public int updateInfo(MemberVo memberVo);
    List<CommunityVo> MyPageCommunity(String id);
}
