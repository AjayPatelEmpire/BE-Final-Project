package com.isia.controller;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import com.isia.model.ComplainVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.isia.service.ComplainService;

@Controller
public class ComplainController 
{
	@Autowired
	ComplainService complainService;
	
	@RequestMapping(value="/admin/viewComplain")
	public ModelAndView viewComplainLoad()
	{
		List ls=this.complainService.viewComplain();
		
		return new ModelAndView("/admin/viewComplain","complainSearchList",ls); 
	}
	@RequestMapping(value="/admin/replyComplain",method=RequestMethod.GET)
	public ModelAndView addReplyComplainLoad(@ModelAttribute ComplainVO complainVO,@RequestParam int id)
	{
		
		List ls=this.complainService.searchByIdComplain(complainVO);
		
		return new ModelAndView("/admin/addReplyComplain","complainVO",(ComplainVO)ls.get(0)); 
	}
	@RequestMapping(value="admin/insertComplain",method=RequestMethod.POST)
	public ModelAndView insertReply(@ModelAttribute ComplainVO complainVO) {
		
		Date d = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		complainVO.setReplyDate(dateFormat.format(d));
		complainVO.setComplainStatus("resolved");
		
		this.complainService.insertComplain(complainVO);
		
		return new ModelAndView("redirect:/admin/viewComplain");
	}
	
}