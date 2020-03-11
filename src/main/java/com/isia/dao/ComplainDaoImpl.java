package com.isia.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isia.model.ComplainVO;

@Repository
public class ComplainDaoImpl implements ComplainDao 
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void insertComplain(ComplainVO complainVO) 
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(complainVO);
		
	}

	@Override
	public List viewComplain() {
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from ComplainVO where status=true");
		List ls=q.list();
		System.out.println(ls.size());
		return ls;
	}
	@Override
	public List searchByIdComplain(ComplainVO complainVO) {
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from ComplainVO where status=true and id="+complainVO.getId());
		List ls=q.list();
		
		return ls;
		
	}
	@Override
	public List seeComplaint(ComplainVO complainVO) {
		Session session = sessionFactory.getCurrentSession();
		
		Query q = session.createQuery("from ComplainVO where loginVO.loginId ="+complainVO.getLoginVO().getLoginId());
		List complainList = q.list();
		return complainList;
	   }

}
