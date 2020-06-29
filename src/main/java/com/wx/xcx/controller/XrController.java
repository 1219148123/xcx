package com.wx.xcx.controller;

import com.wx.xcx.dto.JobDTO;
import com.wx.xcx.dto.XrDTO;
import com.wx.xcx.entity.FileUploadResult;
import com.wx.xcx.service.XrService;
import com.wx.xcx.service.impl.FileUploadService;
import com.wx.xcx.vo.JobVO;
import com.wx.xcx.vo.XrVO;
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
 * @Date 2020年06月16日
 */
@RestController
@RequestMapping("xr")
public class XrController {
    @Resource
    XrService xrService;

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
    Integer addXr(@RequestBody XrDTO xrDTO) {
        this.photo = this.photo.substring(0, this.photo.length() - 1);
        int res = xrService.insert(xrDTO,photo);
        this.photo = "";
        return res;
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
