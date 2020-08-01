package com.wx.xcx.mapper;

import com.wx.xcx.entity.Education;

public interface EducationMapper {
    int insert(Education record);

    int insertSelective(Education record);
}