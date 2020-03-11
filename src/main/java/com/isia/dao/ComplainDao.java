package com.isia.dao;
import java.util.List;
import com.isia.model.ComplainVO;

public interface ComplainDao 
{
	public void insertComplain(ComplainVO complainVO);
	
	public List viewComplain();

	public List searchByIdComplain(ComplainVO complainVO);
	
	public List seeComplaint(ComplainVO complainVO);

}
