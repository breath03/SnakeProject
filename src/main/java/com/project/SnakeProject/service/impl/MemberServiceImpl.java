package com.project.SnakeProject.service.impl;

import com.project.SnakeProject.mapper.MemberMapper;
import com.project.SnakeProject.service.MemberService;
import com.project.SnakeProject.vo.CommunityVo;
import com.project.SnakeProject.vo.MemberVo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberMapper memberMapper;

    @Override
    public int addMember(MemberVo memberVo) {
        return memberMapper.addMember(memberVo);
    }

    @Override
    public boolean selectId(String id) {
        return memberMapper.selectId(id);
    }

    @Override
    public String login(MemberVo memberVo, HttpSession session) {
        return memberMapper.login(memberVo);
    }

    @Override
    public MemberVo selectInfo(String id) {
        return memberMapper.selectInfo(id);
    }

    @Override
    public int updateInfo(MemberVo memberVo) {
        return memberMapper.updateInfo(memberVo);
    }

    @Override
    public List<CommunityVo> MyPageCommunity(String id) {
        return memberMapper.MyPageCommunity(id);
    }
}
