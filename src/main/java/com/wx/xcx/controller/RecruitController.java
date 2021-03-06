package com.wx.xcx.controller;

import com.wx.xcx.dto.RecruitDTO;
import com.wx.xcx.service.RecruitService;
import com.wx.xcx.vo.RecruitVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("recruit")
@RestController
public class RecruitController {
    @Resource
    RecruitService recruitService;

    @PostMapping("insert")
    public int insertRecruit(@RequestBody RecruitDTO recruitDTO) {
        int res = recruitService.insertRecruit(recruitDTO);
        return res;
    }
    @GetMapping("get")
    public RecruitVO getRecruit(RecruitDTO recruitDTO) {
        RecruitVO recruitVO = recruitService.recruitDetail(recruitDTO);
        return recruitVO;
    }

    @GetMapping("list")
    public List<RecruitVO> recruitList(String workId) {
        if (workId == null || "".equals(workId)) {
            Integer workIdInt = 0;
            return recruitService.recruitList(workIdInt);
        }
        Integer workIdInt = Integer.valueOf(workId);
        List<RecruitVO> list = recruitService.recruitList(workIdInt);
        return list;
    }
}
