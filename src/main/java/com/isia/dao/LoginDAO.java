package com.isia.dao;
import com.isia.model.LoginVO;
import com.isia.model.RegisterVO;
import java.util.List;

public interface LoginDAO 
{

	public void register(RegisterVO registerVO);

	public void insertLogin(LoginVO loginVO);

	public List searchLoginID(String loginService);
}
