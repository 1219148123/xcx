package com.wx.xcx.controller;

import com.wx.xcx.dto.RecruitmentDTO;
import com.wx.xcx.entity.FileUploadResult;
import com.wx.xcx.service.RecruitmentService;
import com.wx.xcx.service.impl.FileUploadService;
import com.wx.xcx.vo.RecruitmentVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    Integer addZp(@RequestBody @Valid RecruitmentDTO recruitmentDTO) {
        this.photo = this.photo.substring(0, this.photo.length() - 1);
        int res = recruitmentService.insert(recruitmentDTO,photo);
        this.photo = "";
        return res;
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
        System.out.println(recruitment + "=---------------------");
        return recruitment;
    }
}
