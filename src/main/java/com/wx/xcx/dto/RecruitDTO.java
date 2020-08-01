package com.wx.xcx.dto;

import lombok.Data;

import java.util.Objects;
public class RecruitDTO {
    private Integer zId;

    private String zWorkContent;

    private Integer zType;

    private String zWorkRequirement;

    private String zWorkPhone;

    private Integer zStatus;

    private String zWorkSalary;

    private String zWorkEmail;

    private String zWorkAddress;

    private String zWorkPeriod;

    public Integer getzId() {
        return zId;
    }

    public void setzId(Integer zId) {
        this.zId = zId;
    }

    public String getzWorkContent() {
        return zWorkContent;
    }

    public void setzWorkContent(String zWorkContent) {
        this.zWorkContent = zWorkContent;
    }

    public Integer getzType() {
        return zType;
    }

    public void setzType(Integer zType) {
        this.zType = zType;
    }

    public String getzWorkRequirement() {
        return zWorkRequirement;
    }

    public void setzWorkRequirement(String zWorkRequirement) {
        this.zWorkRequirement = zWorkRequirement;
    }

    public String getzWorkPhone() {
        return zWorkPhone;
    }

    public void setzWorkPhone(String zWorkPhone) {
        this.zWorkPhone = zWorkPhone;
    }

    public Integer getzStatus() {
        return zStatus;
    }

    public void setzStatus(Integer zStatus) {
        this.zStatus = zStatus;
    }

    public String getzWorkSalary() {
        return zWorkSalary;
    }

    public void setzWorkSalary(String zWorkSalary) {
        this.zWorkSalary = zWorkSalary;
    }

    public String getzWorkEmail() {
        return zWorkEmail;
    }

    public void setzWorkEmail(String zWorkEmail) {
        this.zWorkEmail = zWorkEmail;
    }

    public String getzWorkAddress() {
        return zWorkAddress;
    }

    public void setzWorkAddress(String zWorkAddress) {
        this.zWorkAddress = zWorkAddress;
    }

    public String getzWorkPeriod() {
        return zWorkPeriod;
    }

    public void setzWorkPeriod(String zWorkPeriod) {
        this.zWorkPeriod = zWorkPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecruitDTO)) return false;
        RecruitDTO that = (RecruitDTO) o;
        return Objects.equals(getzId(), that.getzId()) &&
                Objects.equals(getzWorkContent(), that.getzWorkContent()) &&
                Objects.equals(getzType(), that.getzType()) &&
                Objects.equals(getzWorkRequirement(), that.getzWorkRequirement()) &&
                Objects.equals(getzWorkPhone(), that.getzWorkPhone()) &&
                Objects.equals(getzStatus(), that.getzStatus()) &&
                Objects.equals(getzWorkSalary(), that.getzWorkSalary()) &&
                Objects.equals(getzWorkEmail(), that.getzWorkEmail()) &&
                Objects.equals(getzWorkAddress(), that.getzWorkAddress()) &&
                Objects.equals(getzWorkPeriod(), that.getzWorkPeriod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getzId(), getzWorkContent(), getzType(), getzWorkRequirement(), getzWorkPhone(), getzStatus(), getzWorkSalary(), getzWorkEmail(), getzWorkAddress(), getzWorkPeriod());
    }
}
