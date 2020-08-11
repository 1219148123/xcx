package com.wx.xcx.mapper;

import com.wx.xcx.entity.CarType;

import java.util.List;

public interface CarTypeMapper {
    int insert(CarType record);

    int insertSelective(CarType record);

    List<CarType> carTypeList();
}