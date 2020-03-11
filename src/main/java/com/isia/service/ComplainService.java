package com.isia.service;
import java.util.List;
import com.isia.model.ComplainVO;

public interface ComplainService 
{
public void insertComplain(ComplainVO complainVO);

public List viewComplain();

public List searchByIdComplain(ComplainVO complainVO);

public List seeComplaint(ComplainVO complainVO);
}
