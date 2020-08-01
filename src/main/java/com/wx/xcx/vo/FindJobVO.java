package com.wx.xcx.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wx.xcx.entity.Education;
import com.wx.xcx.entity.WorkType;

import java.util.Date;

public class FindJobVO {
    private Integer qId;

    private String selfAbility;

    private Integer qType;

    private String expectedSalary;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date qTime;

    private String selfEmail;

    private String selfPhone;

    private Integer qStatus;

    private String selfName;

    private Integer eduId;

    private Education education;

    private WorkType workType;

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

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
        this.selfAbility = selfAbility;
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
        this.expectedSalary = expectedSalary;
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
        this.selfEmail = selfEmail;
    }

    public String getSelfPhone() {
        return selfPhone;
    }

    public void setSelfPhone(String selfPhone) {
        this.selfPhone = selfPhone;
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
        this.selfName = selfName;
    }

    public Integer getEduId() {
        return eduId;
    }

    public void setEduId(Integer eduId) {
        this.eduId = eduId;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }
}
