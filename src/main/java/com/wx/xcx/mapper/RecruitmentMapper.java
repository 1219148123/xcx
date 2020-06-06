package com.wx.xcx.mapper;

import com.wx.xcx.entity.Recruitment;

public interface RecruitmentMapper {
    //发布信息
    int insert(Recruitment record);

    //删除信息
    int delete(Integer zid);

    //修改信息
    int update(Recruitment recruitment);
}