package com.wx.xcx.service;

import com.wx.xcx.dto.RecruitDTO;
import com.wx.xcx.vo.RecruitVO;

import java.util.List;

public interface RecruitService {
    //插入招聘
    int insertRecruit(RecruitDTO recruitDTO) ;

    //招聘详情
    RecruitVO recruitDetail(RecruitDTO recruitDTO);

    //查询招聘和类型
    List<RecruitVO> recruitList(Integer workIdInt);
}
