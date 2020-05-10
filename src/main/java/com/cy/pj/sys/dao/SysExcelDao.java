package com.cy.pj.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.cy.pj.common.vo.ExcelModel;

@Mapper
public interface SysExcelDao {
int insermodel(ExcelModel md);
}
