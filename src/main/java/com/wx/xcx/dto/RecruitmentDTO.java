package com.wx.xcx.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月05日
 */
@Data
public class RecruitmentDTO {
    @ApiModelProperty(value = "zId", example = "", required = false, dataType = "Integer")
    private Integer zId;

    @NotBlank(message = "招聘标题,不能为空")
    @ApiModelProperty(value = "招聘标题", example = "", required = true, dataType = "String")
    private String zTitle;

    @NotNull(message = "招聘类型,不能为空")
    @ApiModelProperty(value = "招聘类型", example = "", required = false, dataType = "Integer")
    private Integer zType;

    @NotBlank(message = "招聘内容,不能为空")
    @ApiModelProperty(value = "招聘内容", example = "", required = true, dataType = "String")
    private String zContent;

//    private Integer zOwner;
}
