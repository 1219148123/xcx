package com.wx.xcx.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Xr {
    private Integer xId;

    private String xTitle;

    private String xPhone;

    private String xPeople;

    private String xContent;

    private Date xTime;

    private String xImg;

    private Integer xOwner;

    private Integer xStatus;

    private Double xMoney;

    public Integer getxId() {
        return xId;
    }

    public void setxId(Integer xId) {
        this.xId = xId;
    }

    public void setxTitle(String xTitle) {
        this.xTitle = xTitle;
    }

    public Double getxMoney() {
        return xMoney;
    }

    public void setxMoney(Double xMoney) {
        this.xMoney = xMoney;
    }

    public String getxPhone() {
        return xPhone;
    }

    public void setxPhone(String xPhone) {
        this.xPhone = xPhone == null ? null : xPhone.trim();
    }

    public String getxPeople() {
        return xPeople;
    }

    public void setxPeople(String xPeople) {
        this.xPeople = xPeople == null ? null : xPeople.trim();
    }

    public String getxContent() {
        return xContent;
    }

    public void setxContent(String xContent) {
        this.xContent = xContent == null ? null : xContent.trim();
    }

    public Date getxTime() {
        return xTime;
    }

    public void setxTime(Date xTime) {
        this.xTime = xTime;
    }

    public String getxImg() {
        return xImg;
    }

    public void setxImg(String xImg) {
        this.xImg = xImg == null ? null : xImg.trim();
    }

    public Integer getxOwner() {
        return xOwner;
    }

    public void setxOwner(Integer xOwner) {
        this.xOwner = xOwner;
    }

    public Integer getxStatus() {
        return xStatus;
    }

    public void setxStatus(Integer xStatus) {
        this.xStatus = xStatus;
    }
}