package com.wx.xcx.entity;

public class HouseType {
    private Integer houId;

    private String hopValue;

    public Integer getHouId() {
        return houId;
    }

    public void setHouId(Integer houId) {
        this.houId = houId;
    }

    public String getHopValue() {
        return hopValue;
    }

    public void setHopValue(String hopValue) {
        this.hopValue = hopValue == null ? null : hopValue.trim();
    }
}