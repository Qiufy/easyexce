package com.cy.pj.sys.controller;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.cy.pj.sys.service.ReadExcelService;

@Controller
public class UpLoadFileController {
	@Autowired
	private ReadExcelService excelservice;
	@PostMapping("/upload")
	@ResponseBody
public String upload(MultipartFile file,HttpServletRequest req) {
	//存储目录定义
	String path=req.getServletContext().getRealPath("/uploadFile/")	;
	//日期是生成文件夹
	LocalDate date=LocalDate.now();
	DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd");
	String formate_date=format.format(date);
	//创建目录
	File folder=new File(path, formate_date);
	if(!folder.isDirectory()) {
		folder.mkdirs();
	}
	//处理文件，重新命名文件 UUID标识文件
	String uuid=UUID.randomUUID().toString().replaceAll("-", "");
	//上传文件的名称a.png
	String oldName=file.getOriginalFilename();
	//生成新的文件名称：uuid+原来文件的扩展名
	String newName=uuid+oldName.substring(oldName.indexOf("."),oldName.length());
	String ret="";
	try {
		//创建保存到服务器磁盘的文件
		File outFile=new File(folder, oldName);
		//把上传文件保存到outFile中
		file.transferTo(outFile);
		//拼接文件的路劲
		 ret=req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+"/uploadFile/"+formate_date+newName;
		//把excel文件交给easyexcel处理
		 excelservice.readExcel(outFile);
		 
		 
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	return ret;
	
}
}
