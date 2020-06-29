package com.wx.xcx.mapper;

import com.wx.xcx.entity.Job;
import com.wx.xcx.entity.Sw;
import com.wx.xcx.vo.JobVO;
import com.wx.xcx.vo.SwVO;

import java.util.List;

public interface SwMapper {
    //1.发布二手信息
    int insert(Sw sw);
    //2.删除二手信息
    int deleteSw(Integer sid);
    //3.修改二手信息
    int updateSw(Sw sw);
    //4.查询所有二手信息
    List<SwVO> getAllSw();
    //5.查询单个二手信息
    SwVO getSwBySid(Integer sid);

    void updateImg(Sw sw);
}