package com.wx.xcx.controller;

import com.wx.xcx.entity.CarType;
import com.wx.xcx.entity.Education;
import com.wx.xcx.entity.WorkType;
import com.wx.xcx.mapper.CarTypeMapper;
import com.wx.xcx.mapper.EducationMapper;
import com.wx.xcx.mapper.WorkTypeMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeController {
    @Resource
    WorkTypeMapper workTypeMapper;
    @Resource
    CarTypeMapper carTypeMapper;
    @Resource
    EducationMapper educationMapper;

    @GetMapping("/workType")
    public List<WorkType> workTypes() {
        return workTypeMapper.workTypeList();
    }

    @GetMapping("/carType")
    public List<CarType> carTypes() {
        return carTypeMapper.carTypeList();
    }

    @GetMapping("/eduType")
    public List<Education> eduTypes() {
        return educationMapper.eduTypeList();
    }
}
