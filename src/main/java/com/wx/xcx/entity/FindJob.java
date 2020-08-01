package com.wx.xcx.entity;

import java.util.Date;

public class FindJob {
    private Integer qId;

    private String selfAbility;

    private Integer qType;

    private String expectedSalary;

    private Date qTime;

    private String selfEmail;

    private String selfPhone;

    private Integer qStatus;

    private String selfName;

    private Integer eduId;

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getSelfAbility() {
        return selfAbility;
    }

    public void setSelfAbility(String selfAbility) {
        this.selfAbility = selfAbility == null ? null : selfAbility.trim();
    }

    public Integer getqType() {
        return qType;
    }

    public void setqType(Integer qType) {
        this.qType = qType;
    }

    public String getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(String expectedSalary) {
        this.expectedSalary = expectedSalary == null ? null : expectedSalary.trim();
    }

    public Date getqTime() {
        return qTime;
    }

    public void setqTime(Date qTime) {
        this.qTime = qTime;
    }

    public String getSelfEmail() {
        return selfEmail;
    }

    public void setSelfEmail(String selfEmail) {
        this.selfEmail = selfEmail == null ? null : selfEmail.trim();
    }

    public String getSelfPhone() {
        return selfPhone;
    }

    public void setSelfPhone(String selfPhone) {
        this.selfPhone = selfPhone == null ? null : selfPhone.trim();
    }

    public Integer getqStatus() {
        return qStatus;
    }

    public void setqStatus(Integer qStatus) {
        this.qStatus = qStatus;
    }

    public String getSelfName() {
        return selfName;
    }

    public void setSelfName(String selfName) {
        this.selfName = selfName == null ? null : selfName.trim();
    }

    public Integer getEduId() {
        return eduId;
    }

    public void setEduId(Integer eduId) {
        this.eduId = eduId;
    }
}