package com.cy.pj.sys.listeners;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.cy.pj.common.vo.ExcelModel;

public class ReadExcelListener extends AnalysisEventListener{
	//保存读到的每一行数据
	private List<ExcelModel> data=null;
//读取到excel每一行，都调用invoke方法
	//object行数据我们写的model对象           context上下文
	 public ReadExcelListener() {
		// TODO Auto-generated constructor stub
		super();
		//初始化list
		data=new ArrayList<>();
	}
	@Override
	public void invoke(Object object, AnalysisContext context) {
		// TODO Auto-generated method stub
		System.out.println(object);
		//数据添加到list
		data.add((ExcelModel)object);
	}
//读取excel完毕输出的方法
	@Override
	public void doAfterAllAnalysed(AnalysisContext context) {
		// TODO Auto-generated method stub
		
	}
//获取数据
	public List<ExcelModel> getData(){
		return data;
	}
}
