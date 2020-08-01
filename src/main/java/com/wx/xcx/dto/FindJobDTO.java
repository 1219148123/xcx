package com.wx.xcx.dto;

import java.util.Objects;

public class FindJobDTO {
    private Integer qId;

    private String selfAbility;

    private Integer qType;

    private String expectedSalary;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FindJobDTO)) return false;
        FindJobDTO that = (FindJobDTO) o;
        return Objects.equals(getqId(), that.getqId()) &&
                Objects.equals(getSelfAbility(), that.getSelfAbility()) &&
                Objects.equals(getqType(), that.getqType()) &&
                Objects.equals(getExpectedSalary(), that.getExpectedSalary()) &&
                Objects.equals(getSelfEmail(), that.getSelfEmail()) &&
                Objects.equals(getSelfPhone(), that.getSelfPhone()) &&
                Objects.equals(getqStatus(), that.getqStatus()) &&
                Objects.equals(getSelfName(), that.getSelfName()) &&
                Objects.equals(getEduId(), that.getEduId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getqId(), getSelfAbility(), getqType(), getExpectedSalary(), getSelfEmail(), getSelfPhone(), getqStatus(), getSelfName(), getEduId());
    }
}
