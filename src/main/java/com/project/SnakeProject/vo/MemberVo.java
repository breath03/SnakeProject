package com.project.SnakeProject.vo;

public class MemberVo {
    private String MemberId;
    private String MemberPw;
    private String MemberName;
    private String MemberSex;
    private String MemberPhone;

    public MemberVo(String memberId, String memberPw, String memberName, String memberSex, String memberPhone) {
        this.MemberId = memberId;
        this.MemberPw = memberPw;
        this.MemberName = memberName;
        this.MemberSex = memberSex;
        this.MemberPhone = memberPhone;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getMemberPw() {
        return MemberPw;
    }

    public void setMemberPw(String memberPw) {
        MemberPw = memberPw;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }
    public String getMemberSex() {
        return MemberSex;
    }

    public void setMemberSex(String memberSex) {
        MemberSex = memberSex;
    }

    public String getMemberPhone() {
        return MemberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        MemberPhone = memberPhone;
    }
}
