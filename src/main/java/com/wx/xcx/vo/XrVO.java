package com.wx.xcx.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月16日
 */
@Data
public class XrVO {
    private Integer xId;

    private Integer xTitle;

    private String xPhone;

    private String xPeople;

    private String xContent;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date xTime;

    private String xImg;

    private Integer xOwner;

    private Integer xStatus;
}
