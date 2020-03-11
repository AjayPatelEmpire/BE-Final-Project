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
public class FeedbackController {

	@Autowired
	LoginService loginService;
	
	@Autowired
	FeedbackService feedbackService;
	
	@RequestMapping(value="/admin/viewFeedback",method=RequestMethod.GET)
	public ModelAndView viewFeedback(@ModelAttribute FeedbackVO feedbackVO) {
		
		List feedbackList = this.feedbackService.viewFeedback(feedbackVO);
		
		return new ModelAndView("admin/viewFeedback","feedbackList",feedbackList);
	}
}
