package com.isia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReportController 
{
	@RequestMapping(value="ViewReport")
	public ModelAndView viewReportload()
	{
		return new ModelAndView("admin/ViewReport"); 
	}
}
