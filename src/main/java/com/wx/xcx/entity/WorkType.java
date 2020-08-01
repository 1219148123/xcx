package com.wx.xcx.entity;

public class WorkType {
    private Integer workTypeId;

    private String workTypeValue;

    public Integer getWorkTypeId() {
        return workTypeId;
    }

    public void setWorkTypeId(Integer workTypeId) {
        this.workTypeId = workTypeId;
    }

    public String getWorkTypeValue() {
        return workTypeValue;
    }

    public void setWorkTypeValue(String workTypeValue) {
        this.workTypeValue = workTypeValue == null ? null : workTypeValue.trim();
    }
}