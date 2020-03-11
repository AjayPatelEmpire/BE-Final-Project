package com.isia.service;

import java.util.List;

import com.isia.model.FeedbackVO;

public interface FeedbackService 
{
	public void insertFeedback(FeedbackVO feedbackVO);
	
	public List viewFeedback(FeedbackVO feedbackVO);
	
	public List viewstaffFeedback(FeedbackVO feedbackVO);
	
	

}
