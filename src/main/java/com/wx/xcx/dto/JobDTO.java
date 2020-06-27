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
public class JobDTO {
    @ApiModelProperty(value = "jId", example = "", required = false, dataType = "Integer")
    private Integer qId;

    @ApiModelProperty(value = "求职标题", example = "", required = true, dataType = "String")
    private String qTitle;

    @ApiModelProperty(value = "求职类型", example = "", required = false, dataType = "Integer")
    private Integer qType;

    @ApiModelProperty(value = "求职内容", example = "", required = true, dataType = "String")
    private String qContent;

    @ApiModelProperty(value = "求职工资", example = "", required = true, dataType = "Double")
    private Double qMoney;
}
