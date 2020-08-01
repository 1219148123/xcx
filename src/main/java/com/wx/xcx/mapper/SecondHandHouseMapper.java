package com.wx.xcx.mapper;

import com.wx.xcx.entity.SecondHandHouse;
import com.wx.xcx.vo.SecondHandHouseVO;

import java.util.List;

public interface SecondHandHouseMapper {
    int insert(SecondHandHouse record);

    int insertSelective(SecondHandHouse record);

    //1.发布房子信息
    int houstInsert(SecondHandHouse secondHandHouse);

    //2.查看房子详情
    SecondHandHouseVO houseDetail(SecondHandHouse secondHandHouse);

    //3.查看房子列表
    List<SecondHandHouseVO> houseList();
}