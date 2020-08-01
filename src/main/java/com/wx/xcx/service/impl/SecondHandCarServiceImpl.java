package com.wx.xcx.service.impl;

import com.wx.xcx.dto.SecondHandCarDTO;
import com.wx.xcx.entity.SecondHandCar;
import com.wx.xcx.mapper.SecondHandCarMapper;
import com.wx.xcx.service.SecondHandCarService;
import com.wx.xcx.vo.SecondHandCarVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class SecondHandCarServiceImpl implements SecondHandCarService {
    @Resource
    SecondHandCarMapper secondHandCarMapper;
    @Override
    public int carInsert(SecondHandCarDTO secondHandCarDTO) {
        SecondHandCar secondHandCar = new SecondHandCar();
        BeanUtils.copyProperties(secondHandCarDTO,secondHandCar);
        secondHandCar.setCarTime(new Date());
        return secondHandCarMapper.carInsert(secondHandCar);
    }

    @Override
    public SecondHandCarVO carDetail(SecondHandCarDTO secondHandCarDTO) {
        SecondHandCar secondHandCar = new SecondHandCar();
        BeanUtils.copyProperties(secondHandCarDTO,secondHandCar);
        return secondHandCarMapper.carDetail(secondHandCar);
    }

    @Override
    public List<SecondHandCarVO> carList(Integer carType) {
        return secondHandCarMapper.carList(carType);
    }
}
