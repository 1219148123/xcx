package com.wx.xcx.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    private String sTitle;

    private Integer sType;

    private String sContent;

    private String sPhone;

    private String sPeople;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date sTime;

    private String sImg;

    private Integer sOwner;

    private Integer sStatus;

    private Double sMoney;
}
