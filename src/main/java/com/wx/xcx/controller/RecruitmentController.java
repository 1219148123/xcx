package com.wx.xcx.controller;

import com.wx.xcx.dto.RecruitmentDTO;
import com.wx.xcx.service.RecruitmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

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
    Integer addZp(@RequestBody @Valid RecruitmentDTO recruitmentDTO){
        return  recruitmentService.insert(recruitmentDTO);
    }
}
