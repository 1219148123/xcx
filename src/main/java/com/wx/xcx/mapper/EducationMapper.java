package com.wx.xcx.mapper;

import com.wx.xcx.entity.Education;

import java.util.List;

public interface EducationMapper {
    int insert(Education record);

    int insertSelective(Education record);

    List<Education> eduTypeList();
}