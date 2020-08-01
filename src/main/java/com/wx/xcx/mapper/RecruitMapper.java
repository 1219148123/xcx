package com.wx.xcx.mapper;

import com.wx.xcx.entity.Recruit;
import com.wx.xcx.vo.RecruitVO;

import java.util.List;

public interface RecruitMapper {
    int insert(Recruit record);

    int insertSelective(Recruit record);

    //插入招聘
    int insertRecruit(Recruit recruit) ;

    //招聘详情
    RecruitVO recruitDetail(Recruit recruit);

    //查询招聘和类型
    List<RecruitVO> recruitList();
}