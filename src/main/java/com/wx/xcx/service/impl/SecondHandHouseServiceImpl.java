package com.wx.xcx.service.impl;

import com.wx.xcx.dto.SecondHandHouseDTO;
import com.wx.xcx.entity.SecondHandHouse;
import com.wx.xcx.mapper.SecondHandHouseMapper;
import com.wx.xcx.service.SecondHandHouseService;
import com.wx.xcx.vo.SecondHandHouseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class SecondHandHouseServiceImpl implements SecondHandHouseService {
    @Resource
    SecondHandHouseMapper secondHandHouseMapper;
    @Override
    public int houstInsert(SecondHandHouseDTO secondHandHouseDTO) {
        SecondHandHouse secondHandHouse = new SecondHandHouse();
        BeanUtils.copyProperties(secondHandHouseDTO,secondHandHouse);
        secondHandHouse.sethTime(new Date());
        return secondHandHouseMapper.houstInsert(secondHandHouse);
    }

    @Override
    public SecondHandHouseVO houseDetail(SecondHandHouseDTO secondHandHouseDTO) {
        SecondHandHouse secondHandHouse = new SecondHandHouse();
        BeanUtils.copyProperties(secondHandHouseDTO,secondHandHouse);
        return secondHandHouseMapper.houseDetail(secondHandHouse);
    }

    @Override
    public List<SecondHandHouseVO> houseList(Integer houType) {
        return secondHandHouseMapper.houseList(houType);
    }
}
