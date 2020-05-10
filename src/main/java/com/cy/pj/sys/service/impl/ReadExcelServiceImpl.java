package com.cy.pj.sys.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.cy.pj.common.vo.ExcelModel;
import com.cy.pj.sys.dao.SysExcelDao;
import com.cy.pj.sys.listeners.ReadExcelListener;
import com.cy.pj.sys.service.ReadExcelService;
@Service
public class ReadExcelServiceImpl implements ReadExcelService {
	@Autowired
private SysExcelDao exceldao;
	@Override
	public void readExcel(File file) {
		// TODO Auto-generated method stub
		try {
			//使用easyexcel读取excel文件
			FileInputStream in=new FileInputStream(file);
			//创建自定义的listener对象
			ReadExcelListener listener=	new ReadExcelListener();
			
			ExcelReader reader=new ExcelReader(in, null, listener);
			//创建sheet
			Sheet sheet=new Sheet(1, 1, ExcelModel.class);
			//读取sheet
			reader.read(sheet);
			
			//获取读取到的excel数据，调用dao方法添加到数据库
			List<ExcelModel> dataList=listener.getData();
			for (ExcelModel excelModel : dataList) {
				exceldao.insermodel(excelModel);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
