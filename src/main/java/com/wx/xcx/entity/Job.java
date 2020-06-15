package com.wx.xcx.entity;

import java.util.Date;

public class Job {
    private Integer qId;

    private Integer qTitle;

    private Integer qType;

    private String qContent;

    private Date qTime;

    private String qImg;

    private Integer qOwner;

    private Integer qStatus;

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public Integer getqTitle() {
        return qTitle;
    }

    public void setqTitle(Integer qTitle) {
        this.qTitle = qTitle;
    }

    public Integer getqType() {
        return qType;
    }

    public void setqType(Integer qType) {
        this.qType = qType;
    }

    public String getqContent() {
        return qContent;
    }

    public void setqContent(String qContent) {
        this.qContent = qContent == null ? null : qContent.trim();
    }

    public Date getqTime() {
        return qTime;
    }

    public void setqTime(Date qTime) {
        this.qTime = qTime;
    }

    public String getqImg() {
        return qImg;
    }

    public void setqImg(String qImg) {
        this.qImg = qImg == null ? null : qImg.trim();
    }

    public Integer getqOwner() {
        return qOwner;
    }

    public void setqOwner(Integer qOwner) {
        this.qOwner = qOwner;
    }

    public Integer getqStatus() {
        return qStatus;
    }

    public void setqStatus(Integer qStatus) {
        this.qStatus = qStatus;
    }
}