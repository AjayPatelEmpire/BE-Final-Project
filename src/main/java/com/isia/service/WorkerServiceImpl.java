package com.isia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isia.dao.WorkerDao;
import com.isia.model.RegisterVO;
import com.isia.service.WorkerService;

@Service
@Transactional
public class WorkerServiceImpl implements WorkerService
{
	@Autowired
	WorkerDao workerDao;

	@Override
	public void insertWorker(RegisterVO registerVO) 
	{
		System.out.println("WORKER SERVICE:::::::::::::");
		
		this.workerDao.insertWorker(registerVO);
		
	}
	
}