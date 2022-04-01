package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Date 2022/3/8 - 下午 1:40
 * 文件上传
 * 1.写jsp 表单  和核心文件 配置文件解析器
 */
@Controller
public class FileUploadController {

    @RequestMapping("/fileupload")
    public String fileupload(String username, MultipartFile filePic) throws IOException {
        //MultipartFile   文件上传接口
        //表单数据
        System.out.println(username);
        //保存原文件属性   getOriginalFilename
        String originalFilename = filePic.getOriginalFilename();
        //上传文件
        filePic.transferTo(new File("D:/A/"+originalFilename));
        return "Controller_demo1";
    }

    @RequestMapping("/fileupload2")
    public String fileupload2(String username, MultipartFile[] filePic) throws IOException {
        //表单数据
        System.out.println(username);
        //保存原文件属性   getOriginalFilename
        for (MultipartFile multipartFile : filePic) {
            String originalFilename = multipartFile.getOriginalFilename();
            //上传文件
            multipartFile.transferTo(new File("D:/A/"+originalFilename));
        }
        return "Controller_demo1";
    }
}
