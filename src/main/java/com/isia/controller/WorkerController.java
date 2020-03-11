package com.isia.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.isia.model.LoginVO;
import com.isia.model.RegisterVO;
import com.isia.service.LoginService;
import com.isia.service.WorkerService;
import com.isia.utils.Basemethods;

@Controller

public class WorkerController 
{
	@Autowired 
	LoginService loginService;
	
	@Autowired 
	WorkerService workerService;
	
	@RequestMapping(value="/admin/loadWorker",method=RequestMethod.GET)
	public ModelAndView addWorkerLoad()
	{
		return new ModelAndView("admin/addWorker","registerVO",new RegisterVO()); 
	}
	
	@RequestMapping(value="/admin/registerWorker",method=RequestMethod.POST)
	public ModelAndView addWorkerLoad(@ModelAttribute RegisterVO registerVO,@ModelAttribute LoginVO loginVO)
	{
		System.out.println("wORKERR cONTROLLER:::::::::::::");
		String password = Basemethods.generatePassword();
		System.out.println(password);
		Basemethods.sendMail(registerVO.getEmailId(), password,registerVO.getFirstName());
		 
		 loginVO.setUsername(registerVO.getEmailId());
		 loginVO.setPassword(password);
		 loginVO.setEnabled("1");
		 loginVO.setRole("ROLE_WORKER");
		 
		  this.loginService.insertLogin(loginVO);
		  
		  registerVO.setLoginVO(loginVO);
		  
		  this.workerService.insertWorker(registerVO);
		  
		return new ModelAndView("redirect:/admin/loadWorker");	
		
	}
	@RequestMapping(value="/worker/personalInformation",method=RequestMethod.GET)
	public ModelAndView completeProfileLoad(@ModelAttribute RegisterVO registerVO)
	{
		
		return new ModelAndView("/worker/completeProfile","registerVO",registerVO); 
	}
	/*
	@RequestMapping(value="/worker/completeProfile",method=RequestMethod.GET)
	public ModelAndView completeProfile(@ModelAttribute RegisterVO registerVO)
	{
		String userName = Basemethods.getUser();

		List loginList  = loginService.searchLoginID(userName);
		
		LoginVO loginVO2 = (LoginVO) loginList.get(0);		
		registerVO.setLoginVO(loginVO2);
		this.workerService.insertWorker(registerVO);
		
		return new ModelAndView("/worker/completeProfile"); 
	}
	
*/	@RequestMapping(value="/admin/viewWorker",method=RequestMethod.GET)
	public ModelAndView viewWorkerLoad()
	{
		return new ModelAndView("admin/viewWorker"); 
	}
}