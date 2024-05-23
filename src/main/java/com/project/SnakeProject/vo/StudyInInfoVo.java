package com.project.SnakeProject.vo;

public class StudyInInfoVo {
  int  SCIdx, SIINum;
  String SeatUseState;

  public StudyInInfoVo(int SCIdx, int SIINum, String SeatUseState) {
    this.SCIdx = SCIdx;
    this.SIINum = SIINum;
    this.SeatUseState = SeatUseState;
  }


  public int getSCIdx() {
    return SCIdx;
  }

  public void setSCIdx(int SCIdx) {
    this.SCIdx = SCIdx;
  }

  public int getSIINum() {
    return SIINum;
  }

  public void setSIINum(int SIINum) {
    this.SIINum = SIINum;
  }

  public String getSeatUseState() {
    return SeatUseState;
  }

  public void setSeatUseState(String seatUseState) {
    SeatUseState = seatUseState;
  }
}
