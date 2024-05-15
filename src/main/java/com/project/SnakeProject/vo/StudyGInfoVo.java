package com.project.SnakeProject.vo;

public class StudyGInfoVo {
  int SGIIdx, SCIdx, SGINum;
  String SGIUseState, SGIContent1, SGIContent2, SGIContent3, SGIContent4;

  public StudyGInfoVo(int SGIIdx, int SCIdx, int SGINum, String SGIUseState, String SGIContent1, String SGIContent2, String SGIContent3, String SGIContent4) {
    this.SGIIdx = SGIIdx;
    this.SCIdx = SCIdx;
    this.SGINum = SGINum;
    this.SGIUseState = SGIUseState;
    this.SGIContent1 = SGIContent1;
    this.SGIContent2 = SGIContent2;
    this.SGIContent3 = SGIContent3;
    this.SGIContent4 = SGIContent4;
  }

  public int getSGIIdx() {
    return SGIIdx;
  }

  public void setSGIIdx(int SGIIdx) {
    this.SGIIdx = SGIIdx;
  }

  public int getSCIdx() {
    return SCIdx;
  }

  public void setSCIdx(int SCIdx) {
    this.SCIdx = SCIdx;
  }

  public int getSGINum() {
    return SGINum;
  }

  public void setSGINum(int SGINum) {
    this.SGINum = SGINum;
  }

  public String getSGIUseState() {
    return SGIUseState;
  }

  public void setSGIUseState(String SGIUseState) {
    this.SGIUseState = SGIUseState;
  }

  public String getSGIContent1() {
    return SGIContent1;
  }

  public void setSGIContent1(String SGIContent1) {
    this.SGIContent1 = SGIContent1;
  }

  public String getSGIContent2() {
    return SGIContent2;
  }

  public void setSGIContent2(String SGIContent2) {
    this.SGIContent2 = SGIContent2;
  }

  public String getSGIContent3() {
    return SGIContent3;
  }

  public void setSGIContent3(String SGIContent3) {
    this.SGIContent3 = SGIContent3;
  }

  public String getSGIContent4() {
    return SGIContent4;
  }

  public void setSGIContent4(String SGIContent4) {
    this.SGIContent4 = SGIContent4;
  }
}
