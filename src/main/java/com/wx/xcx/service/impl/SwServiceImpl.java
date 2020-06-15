package com.wx.xcx.service.impl;

import com.wx.xcx.dto.SwDTO;
import com.wx.xcx.entity.Sw;
import com.wx.xcx.mapper.SwMapper;
import com.wx.xcx.service.SwService;
import com.wx.xcx.vo.SwVO;
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
public class SwServiceImpl implements SwService {
    @Resource
    SwMapper swMapper;
    @Override
    public int insert(SwDTO swDTO) {
        Sw sw = new Sw();
        BeanUtils.copyProperties(swDTO,sw);
        sw.setsOwner(1);
        sw.setsTime(new Date());
        return swMapper.insert(sw);
    }

    @Override
    public int deleteSw(Integer sid) {
        return swMapper.deleteSw(sid);
    }

    @Override
    public int updateSw(SwDTO swDTO) {
        Sw sw = new Sw();
        BeanUtils.copyProperties(swDTO,sw);
        sw.setsTime(new Date());
        return swMapper.updateSw(sw);
    }

    @Override
    public List<SwVO> getAllSw() {
        return swMapper.getAllSw();
    }

    @Override
    public SwVO getSwBySid(Integer sid) {
        return swMapper.getSwBySid(sid);
    }
}
