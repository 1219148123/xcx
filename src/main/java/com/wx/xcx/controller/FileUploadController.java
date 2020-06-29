package com.wx.xcx.controller;

import com.wx.xcx.entity.FileUploadResult;
import com.wx.xcx.service.impl.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author hanzs
 * @version 1.0
 * @description: entity
 * @Date 2020年06月29日
 */
@Controller
public class FileUploadController {
    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("file/upload")
    @ResponseBody
    public FileUploadResult upload(@RequestParam("file") MultipartFile uploadFile)
            throws Exception {
        return this.fileUploadService.upload(uploadFile);
    }
}
