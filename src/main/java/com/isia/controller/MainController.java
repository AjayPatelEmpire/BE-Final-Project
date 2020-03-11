package com.isia.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController 
{
	@RequestMapping(value="/admin")
	public ModelAndView load()
	{
		return new ModelAndView("admin/index"); 
	}
	@RequestMapping(value="index")
	public ModelAndView indexLoad()
	{
		return new ModelAndView("redirect:/admin"); 
	}
}