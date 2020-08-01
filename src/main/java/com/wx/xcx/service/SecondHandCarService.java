package com.wx.xcx.service;

import com.wx.xcx.dto.SecondHandCarDTO;
import com.wx.xcx.entity.SecondHandCar;
import com.wx.xcx.vo.SecondHandCarVO;

import java.util.List;

public interface SecondHandCarService {
    //1.二手车信息发布
    int carInsert(SecondHandCarDTO secondHandCarDTO);

    //2.二手车信息详情查看
    SecondHandCarVO carDetail(SecondHandCarDTO secondHandCarDTO);

    //3.二手车信息列表
    List<SecondHandCarVO> carList(Integer carType);
}
