package com.isia.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isia.dao.FeedbackDAO;
import com.isia.model.ComplainVO;
import com.isia.model.FeedbackVO;

@Service
public class FeedbackServiceImpl implements FeedbackService  
{
	
	@Autowired
	FeedbackDAO feedbackDAO;

	@Transactional
	public void insertFeedback(FeedbackVO feedbackVO) {
		
		this.feedbackDAO.insertFeedback(feedbackVO);
	}
	
	@Transactional
	public List viewFeedback(FeedbackVO feedbackVO) {
		
		List feedbackList = this.feedbackDAO.viewFeedback(feedbackVO);
		return feedbackList;
	}
	
	@Transactional
    public List viewstaffFeedback(FeedbackVO feedbackVO) {
    	
        List complainList =	this.feedbackDAO.viewstaffFeedback(feedbackVO);
        return complainList;
    
    }

}
