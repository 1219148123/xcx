package com.wx.xcx.service;

import com.wx.xcx.dto.FindJobDTO;
import com.wx.xcx.entity.FindJob;
import com.wx.xcx.vo.FindJobVO;

import java.util.List;

public interface FindJobService {
    //1.求职插入
    int findJobInsert(FindJobDTO findJobDTO);

    //2.求职详情查看
    FindJobVO findJobDetail(FindJobDTO findJobDTO);

    //3.列表展示
    List<FindJobVO> findJobList(Integer eduId);
}
