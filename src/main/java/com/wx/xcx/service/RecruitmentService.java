package com.wx.xcx.service;

import com.wx.xcx.dto.RecruitmentDTO;
import com.wx.xcx.vo.RecruitmentVO;

import java.util.List;

/**
 * <p>接口</p>
 *
 * @author :  hzs 2020年06月05日
 * @version : 1.0
 */
public interface RecruitmentService {
    int insert(RecruitmentDTO recruitmentDTO, String photo);

    //删除信息
    int delete(Integer zid);

    //修改信息
    int update(RecruitmentDTO recruitmentDTO);

    //查询所有的发布信息
    List<RecruitmentVO> allRecruitment();

    //获取某个招聘得详情
    RecruitmentVO getRecruitment(Integer zid);
}
