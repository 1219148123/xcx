package com.wx.xcx.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wx.xcx.entity.WorkType;

import java.util.Date;

/**
 * 招聘信息返回实体类
 */
public class RecruitVO {
    private Integer zId;

    private String zWorkContent;

    private Integer zType;

    private String zWorkRequirement;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date zTime;

    private String zWorkPhone;

    private Integer zStatus;

    private String zWorkSalary;

    private String zWorkEmail;

    private String zWorkAddress;

    private String zWorkPeriod;

    private WorkType workType;

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

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
        this.zWorkContent = zWorkContent == null ? null : zWorkContent.trim();
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
        this.zWorkRequirement = zWorkRequirement == null ? null : zWorkRequirement.trim();
    }

    public Date getzTime() {
        return zTime;
    }

    public void setzTime(Date zTime) {
        this.zTime = zTime;
    }

    public String getzWorkPhone() {
        return zWorkPhone;
    }

    public void setzWorkPhone(String zWorkPhone) {
        this.zWorkPhone = zWorkPhone == null ? null : zWorkPhone.trim();
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
        this.zWorkSalary = zWorkSalary == null ? null : zWorkSalary.trim();
    }

    public String getzWorkEmail() {
        return zWorkEmail;
    }

    public void setzWorkEmail(String zWorkEmail) {
        this.zWorkEmail = zWorkEmail == null ? null : zWorkEmail.trim();
    }

    public String getzWorkAddress() {
        return zWorkAddress;
    }

    public void setzWorkAddress(String zWorkAddress) {
        this.zWorkAddress = zWorkAddress == null ? null : zWorkAddress.trim();
    }

    public String getzWorkPeriod() {
        return zWorkPeriod;
    }

    public void setzWorkPeriod(String zWorkPeriod) {
        this.zWorkPeriod = zWorkPeriod == null ? null : zWorkPeriod.trim();
    }
}
