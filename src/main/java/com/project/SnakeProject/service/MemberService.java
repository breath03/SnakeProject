package com.project.SnakeProject.service;

import com.project.SnakeProject.mapper.MemberMapper;
import com.project.SnakeProject.vo.MemberVo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberService {
    @Autowired
    MemberMapper memberMapper;
    public int addMember(MemberVo memberVo) {
        return memberMapper.addMember(memberVo);
    }

    public boolean selectId(String id) {
        return memberMapper.selectId(id);
    }

    public String login(MemberVo memberVo, HttpSession session) {
        String name = memberMapper.login(memberVo);
        if(name != null) {
            session.setAttribute("userId", memberVo.getMemberId());
            session.setAttribute("username", name);
        }
        return name;
    }
    public void logout(HttpSession session){
        session.invalidate();
    }
}
