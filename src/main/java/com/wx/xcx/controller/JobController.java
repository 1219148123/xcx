package com.wx.xcx.controller;

import com.wx.xcx.dto.JobDTO;
import com.wx.xcx.entity.FileUploadResult;
import com.wx.xcx.service.JobService;
import com.wx.xcx.service.impl.FileUploadService;
import com.wx.xcx.vo.JobVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

    @Autowired
    private FileUploadService fileUploadService;

    String photo = "";

    @ApiOperation(value = "商品上传图片", notes = "商品上传图片")
    @PostMapping(value = "/test")
    public FileUploadResult test(@RequestParam("file") MultipartFile uploadFile) {
        FileUploadResult upload = this.fileUploadService.upload(uploadFile);
        this.photo = this.photo + upload.getName() + ",";
        return upload;
    }

    @PostMapping("/add")
    Integer addQz(@RequestBody JobDTO jobDTO) {
        this.photo = this.photo.substring(0, this.photo.length() - 1);
        int res = jobService.insert(jobDTO,photo);
        this.photo = "";
        return res;
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
    JobVO getQz(String qid) {
        return jobService.getQzByQid(Integer.valueOf(qid));
    }
}
