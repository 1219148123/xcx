package com.wx.xcx.entity;

public class Education {
    private Integer eduId;

    private String eduValue;

    public Integer getEduId() {
        return eduId;
    }

    public void setEduId(Integer eduId) {
        this.eduId = eduId;
    }

    public String getEduValue() {
        return eduValue;
    }

    public void setEduValue(String eduValue) {
        this.eduValue = eduValue == null ? null : eduValue.trim();
    }
}