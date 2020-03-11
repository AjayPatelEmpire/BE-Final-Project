package com.isia.dao;


import java.util.List;

import com.isia.model.FeedbackVO;

public interface FeedbackDAO {

	void insertFeedback(FeedbackVO feedbackVO);

	List viewFeedback(FeedbackVO feedbackVO);

	List viewstaffFeedback(FeedbackVO feedbackVO);

}
