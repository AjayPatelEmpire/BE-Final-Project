package com.isia.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isia.model.DatasetVO;

@Repository
public class DatasetDaoImpl implements DatasetDao 
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void insert(DatasetVO datasetVO) 
	{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(datasetVO);
	}
	@Override
	public List search() 
	{
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from DatasetVO where status=true");
		List ls=q.list();
		return ls;
	}
	@Override
	public List searchById(DatasetVO datasetVO) 
	{
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from DatasetVO where status=true and id="+datasetVO.getId());
		List ls=q.list();
		return ls;
		}
}