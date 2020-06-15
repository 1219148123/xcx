package com.wx.xcx.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月15日
 */
@Data
public class SwDTO {
    @ApiModelProperty(value = "sId", example = "", required = false, dataType = "Integer")
    private Integer sId;

    @ApiModelProperty(value = "失物招领标题", example = "", required = true, dataType = "String")
    private Integer sTitle;

    @ApiModelProperty(value = "失物招领类型", example = "", required = false, dataType = "Integer")
    private Integer sType;

    @ApiModelProperty(value = "失物招领内容", example = "", required = true, dataType = "String")
    private String sContent;

    @ApiModelProperty(value = "失物招领联系电话", example = "", required = true, dataType = "String")
    private String sPhone;

    @ApiModelProperty(value = "失物招领人", example = "", required = true, dataType = "String")
    private String sPeople;
}
