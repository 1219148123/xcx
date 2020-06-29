package com.wx.xcx.mapper;

import com.wx.xcx.entity.Xr;
import com.wx.xcx.vo.XrVO;

import java.util.List;

public interface XrMapper {
    //1.插入寻人启事
    int insert(Xr record);
    //2.修改寻人启事
    int updateXr(Xr record);
    //3.删除寻人启事
    int deleteXr(Integer xid);
    //4.查询单个寻人启事
    XrVO seleteOneXr(Integer xid);
    //5.查询所有得寻人启示
    List<XrVO> seleteAllXr();

    void updateImg(Xr xr);
}