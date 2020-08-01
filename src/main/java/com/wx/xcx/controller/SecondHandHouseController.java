package com.wx.xcx.controller;

import com.wx.xcx.dto.SecondHandHouseDTO;
import com.wx.xcx.entity.FileUploadResult;
import com.wx.xcx.service.SecondHandHouseService;
import com.wx.xcx.service.impl.FileUploadService;
import com.wx.xcx.vo.SecondHandHouseVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("house")
public class SecondHandHouseController {
    @Resource
    SecondHandHouseService secondHandHouseService;
    @Autowired
    private FileUploadService fileUploadService;
    String photo = "";

    @ApiOperation(value = "房子上传图片", notes = "房子上传图片")
    @PostMapping(value = "/houseImgUpload")
    public FileUploadResult test(@RequestParam("file") MultipartFile uploadFile) {
        FileUploadResult upload = this.fileUploadService.upload(uploadFile);
        this.photo = this.photo + upload.getName() + ",";
        return upload;
    }
    @PostMapping("insert")
    public int insertHouse(@RequestBody SecondHandHouseDTO secondHandHouseDTO) {
        if (photo != null && !"".equals(photo)) {
            this.photo = this.photo.substring(0, this.photo.length() - 1);
        }
        secondHandHouseDTO.sethImg(photo);
        int res = secondHandHouseService.houstInsert(secondHandHouseDTO);
        this.photo = "";
        return res;
    }

    @GetMapping("get")
    public SecondHandHouseVO getHoust(SecondHandHouseDTO secondHandHouseDTO) {
        return secondHandHouseService.houseDetail(secondHandHouseDTO);
    }

    @GetMapping("list")
    public List<SecondHandHouseVO> houseList() {
        return secondHandHouseService.houseList();
    }
}
