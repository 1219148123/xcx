package com.wx.xcx.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wx.xcx.entity.HouseType;

import java.util.Date;

public class SecondHandHouseVO {
    private Integer hId;

    private String hAddress;

    private String hType;

    private String hPhone;

    private String hPeople;

    private String hContent;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date hTime;

    private String hImg;

    private Integer hStatus;

    private String hMoney;

    private HouseType houseType;

    public String gethType() {
        return hType;
    }

    public void sethType(String hType) {
        this.hType = hType;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

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
        this.hAddress = hAddress;
    }

    public String gethPhone() {
        return hPhone;
    }

    public void sethPhone(String hPhone) {
        this.hPhone = hPhone;
    }

    public String gethPeople() {
        return hPeople;
    }

    public void sethPeople(String hPeople) {
        this.hPeople = hPeople;
    }

    public String gethContent() {
        return hContent;
    }

    public void sethContent(String hContent) {
        this.hContent = hContent;
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
        this.hImg = hImg;
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
        this.hMoney = hMoney;
    }
}
