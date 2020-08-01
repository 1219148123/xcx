package com.wx.xcx.dto;

import java.util.Objects;

public class SecondHandHouseDTO {
    private Integer hId;

    private String hAddress;

    private String hPhone;

    private String hPeople;

    private String hContent;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SecondHandHouseDTO)) return false;
        SecondHandHouseDTO that = (SecondHandHouseDTO) o;
        return Objects.equals(gethId(), that.gethId()) &&
                Objects.equals(gethAddress(), that.gethAddress()) &&
                Objects.equals(gethPhone(), that.gethPhone()) &&
                Objects.equals(gethPeople(), that.gethPeople()) &&
                Objects.equals(gethContent(), that.gethContent()) &&
                Objects.equals(gethImg(), that.gethImg()) &&
                Objects.equals(gethStatus(), that.gethStatus()) &&
                Objects.equals(gethMoney(), that.gethMoney());
    }

    @Override
    public int hashCode() {
        return Objects.hash(gethId(), gethAddress(), gethPhone(), gethPeople(), gethContent(), gethImg(), gethStatus(), gethMoney());
    }
}
