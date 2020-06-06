package com.wx.xcx.entity;

import java.util.Date;

public class Recruitment {
    private Integer zId;

    private String zTitle;

    private Integer zType;

    private String zContent;

    private Date zTime;

    private String zImg;

    private Integer zOwner;

    private Integer zStatus;

    public Integer getzId() {
        return zId;
    }

    public void setzId(Integer zId) {
        this.zId = zId;
    }

    public String getzTitle() {
        return zTitle;
    }

    public void setzTitle(String zTitle) {
        this.zTitle = zTitle == null ? null : zTitle.trim();
    }

    public Integer getzType() {
        return zType;
    }

    public void setzType(Integer zType) {
        this.zType = zType;
    }

    public String getzContent() {
        return zContent;
    }

    public void setzContent(String zContent) {
        this.zContent = zContent == null ? null : zContent.trim();
    }

    public Date getzTime() {
        return zTime;
    }

    public void setzTime(Date zTime) {
        this.zTime = zTime;
    }

    public String getzImg() {
        return zImg;
    }

    public void setzImg(String zImg) {
        this.zImg = zImg == null ? null : zImg.trim();
    }

    public Integer getzOwner() {
        return zOwner;
    }

    public void setzOwner(Integer zOwner) {
        this.zOwner = zOwner;
    }

    public Integer getzStatus() {
        return zStatus;
    }

    public void setzStatus(Integer zStatus) {
        this.zStatus = zStatus;
    }
}