package com.wx.xcx.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月05日
 */
@Data
public class RecruitmentVO {
    private Integer zId;

    private String zTitle;

    private String zType;

    private String zContent;

    private Date zTime;

    private String zImg;

    private Integer zOwner;

    private Integer zStatus;
}
