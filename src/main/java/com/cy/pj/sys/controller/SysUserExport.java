package com.cy.pj.sys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cy.pj.sys.service.SysExportService;

@Controller
public class SysUserExport {
	@Autowired
	private SysExportService exportservice; 
@RequestMapping("/export")
	public void export() {
	exportservice.export();
	}
}
