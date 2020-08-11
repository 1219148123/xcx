package com.wx.xcx.mapper;

import com.wx.xcx.entity.WorkType;

import java.util.List;

public interface WorkTypeMapper {
    int insert(WorkType record);

    int insertSelective(WorkType record);

    List<WorkType> workTypeList();
}