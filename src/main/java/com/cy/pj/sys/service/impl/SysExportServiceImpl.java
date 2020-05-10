package com.cy.pj.sys.service.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.cy.pj.common.vo.ExcelModel;
import com.cy.pj.common.vo.ExcelerModel;
import com.cy.pj.sys.dao.SysExportDao;
import com.cy.pj.sys.entity.SysUser;
import com.cy.pj.sys.service.SysExportService;
@Service
public class SysExportServiceImpl implements SysExportService {
	@Autowired
private SysExportDao exportdao;
	@Override
	public void export()  {
		// TODO Auto-generated method stub
		ArrayList<List<String>> data=new ArrayList<List<String>>();
		ArrayList<String> row=new ArrayList<>();
		row.add("1");
		row.add("朱嘉怡");
		row.add("7000");
		row.add("中级会计师");
		row.add("国库支付");
		row.add("6");
		row.add("7");
		data.add(row);
		
		row=new ArrayList<>();
		row.add("1");
		row.add("朱嘉怡");
		row.add("7000");
		row.add("中级会计师");
		row.add("国库支付");
		row.add("6");
		row.add("7");
		data.add(row);
		
		try {
			FileOutputStream out=new FileOutputStream("D:/导出表数据/demo.XLSX");
			ExcelWriter writer=	new ExcelWriter(out, ExcelTypeEnum.XLSX);
			Sheet sheet=new Sheet(1, 0, ExcelModel.class);
			sheet.setSheetName("周报表");
			writer.write0(data, sheet);
			
			Sheet sheet2=new Sheet(2, 0, ExcelerModel.class);
			sheet2.setSheetName("年报表");
			writer.write0(data, sheet2);
			
			writer.finish();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}
		
   List<SysUser> list= exportdao.seleexport();
	}

}
