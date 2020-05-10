package com.cy.pj.common.vo;

import java.util.Arrays;
import java.util.Date;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class ExcelModel extends BaseRowModel{
	
	@ExcelProperty(value = "编号",index = 0)
private Integer code;
	@ExcelProperty(value = "姓名",index = 1)
private String name;
	@ExcelProperty(value = "工资",index = 2)
private Double salary;
	@ExcelProperty(value = "资质",index = 3)
private String zizhi;
	@ExcelProperty(value = "单位",index = 4)
private String dw;
	@ExcelProperty(value = "年龄",index = 5)
private Integer age;
	@ExcelProperty(value = "日期",index = 6)
private Date time;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getZizhi() {
		return zizhi;
	}
	public void setZizhi(String zizhi) {
		this.zizhi = zizhi;
	}
	public String getDw() {
		return dw;
	}
	public void setDw(String dw) {
		this.dw = dw;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
