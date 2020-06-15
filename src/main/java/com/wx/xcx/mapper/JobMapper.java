package com.wx.xcx.mapper;

import com.wx.xcx.entity.Job;
import com.wx.xcx.vo.JobVO;

import java.util.List;

public interface JobMapper {
    //1.发布求职
    int insert(Job job);
    //2.删除求职
    int deleteQz(Integer qid);
    //3.修改求职
    int updateQz(Job job);
    //4.查询所有求职
    List<JobVO> getAllQz();
    //5.查询单个求职
    JobVO getQzByQid(Integer qid);
}