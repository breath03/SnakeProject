package com.project.SnakeProject.vo;

import java.util.Date;

public class CommunityVo {
  int ComIdx, ComCateIdx, MIdx, ComToCount, ComintoDate;
  String ComTitle, ComContent;

  String ComRegDate, ComDelDate, ComUpDate, ComStartDate, ComEndDate;

  int MemberCount;



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

  public int getMemberCount() {
    return MemberCount;
  }

  public void setMemberCount(int memberCount) {
    MemberCount = memberCount;
  }
}
