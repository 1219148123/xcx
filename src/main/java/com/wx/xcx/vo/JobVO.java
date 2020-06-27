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
public class JobVO {
    private Integer qId;

    private String qTitle;

    private Integer qType;

    private String qContent;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date qTime;

    private String qImg;

    private Integer qOwner;

    private Integer qStatus;

    private Double qMoney;
}
