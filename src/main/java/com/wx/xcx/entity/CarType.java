package com.wx.xcx.entity;

public class CarType {
    private Integer carTypeId;

    private String carTypeValue;

    public Integer getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getCarTypeValue() {
        return carTypeValue;
    }

    public void setCarTypeValue(String carTypeValue) {
        this.carTypeValue = carTypeValue == null ? null : carTypeValue.trim();
    }
}