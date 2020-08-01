package com.wx.xcx.controller;

import com.wx.xcx.dto.FindJobDTO;
import com.wx.xcx.service.FindJobService;
import com.wx.xcx.vo.FindJobVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/findJob")
public class FindJobController {
    @Resource
    FindJobService findJobService;

    @PostMapping("insert")
    public int findJobInsert(@RequestBody FindJobDTO findJobDTO) {
        return findJobService.findJobInsert(findJobDTO);
    }


    @GetMapping("get")
    public FindJobVO findJobGet(FindJobDTO findJobDTO) {
        return findJobService.findJobDetail(findJobDTO);
    }

    @GetMapping("list")
    public List<FindJobVO> findJobVOList(String eduId) {
        if (eduId == null || "".equals(eduId)) {
            Integer eduIdInt = 0;
            return findJobService.findJobList(eduIdInt);
        }
        Integer eduIdInt = Integer.valueOf(eduId);
        return findJobService.findJobList(eduIdInt);
    }
}
