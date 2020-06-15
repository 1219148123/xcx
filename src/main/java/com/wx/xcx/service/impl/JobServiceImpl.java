package com.wx.xcx.service.impl;

import com.wx.xcx.dto.JobDTO;
import com.wx.xcx.entity.Job;
import com.wx.xcx.mapper.JobMapper;
import com.wx.xcx.service.JobService;
import com.wx.xcx.vo.JobVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月15日
 */
@Service
public class JobServiceImpl implements JobService {
    @Resource
    JobMapper jobMapper;
    @Override
    public int insert(JobDTO jobDTO) {
        Job job = new Job();
        BeanUtils.copyProperties(jobDTO,job);
        job.setqOwner(1);
        job.setqTime(new Date());
        return jobMapper.insert(job);
    }

    @Override
    public int deleteQz(Integer qid) {
        return jobMapper.deleteQz(qid);
    }

    @Override
    public int updateQz(JobDTO jobDTO) {
        Job job = new Job();
        BeanUtils.copyProperties(jobDTO,job);
        job.setqTime(new Date());
        return jobMapper.updateQz(job);
    }

    @Override
    public List<JobVO> getAllQz() {
        return jobMapper.getAllQz();
    }

    @Override
    public JobVO getQzByQid(Integer qid) {
        return jobMapper.getQzByQid(qid);
    }
}
