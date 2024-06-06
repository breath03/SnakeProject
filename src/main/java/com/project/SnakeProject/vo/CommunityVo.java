package com.project.SnakeProject.vo;

public class CommunityVo {
  int ComIdx, ComCateIdx, MIdx, ComToCount, ComintoDate;
  String ComTitle, ComContent;
  String Complace, ComRegDate, ComDelDate, ComUpDate, ComStartDate, ComEndDate;
  int MemberCount;
  String TogetherMemberName, TogetherMemberId;

  // 카테고리 정보 가져오는 vo
  private CommunityCategoryVo communityCategoryVo;
  private MemberVo memberVo;

  public CommunityVo() {
    // 기본 생성자
  }
  // 개인정보 페이지에서 본인이 작성한 글 가져오는 생성자
  public CommunityVo(int comIdx, int comToCount, int comintoDate, String comTitle, String comRegDate, CommunityCategoryVo communityCategoryVo, MemberVo memberVo) {
    ComIdx = comIdx;
    ComToCount = comToCount;
    ComintoDate = comintoDate;
    ComTitle = comTitle;
    ComRegDate = comRegDate;
    this.communityCategoryVo = communityCategoryVo;
    this.memberVo = memberVo;
  }

  // 백지


  public CommunityVo(int comIdx, int comCateIdx, int MIdx, int comToCount, int comintoDate, String comTitle, String comContent, String complace, String comRegDate, String comDelDate, String comUpDate, String comStartDate, String comEndDate, int memberCount, String togetherMemberName, String togetherMemberId, MemberVo memberVo) {
    ComIdx = comIdx;
    ComCateIdx = comCateIdx;
    this.MIdx = MIdx;
    ComToCount = comToCount;
    ComintoDate = comintoDate;
    ComTitle = comTitle;
    ComContent = comContent;
    Complace = complace;
    ComRegDate = comRegDate;
    ComDelDate = comDelDate;
    ComUpDate = comUpDate;
    ComStartDate = comStartDate;
    ComEndDate = comEndDate;
    MemberCount = memberCount;
    TogetherMemberName = togetherMemberName;
    TogetherMemberId = togetherMemberId;
    this.memberVo = memberVo;
  }

  public CommunityVo(int comIdx, int comCateIdx, int MIdx, int comToCount, int comintoDate, String comTitle, String comContent, String comRegDate, String comDelDate, String comUpDate, String comStartDate, String comEndDate) {
    ComIdx = comIdx;
    ComCateIdx = comCateIdx;
    this.MIdx = MIdx;
    ComToCount = comToCount;
    ComintoDate = comintoDate;
    ComTitle = comTitle;
    ComContent = comContent;
    ComRegDate = comRegDate;
    ComDelDate = comDelDate;
    ComUpDate = comUpDate;
    ComStartDate = comStartDate;
    ComEndDate = comEndDate;
  }

  public CommunityVo(int comIdx, int comCateIdx, int MIdx, int comToCount, int comintoDate, String comTitle, String comContent, String comRegDate, String comDelDate, String comUpDate, String comStartDate, String comEndDate, int memberCount) {
    ComIdx = comIdx;
    ComCateIdx = comCateIdx;
    this.MIdx = MIdx;
    ComToCount = comToCount;
    ComintoDate = comintoDate;
    ComTitle = comTitle;
    ComContent = comContent;
    ComRegDate = comRegDate;
    ComDelDate = comDelDate;
    ComUpDate = comUpDate;
    ComStartDate = comStartDate;
    ComEndDate = comEndDate;
    MemberCount = memberCount;
  }

  public int getComIdx() {
    return ComIdx;
  }

  public void setComIdx(int comIdx) {
    ComIdx = comIdx;
  }

  public int getComCateIdx() {
    return ComCateIdx;
  }

  public void setComCateIdx(int comCateIdx) {
    ComCateIdx = comCateIdx;
  }

  public int getMIdx() {
    return MIdx;
  }

  public void setMIdx(int MIdx) {
    this.MIdx = MIdx;
  }

  public int getComToCount() {
    return ComToCount;
  }

  public void setComToCount(int comToCount) {
    ComToCount = comToCount;
  }

  public int getComintoDate() {
    return ComintoDate;
  }

  public void setComintoDate(int comintoDate) {
    ComintoDate = comintoDate;
  }

  public String getComTitle() {
    return ComTitle;
  }

  public void setComTitle(String comTitle) {
    ComTitle = comTitle;
  }

  public String getComContent() {
    return ComContent;
  }

  public void setComContent(String comContent) {
    ComContent = comContent;
  }

  public String getComRegDate() {
    return ComRegDate;
  }

  public void setComRegDate(String comRegDate) {
    ComRegDate = comRegDate;
  }

  public String getComDelDate() {
    return ComDelDate;
  }

  public void setComDelDate(String comDelDate) {
    ComDelDate = comDelDate;
  }

  public String getComUpDate() {
    return ComUpDate;
  }

  public void setComUpDate(String comUpDate) {
    ComUpDate = comUpDate;
  }

  public String getComStartDate() {
    return ComStartDate;
  }

  public void setComStartDate(String comStartDate) {
    ComStartDate = comStartDate;
  }

  public String getComEndDate() {
    return ComEndDate;
  }

  public void setComEndDate(String comEndDate) {
    ComEndDate = comEndDate;
  }

  public String getComplace() {
    return Complace;
  }

  public void setComplace(String complace) {
    Complace = complace;
  }

  public int getMemberCount() {
    return MemberCount;
  }

  public void setMemberCount(int memberCount) {
    MemberCount = memberCount;
  }

  public String getTogetherMemberName() {
    return TogetherMemberName;
  }

  public void setTogetherMemberName(String togetherMemberName) {
    TogetherMemberName = togetherMemberName;
  }

  public String getTogetherMemberId() {
    return TogetherMemberId;
  }

  public void setTogetherMemberId(String togetherMemberId) {
    TogetherMemberId = togetherMemberId;
  }

  public CommunityCategoryVo getCommunityCategoryVo() {
    return communityCategoryVo;
  }

  public void setCommunityCategoryVo(CommunityCategoryVo communityCategoryVo) {
    this.communityCategoryVo = communityCategoryVo;
  }

  public MemberVo getMemberVo() {
    return memberVo;
  }

  public void setMemberVo(MemberVo memberVo) {
    this.memberVo = memberVo;
  }
}
