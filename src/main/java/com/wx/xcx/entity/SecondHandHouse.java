package com.wx.xcx.entity;

import java.util.Date;

public class SecondHandHouse {
    private Integer hId;

    private String hAddress;

    private String hPhone;

    private String hPeople;

    private String hContent;

    private Date hTime;

    private String hImg;

    private Integer hStatus;

    private String hMoney;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String gethAddress() {
        return hAddress;
    }

    public void sethAddress(String hAddress) {
        this.hAddress = hAddress == null ? null : hAddress.trim();
    }

    public String gethPhone() {
        return hPhone;
    }

    public void sethPhone(String hPhone) {
        this.hPhone = hPhone == null ? null : hPhone.trim();
    }

    public String gethPeople() {
        return hPeople;
    }

    public void sethPeople(String hPeople) {
        this.hPeople = hPeople == null ? null : hPeople.trim();
    }

    public String gethContent() {
        return hContent;
    }

    public void sethContent(String hContent) {
        this.hContent = hContent == null ? null : hContent.trim();
    }

    public Date gethTime() {
        return hTime;
    }

    public void sethTime(Date hTime) {
        this.hTime = hTime;
    }

    public String gethImg() {
        return hImg;
    }

    public void sethImg(String hImg) {
        this.hImg = hImg == null ? null : hImg.trim();
    }

    public Integer gethStatus() {
        return hStatus;
    }

    public void sethStatus(Integer hStatus) {
        this.hStatus = hStatus;
    }

    public String gethMoney() {
        return hMoney;
    }

    public void sethMoney(String hMoney) {
        this.hMoney = hMoney == null ? null : hMoney.trim();
    }
}