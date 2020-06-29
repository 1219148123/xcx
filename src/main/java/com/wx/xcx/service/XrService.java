package com.wx.xcx.service;

import com.wx.xcx.dto.XrDTO;
import com.wx.xcx.vo.XrVO;

import java.util.List;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月16日
 */
public interface XrService {
    //1.插入寻人启事
    int insert(XrDTO xrDTO, String photo);
    //2.修改寻人启事
    int updateXr(XrDTO xrDTO);
    //3.删除寻人启事
    int deleteXr(Integer xid);
    //4.查询单个寻人启事
    XrVO seleteOneXr(Integer xid);
    //5.查询所有得寻人启示
    List<XrVO> seleteAllXr();
}
