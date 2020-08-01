package com.wx.xcx.service.impl;

import com.wx.xcx.dto.FindJobDTO;
import com.wx.xcx.entity.FindJob;
import com.wx.xcx.mapper.FindJobMapper;
import com.wx.xcx.service.FindJobService;
import com.wx.xcx.vo.FindJobVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class FindJobServiceImpl implements FindJobService {
    @Resource
    FindJobMapper findJobMapper;
    @Override
    public int findJobInsert(FindJobDTO findJobDTO) {
        FindJob findJob = new FindJob();
        BeanUtils.copyProperties(findJobDTO,findJob);
        findJob.setqTime(new Date());
        return findJobMapper.findJobInsert(findJob);
    }

    @Override
    public FindJobVO findJobDetail(FindJobDTO findJobDTO) {
        FindJob findJob = new FindJob();
        BeanUtils.copyProperties(findJobDTO,findJob);
        return findJobMapper.findJobDetail(findJob);
    }

    @Override
    public List<FindJobVO> findJobList(Integer eduId) {
        return findJobMapper.findJobList(eduId);
    }
}
