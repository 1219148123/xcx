package com.wx.xcx.service;

import com.wx.xcx.dto.SwDTO;
import com.wx.xcx.vo.SwVO;

import java.util.List;

/**
 * <p>接口</p>
 *
 * @author :  hzs 2020年06月15日
 * @version : 1.0
 */
public interface SwService {
    //1.发布失物招领
    int insert(SwDTO swDTO, String photo);
    //2.删除求职
    int deleteSw(Integer sid);
    //3.修改求职
    int updateSw(SwDTO swDTO);
    //4.查询所有求职
    List<SwVO> getAllSw();
    //5.查询单个求职
    SwVO getSwBySid(Integer sid);
}
