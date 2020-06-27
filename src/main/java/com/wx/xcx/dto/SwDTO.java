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

    @ApiModelProperty(value = "二手信息标题", example = "", required = true, dataType = "String")
    private String sTitle;

    @ApiModelProperty(value = "二手信息类型", example = "", required = false, dataType = "Integer")
    private Integer sType;

    @ApiModelProperty(value = "二手信息内容", example = "", required = true, dataType = "String")
    private String sContent;

    @ApiModelProperty(value = "二手联系电话", example = "", required = true, dataType = "String")
    private String sPhone;

    @ApiModelProperty(value = "二手发布人", example = "", required = true, dataType = "String")
    private String sPeople;

    @ApiModelProperty(value = "二手信息价格", example = "", required = true, dataType = "String")
    private Double sMoney;
}
