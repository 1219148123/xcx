package com.wx.xcx.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月16日
 */
@Data
public class XrDTO {
    @ApiModelProperty(value = "xId", example = "", required = false, dataType = "Integer")
    private Integer xId;

    @ApiModelProperty(value = "售房标题", example = "", required = true, dataType = "String")
    private String xTitle;

    @ApiModelProperty(value = "售房联系人电话", example = "", required = true, dataType = "String")
    private String xPhone;

    @ApiModelProperty(value = "售房联系人联系人", example = "", required = true, dataType = "String")
    private String xPeople;

    @ApiModelProperty(value = "售房内容", example = "", required = true, dataType = "String")
    private String xContent;

    @ApiModelProperty(value = "房价", example = "", required = true, dataType = "Double")
    private Double xMoney;
}
