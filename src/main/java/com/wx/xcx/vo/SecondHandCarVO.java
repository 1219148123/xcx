package com.wx.xcx.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wx.xcx.entity.CarType;

import java.util.Date;

public class SecondHandCarVO {
    private Integer carId;

    private String carAge;

    private Integer carType;

    private String carKilometre;

    private String carPhone;

    private String carPeople;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date carTime;

    private String carImg;

    private Integer carStatus;

    private String carOriginalPrice;

    private String carNowPrice;

    private CarType type;

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

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
        this.carAge = carAge;
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
        this.carKilometre = carKilometre;
    }

    public String getCarPhone() {
        return carPhone;
    }

    public void setCarPhone(String carPhone) {
        this.carPhone = carPhone;
    }

    public String getCarPeople() {
        return carPeople;
    }

    public void setCarPeople(String carPeople) {
        this.carPeople = carPeople;
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
        this.carImg = carImg;
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
        this.carOriginalPrice = carOriginalPrice;
    }

    public String getCarNowPrice() {
        return carNowPrice;
    }

    public void setCarNowPrice(String carNowPrice) {
        this.carNowPrice = carNowPrice;
    }
}
