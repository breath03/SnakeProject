package com.project.SnakeProject.vo;

public class CommunityCategoryVo {
  int ComCateIdx;
  String ComCateName, ComCateUseState;

  public CommunityCategoryVo(int ComCateIdx, String ComCateName, String ComCateUseState) {
    this.ComCateIdx = ComCateIdx;
    this.ComCateName = ComCateName;
    this.ComCateUseState = ComCateUseState;
  }

  public int getComCateIdx() {
    return ComCateIdx;
  }

  public void setComCateIdx(int comCateIdx) {
    ComCateIdx = comCateIdx;
  }

  public String getComCateName() {
    return ComCateName;
  }

  public void setComCateName(String comCateName) {
    ComCateName = comCateName;
  }

  public String getComCateUseState() {
    return ComCateUseState;
  }

  public void setComCateUseState(String comCateUseState) {
    ComCateUseState = comCateUseState;
  }
}
