package com.wx.xcx.service.impl;

import com.wx.xcx.dto.RecruitmentDTO;
import com.wx.xcx.entity.Recruitment;
import com.wx.xcx.mapper.RecruitmentMapper;
import com.wx.xcx.service.RecruitmentService;
import com.wx.xcx.vo.RecruitmentVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月05日
 */
@Service
public class RecruitmentServiceImpl implements RecruitmentService {
    @Resource
    RecruitmentMapper recruitmentMapper;


    @Override
    public int insert(RecruitmentDTO recruitmentDTO) {
        Recruitment recruitment = new Recruitment();
        BeanUtils.copyProperties(recruitmentDTO,recruitment);
        //设置发布时间
        Date date =  new Date();
        recruitment.setzTime(date);
        //设置发布人
        recruitment.setzOwner(1);
        //设置图片
        return recruitmentMapper.insert(recruitment);
    }

    @Override
    public int delete(Integer zid) {
        return recruitmentMapper.delete(zid);
    }

    @Override
    public int update(RecruitmentDTO recruitmentDTO) {
        Recruitment recruitment = new Recruitment();
        BeanUtils.copyProperties(recruitmentDTO,recruitment);
        //设置发布时间
        Date date =  new Date();
        recruitment.setzTime(date);
        return recruitmentMapper.update(recruitment);
    }

    @Override
    public List<RecruitmentVO> allRecruitment() {
        return recruitmentMapper.allRecruitment();
    }

    @Override
    public RecruitmentVO getRecruitment(Integer zid) {
        return recruitmentMapper.ZpDetail(zid);
    }
}
