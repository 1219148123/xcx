package com.wx.xcx.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月15日
 */
@Data
public class SwVO {
    private Integer sId;

    private Integer sTitle;

    private Integer sType;

    private String sContent;

    private String sPhone;

    private String sPeople;

    private Date sTime;

    private String sImg;

    private Integer sOwner;

    private Integer sStatus;
}
