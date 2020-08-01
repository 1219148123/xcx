package com.wx.xcx.mapper;

import com.wx.xcx.entity.WorkType;

public interface WorkTypeMapper {
    int insert(WorkType record);

    int insertSelective(WorkType record);
}