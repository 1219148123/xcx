package com.wx.xcx.controller;

import com.wx.xcx.dto.JobDTO;
import com.wx.xcx.dto.SwDTO;
import com.wx.xcx.entity.FileUploadResult;
import com.wx.xcx.service.SwService;
import com.wx.xcx.service.impl.FileUploadService;
import com.wx.xcx.vo.JobVO;
import com.wx.xcx.vo.SwVO;
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
@RequestMapping("sw")
public class SwController {
    @Resource
    SwService swService;
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
    Integer addSw(@RequestBody SwDTO swDTO) {
        this.photo = this.photo.substring(0, this.photo.length() - 1);
        int res = swService.insert(swDTO,photo);
        this.photo = "";
        return res;
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
