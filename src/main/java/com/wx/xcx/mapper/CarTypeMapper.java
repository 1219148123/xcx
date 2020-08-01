package com.wx.xcx.mapper;

import com.wx.xcx.entity.CarType;

public interface CarTypeMapper {
    int insert(CarType record);

    int insertSelective(CarType record);
}