package com.wx.xcx.controller;

import com.wx.xcx.dto.JobDTO;
import com.wx.xcx.service.JobService;
import com.wx.xcx.vo.JobVO;
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
@RequestMapping("qz")
public class JobController {
    @Resource
    JobService jobService;

    @PostMapping("/add")
    Integer addQz(@RequestBody JobDTO jobDTO) {
        return jobService.insert(jobDTO);
    }

    @GetMapping("/get")
    List<JobVO> getAllQz() {
        return jobService.getAllQz();
    }

    @DeleteMapping("/delete")
    Integer deleteQz(String qid) {
        return jobService.deleteQz(Integer.valueOf(qid));
    }

    @PostMapping("/update")
    Integer updateQz(@RequestBody JobDTO jobDTO) {
        return jobService.updateQz(jobDTO);
    }

    @GetMapping("/detail")
    JobVO getQz(String qip) {
        return jobService.getQzByQid(Integer.valueOf(qip));
    }
}
