package com.wx.xcx.service;

import com.wx.xcx.dto.JobDTO;
import com.wx.xcx.entity.Job;
import com.wx.xcx.vo.JobVO;

import java.util.List;

/**
 * <p>接口</p>
 *
 * @author :  hzs 2020年06月15日
 * @version : 1.0
 */
public interface JobService {
    //1.发布求职
    int insert(JobDTO jobDTO);
    //2.删除求职
    int deleteQz(Integer qid);
    //3.修改求职
    int updateQz(JobDTO jobDTO);
    //4.查询所有求职
    List<JobVO> getAllQz();
    //5.查询单个求职
    JobVO getQzByQid(Integer qid);
}
