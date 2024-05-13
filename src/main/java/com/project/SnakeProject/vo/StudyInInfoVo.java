package com.project.SnakeProject.vo;

public class StudyInInfoVo {
  int SeatNum, SCIdx, SIINum;
  String SeatUseState;

  public StudyInInfoVo(int SeatNum, int SCIdx, int SIINum, String SeatUseState) {
    this.SeatNum = SeatNum;
    this.SCIdx = SCIdx;
    this.SIINum = SIINum;
    this.SeatUseState = SeatUseState;
  }

  public int getSeatNum() {
    return SeatNum;
  }

  public void setSeatNum(int seatNum) {
    SeatNum = seatNum;
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
