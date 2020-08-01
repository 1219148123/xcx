package com.wx.xcx.entity;

import java.util.Date;

public class SecondHandCar {
    private Integer carId;

    private String carAge;

    private Integer carType;

    private String carKilometre;

    private String carPhone;

    private String carPeople;

    private Date carTime;

    private String carImg;

    private Integer carStatus;

    private String carOriginalPrice;

    private String carNowPrice;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarAge() {
        return carAge;
    }

    public void setCarAge(String carAge) {
        this.carAge = carAge == null ? null : carAge.trim();
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public String getCarKilometre() {
        return carKilometre;
    }

    public void setCarKilometre(String carKilometre) {
        this.carKilometre = carKilometre == null ? null : carKilometre.trim();
    }

    public String getCarPhone() {
        return carPhone;
    }

    public void setCarPhone(String carPhone) {
        this.carPhone = carPhone == null ? null : carPhone.trim();
    }

    public String getCarPeople() {
        return carPeople;
    }

    public void setCarPeople(String carPeople) {
        this.carPeople = carPeople == null ? null : carPeople.trim();
    }

    public Date getCarTime() {
        return carTime;
    }

    public void setCarTime(Date carTime) {
        this.carTime = carTime;
    }

    public String getCarImg() {
        return carImg;
    }

    public void setCarImg(String carImg) {
        this.carImg = carImg == null ? null : carImg.trim();
    }

    public Integer getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Integer carStatus) {
        this.carStatus = carStatus;
    }

    public String getCarOriginalPrice() {
        return carOriginalPrice;
    }

    public void setCarOriginalPrice(String carOriginalPrice) {
        this.carOriginalPrice = carOriginalPrice == null ? null : carOriginalPrice.trim();
    }

    public String getCarNowPrice() {
        return carNowPrice;
    }

    public void setCarNowPrice(String carNowPrice) {
        this.carNowPrice = carNowPrice == null ? null : carNowPrice.trim();
    }
}