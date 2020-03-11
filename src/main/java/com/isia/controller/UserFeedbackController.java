package com.isia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.isia.model.FeedbackVO;
import com.isia.model.LoginVO;
import com.isia.service.FeedbackService;
import com.isia.service.LoginService;
import com.isia.utils.Basemethods;



@Controller
public class UserFeedbackController {

	@Autowired
	LoginService loginService;
	
	@Autowired
	FeedbackService feedbackService;
	
	@RequestMapping(value="/worker/loadFeedback",method=RequestMethod.GET)
	public ModelAndView loadFeedback(@ModelAttribute FeedbackVO feedbackVO)
	{
		return new ModelAndView("/worker/addFeedback","feedbackVO",new FeedbackVO());
	}
	
	@RequestMapping(value="/worker/insertRaiting",method=RequestMethod.POST)
	public ModelAndView insertFeedback(@ModelAttribute FeedbackVO feedbackVO,LoginVO loginVO)
	{
		String userName = Basemethods.getUser();

		List loginList  = loginService.searchLoginID(userName);
		
		LoginVO loginVO2 = (LoginVO) loginList.get(0);		
		feedbackVO.setLoginVO(loginVO2);
		this.feedbackService.insertFeedback(feedbackVO);
		return new ModelAndView("redirect:/worker/loadFeedback");
	}
	
	@RequestMapping(value="/worker/viewFeedback",method=RequestMethod.GET)
	public ModelAndView viewFeedbackLoad(@ModelAttribute FeedbackVO feedbackVO) {
		
		String userName = Basemethods.getUser();
		List loginList  = loginService.searchLoginID(userName); 	
		LoginVO loginVO2 = (LoginVO) loginList.get(0);	
		feedbackVO.setLoginVO(loginVO2);
		
		List feedbackList = this.feedbackService.viewstaffFeedback(feedbackVO);
		
		return new ModelAndView("/worker/viewFeedback","feedbackList",feedbackList);
		
	}
}
