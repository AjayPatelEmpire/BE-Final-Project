package com.isia.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isia.model.RegisterVO;

@Repository
public class WorkerDaoImpl implements WorkerDao
{
	@Autowired 
	SessionFactory sessionFactory;

	@Override
	public void insertWorker(RegisterVO registerVO) 
	{
		System.out.println("DAO WORKER::::::::::::");
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(registerVO);	
	}
}