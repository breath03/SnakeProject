package com.project.SnakeProject.mapper;

import com.project.SnakeProject.vo.CommunityVo;
import com.project.SnakeProject.vo.MemberVo;
import jakarta.servlet.http.HttpSession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface MemberMapper {
    // 회원가입
    public int addMember(MemberVo memberVo);
    // 중복확인
    public boolean selectId(String Id);
    // 로그인
    public String login(MemberVo memberVo);
    // 개인정보수정 이동시 나오는 정보들
    public MemberVo selectInfo(String id);
    // 개인정보 수정
    public int updateInfo(MemberVo memberVo);
    List<CommunityVo> MyPageCommunity(String id);
}
