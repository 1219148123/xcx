package com.wx.xcx.controller;

import com.wx.xcx.dto.JobDTO;
import com.wx.xcx.dto.XrDTO;
import com.wx.xcx.service.XrService;
import com.wx.xcx.vo.JobVO;
import com.wx.xcx.vo.XrVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月16日
 */
@RestController
@RequestMapping("xr")
public class XrController {
    @Resource
    XrService xrService;

    @PostMapping("/add")
    Integer addXr(@RequestBody XrDTO xrDTO) {
        return xrService.insert(xrDTO);
    }

    @GetMapping("/get")
    List<XrVO> getAllXr() {
        return xrService.seleteAllXr();
    }

    @DeleteMapping("/delete")
    Integer deleteXr(String xid) {
        return xrService.deleteXr(Integer.valueOf(xid));
    }

    @PostMapping("/update")
    Integer updateXr(@RequestBody XrDTO xrDTO) {
        return xrService.updateXr(xrDTO);
    }

    @GetMapping("/detail")
    XrVO getXr(String xid) {
        return xrService.seleteOneXr(Integer.valueOf(xid));
    }
}
