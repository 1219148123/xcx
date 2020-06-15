package com.wx.xcx.controller;

import com.wx.xcx.dto.JobDTO;
import com.wx.xcx.dto.SwDTO;
import com.wx.xcx.service.SwService;
import com.wx.xcx.vo.JobVO;
import com.wx.xcx.vo.SwVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月15日
 */
@RestController
@RequestMapping("sw")
public class SwController {
    @Resource
    SwService swService;

    @PostMapping("/add")
    Integer addSw(@RequestBody SwDTO swDTO) {
        return swService.insert(swDTO);
    }

    @GetMapping("/get")
    List<SwVO> getAllSw() {
        return swService.getAllSw();
    }

    @DeleteMapping("/delete")
    Integer deleteSw(String sid) {
        return swService.deleteSw(Integer.valueOf(sid));
    }

    @PostMapping("/update")
    Integer updateSw(@RequestBody SwDTO swDTO) {
        return swService.updateSw(swDTO);
    }

    @GetMapping("/detail")
    SwVO getSw(String sid) {
        return swService.getSwBySid(Integer.valueOf(sid));
    }
}
