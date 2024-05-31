package com.project.SnakeProject.vo;

public class StudyInPareVo {
    int SCIdx;
    String SIPName;
    int SIPPrice;

    public StudyInPareVo(String SIPName) {
        this.SIPName = SIPName;
    }

    public StudyInPareVo(String SIPName, int SIPPrice) {
        this.SIPName = SIPName;
        this.SIPPrice = SIPPrice;
    }

    public int getSCIdx() {
        return SCIdx;
    }

    public void setSCIdx(int SCIdx) {
        this.SCIdx = SCIdx;
    }

    public String getSIPName() {
        return SIPName;
    }

    public void setSIPName(String SIPName) {
        this.SIPName = SIPName;
    }

    public int getSIPPrice() {
        return SIPPrice;
    }

    public void setSIPPrice(int SIPPrice) {
        this.SIPPrice = SIPPrice;
    }
}
