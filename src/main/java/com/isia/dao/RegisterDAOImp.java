package com.isia.dao;
import com.isia.model.RegisterVO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterDAOImp implements RegisterDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertRegister(RegisterVO registerVO) 
	{
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.save(registerVO);
	}
}
