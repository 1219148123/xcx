package com.wx.xcx.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月16日
 */
public class XrDTO {
    @ApiModelProperty(value = "xId", example = "", required = false, dataType = "Integer")
    private Integer xId;

    @ApiModelProperty(value = "寻人启事标题", example = "", required = true, dataType = "String")
    private Integer xTitle;

    @ApiModelProperty(value = "寻人启事电话", example = "", required = true, dataType = "String")
    private String xPhone;

    @ApiModelProperty(value = "寻人启事联系人", example = "", required = true, dataType = "String")
    private String xPeople;

    @ApiModelProperty(value = "寻人启事内容", example = "", required = true, dataType = "String")
    private String xContent;
}
