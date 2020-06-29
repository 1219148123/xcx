package com.wx.xcx.mapper;

import com.wx.xcx.entity.Recruitment;
import com.wx.xcx.vo.RecruitmentVO;

import java.util.List;

public interface RecruitmentMapper {
    //发布信息
    int insert(Recruitment record);

    //删除信息
    int delete(Integer zid);

    //修改信息
    int update(Recruitment recruitment);

    //查询所有的发布信息
    List<RecruitmentVO> allRecruitment();

    //获取zp详情
    RecruitmentVO ZpDetail(Integer zid);

    void updateImg(Recruitment recruitment);
}