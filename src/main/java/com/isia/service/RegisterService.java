package com.isia.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isia.model.LoginVO;
import com.isia.model.RegisterVO;
import com.isia.dao.RegisterDAO;
@Service
public class RegisterService {
	
	@Autowired RegisterDAO registerDAO;
	
	@Transactional
	public void insertRegister(RegisterVO registerVO) {
		this.registerDAO.insertRegister(registerVO);
	}

}
