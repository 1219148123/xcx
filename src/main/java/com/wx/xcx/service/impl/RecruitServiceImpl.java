package com.wx.xcx.service.impl;

import com.wx.xcx.dto.RecruitDTO;
import com.wx.xcx.entity.Recruit;
import com.wx.xcx.mapper.RecruitMapper;
import com.wx.xcx.service.RecruitService;
import com.wx.xcx.vo.RecruitVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class RecruitServiceImpl implements RecruitService {
    @Resource
    RecruitMapper recruitMapper;
    @Override
    public int insertRecruit(RecruitDTO recruitDTO) {
        Recruit recruit = new Recruit();
        BeanUtils.copyProperties(recruitDTO,recruit);
        recruit.setzTime(new Date());
        int res = recruitMapper.insertRecruit(recruit);
        return res;
    }

    @Override
    public RecruitVO recruitDetail(RecruitDTO recruitDTO) {
        Recruit recruit = new Recruit();
        BeanUtils.copyProperties(recruitDTO,recruit);
        RecruitVO recruitVO = recruitMapper.recruitDetail(recruit);
        return recruitVO;
    }

    @Override
    public List<RecruitVO> recruitList(Integer workIdInt) {
        return recruitMapper.recruitList(workIdInt);
    }
}
