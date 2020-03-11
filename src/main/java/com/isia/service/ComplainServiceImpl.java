package com.isia.service;
import java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.isia.dao.ComplainDao;

import com.isia.model.ComplainVO;
@Service
@Transactional
public class ComplainServiceImpl implements ComplainService 
{

	@Autowired
	ComplainDao complainDao;
	
	@Override
	public void insertComplain(ComplainVO complainVO) 
	{
		this.complainDao.insertComplain(complainVO);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List viewComplain() 
	{
		List ls=this.complainDao.viewComplain();
		return ls;
	}

	@Override
	public List searchByIdComplain(ComplainVO complainVO) 
	{
		List ls=this.complainDao.searchByIdComplain(complainVO);
		return ls;
	}

	@Override
	public List seeComplaint(ComplainVO complainVO) {
		List complainList =	this.complainDao.seeComplaint(complainVO);
		return complainList;
	}

}
