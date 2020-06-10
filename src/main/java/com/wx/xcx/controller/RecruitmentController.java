package com.wx.xcx.controller;

import com.wx.xcx.dto.RecruitmentDTO;
import com.wx.xcx.service.RecruitmentService;
import com.wx.xcx.vo.RecruitmentVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月05日
 */
@RestController
@RequestMapping("zp")
public class RecruitmentController {
    @Resource
    RecruitmentService recruitmentService;

    @PostMapping("/add")
    Integer addZp(@RequestBody @Valid RecruitmentDTO recruitmentDTO) {
        return recruitmentService.insert(recruitmentDTO);
    }

    @GetMapping("/get")
    List<RecruitmentVO> getAllZp() {
        return recruitmentService.allRecruitment();
    }

    @DeleteMapping("/delete")
    Integer deleteZp(String zip) {
        return recruitmentService.delete(Integer.valueOf(zip));
    }

    @PostMapping("/update")
    Integer updateZp(@RequestBody @Valid RecruitmentDTO recruitmentDTO) {
        return recruitmentService.update(recruitmentDTO);
    }

    @GetMapping("/detail")
    RecruitmentVO getZp(String zip) {
        RecruitmentVO recruitment = recruitmentService.getRecruitment(Integer.valueOf(zip));
        System.out.println(recruitment+"=---------------------");
        return recruitment;
    }
}
