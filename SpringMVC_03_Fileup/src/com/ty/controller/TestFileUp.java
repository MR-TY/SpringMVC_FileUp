package com.ty.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
/**
 * 1.文件上传需要通过@RequestParam进行名字的解析
 * file.transferTo(new File("F:/"+fileName));通过此命令可以上传到指定的位置
 */
@Controller
public class TestFileUp {
	@RequestMapping("/testFileUpload")
	public String testUploadPage(@RequestParam("desc") String desc,@RequestParam("file") MultipartFile file ) throws IllegalStateException, IOException{
		System.out.println("desc:"+desc);
		String fileName = file.getName();
		System.out.println("fileName:"+file.getName());
		file.transferTo(new File("F:/"+fileName));
		return "success.jsp";
	}
}
