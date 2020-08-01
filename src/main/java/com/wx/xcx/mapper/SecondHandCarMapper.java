package com.wx.xcx.mapper;

import com.wx.xcx.entity.SecondHandCar;
import com.wx.xcx.vo.SecondHandCarVO;
import io.swagger.models.auth.In;

import java.util.List;

public interface SecondHandCarMapper {
    int insert(SecondHandCar record);

    int insertSelective(SecondHandCar record);

    //1.二手车信息发布
    int carInsert(SecondHandCar secondHandCar);

    //2.二手车信息详情查看
    SecondHandCarVO carDetail(SecondHandCar secondHandCar);

    //3.二手车信息列表
    List<SecondHandCarVO> carList(Integer carType);
}