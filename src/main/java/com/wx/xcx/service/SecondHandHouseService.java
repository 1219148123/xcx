package com.wx.xcx.service;

import com.wx.xcx.dto.SecondHandHouseDTO;
import com.wx.xcx.vo.SecondHandHouseVO;

import java.util.List;

public interface SecondHandHouseService {
    //1.发布房子信息
    int houstInsert(SecondHandHouseDTO secondHandHouseDTO);

    //2.查看房子详情
    SecondHandHouseVO houseDetail(SecondHandHouseDTO secondHandHouseDTO);

    //3.查看房子列表
    List<SecondHandHouseVO> houseList(Integer houType);
}
