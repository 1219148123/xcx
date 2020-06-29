package com.wx.xcx.service.impl;

import com.wx.xcx.dto.XrDTO;
import com.wx.xcx.entity.Xr;
import com.wx.xcx.mapper.XrMapper;
import com.wx.xcx.service.XrService;
import com.wx.xcx.vo.XrVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月16日
 */
@Service
public class XrServiceImpl implements XrService {
    @Resource
    XrMapper xrMapper;
    @Override
    public int insert(XrDTO xrDTO, String photo) {
        Xr xr = new Xr();
        BeanUtils.copyProperties(xrDTO,xr);
        xr.setxOwner(1);
        xr.setxTime(new Date());
        int res = xrMapper.insert(xr);
        xr.setxImg(photo);
        xrMapper.updateImg(xr);
        return res;
    }

    @Override
    public int updateXr(XrDTO xrDTO) {
        Xr xr = new Xr();
        BeanUtils.copyProperties(xrDTO,xr);
        xr.setxTime(new Date());
        return xrMapper.updateXr(xr);
    }

    @Override
    public int deleteXr(Integer xid) {
        return xrMapper.deleteXr(xid);
    }

    @Override
    public XrVO seleteOneXr(Integer xid) {
        return xrMapper.seleteOneXr(xid);
    }

    @Override
    public List<XrVO> seleteAllXr() {
        return xrMapper.seleteAllXr();
    }
}
