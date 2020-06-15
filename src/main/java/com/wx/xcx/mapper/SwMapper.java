package com.wx.xcx.mapper;

import com.wx.xcx.entity.Job;
import com.wx.xcx.entity.Sw;
import com.wx.xcx.vo.JobVO;
import com.wx.xcx.vo.SwVO;

import java.util.List;

public interface SwMapper {
    //1.发布失物招领
    int insert(Sw sw);
    //2.删除求职
    int deleteSw(Integer sid);
    //3.修改求职
    int updateSw(Sw sw);
    //4.查询所有求职
    List<SwVO> getAllSw();
    //5.查询单个求职
    SwVO getSwBySid(Integer sid);
}