package com.wx.xcx.mapper;

import com.wx.xcx.entity.HouseType;

import java.util.List;

public interface HouseTypeMapper {
    int insert(HouseType record);

    int insertSelective(HouseType record);

    List<HouseType> houseTypeList();
}