package com.cy.pj.common.vo;

import java.util.Date;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class ExcelerModel extends BaseRowModel {
	@ExcelProperty(value = "编号",index = 0)
	private Integer cod;
		@ExcelProperty(value = "姓",index = 1)
	private String nam;
		@ExcelProperty(value = "工",index = 2)
	private Double salar;
		@ExcelProperty(value = "资",index = 3)
	private String zizh;
		@ExcelProperty(value = "单",index = 4)
	private String d;
		@ExcelProperty(value = "年",index = 5)
	private Integer ag;
		@ExcelProperty(value = "期",index = 6)
	private Date tim;
		public Integer getCod() {
			return cod;
		}
		public void setCod(Integer cod) {
			this.cod = cod;
		}
		public String getNam() {
			return nam;
		}
		public void setNam(String nam) {
			this.nam = nam;
		}
		public Double getSalar() {
			return salar;
		}
		public void setSalar(Double salar) {
			this.salar = salar;
		}
		public String getZizh() {
			return zizh;
		}
		public void setZizh(String zizh) {
			this.zizh = zizh;
		}
		public String getD() {
			return d;
		}
		public void setD(String d) {
			this.d = d;
		}
		public Integer getAg() {
			return ag;
		}
		public void setAg(Integer ag) {
			this.ag = ag;
		}
		public Date getTim() {
			return tim;
		}
		public void setTim(Date tim) {
			this.tim = tim;
		}
		
		
		
}
