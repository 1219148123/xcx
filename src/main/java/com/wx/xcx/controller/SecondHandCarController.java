package com.wx.xcx.controller;

import com.wx.xcx.dto.SecondHandCarDTO;
import com.wx.xcx.entity.FileUploadResult;
import com.wx.xcx.service.SecondHandCarService;
import com.wx.xcx.service.impl.FileUploadService;
import com.wx.xcx.vo.SecondHandCarVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/secondeHandCar")
public class SecondHandCarController {
    @Resource
    SecondHandCarService secondHandCarService;
    @Autowired
    private FileUploadService fileUploadService;
    String photo = "";

    @ApiOperation(value = "二手车上传图片", notes = "二手车上传图片")
    @PostMapping(value = "/carImgUpload")
    public FileUploadResult test(@RequestParam("file") MultipartFile uploadFile) {
        FileUploadResult upload = null;
        synchronized (this) {
            upload = this.fileUploadService.upload(uploadFile);
            this.photo = this.photo + upload.getName() + ",";
        }
        return upload;
    }

    @PostMapping("insert")
    public int carInsert(@RequestBody SecondHandCarDTO secondHandCarDTO) {
        if (photo != null && !"".equals(photo)) {
            this.photo = this.photo.substring(0, this.photo.length() - 1);
        }
        secondHandCarDTO.setCarImg(this.photo);
        int res = secondHandCarService.carInsert(secondHandCarDTO);
        this.photo = "";
        return res;
    }

    @GetMapping("get")
    public SecondHandCarVO getCar(SecondHandCarDTO secondHandCarDTO){
        return secondHandCarService.carDetail(secondHandCarDTO);
    }

    @GetMapping("list")
    public List<SecondHandCarVO> carList(String carType){
        Integer val = 0;
        if (carType != null && !"".equals(carType)){
            val = Integer.valueOf(carType);
        }
        return secondHandCarService.carList(val);
    }
}
