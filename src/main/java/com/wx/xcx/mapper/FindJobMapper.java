package com.wx.xcx.mapper;

import com.wx.xcx.entity.FindJob;
import com.wx.xcx.vo.FindJobVO;

import java.util.List;

public interface FindJobMapper {
    int insert(FindJob record);

    int insertSelective(FindJob record);

    //1.求职插入
    int findJobInsert(FindJob findJob);

    //2.求职详情查看
    FindJobVO findJobDetail(FindJob findJob);

    //3.列表展示
    List<FindJobVO> findJobList(Integer eduId);
}