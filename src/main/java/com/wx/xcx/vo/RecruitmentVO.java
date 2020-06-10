package com.wx.xcx.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date zTime;

    private String zImg;

    private Integer zOwner;

    private Integer zStatus;
}
