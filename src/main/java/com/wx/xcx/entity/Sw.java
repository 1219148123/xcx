package com.wx.xcx.entity;

import java.util.Date;

public class Sw {
    private Integer sId;

    private Integer sTitle;

    private Integer sType;

    private String sContent;

    private String sPhone;

    private String sPeople;

    private Date sTime;

    private String sImg;

    private Integer sOwner;

    private Integer sStatus;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getsTitle() {
        return sTitle;
    }

    public void setsTitle(Integer sTitle) {
        this.sTitle = sTitle;
    }

    public Integer getsType() {
        return sType;
    }

    public void setsType(Integer sType) {
        this.sType = sType;
    }

    public String getsContent() {
        return sContent;
    }

    public void setsContent(String sContent) {
        this.sContent = sContent == null ? null : sContent.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public String getsPeople() {
        return sPeople;
    }

    public void setsPeople(String sPeople) {
        this.sPeople = sPeople == null ? null : sPeople.trim();
    }

    public Date getsTime() {
        return sTime;
    }

    public void setsTime(Date sTime) {
        this.sTime = sTime;
    }

    public String getsImg() {
        return sImg;
    }

    public void setsImg(String sImg) {
        this.sImg = sImg == null ? null : sImg.trim();
    }

    public Integer getsOwner() {
        return sOwner;
    }

    public void setsOwner(Integer sOwner) {
        this.sOwner = sOwner;
    }

    public Integer getsStatus() {
        return sStatus;
    }

    public void setsStatus(Integer sStatus) {
        this.sStatus = sStatus;
    }
}