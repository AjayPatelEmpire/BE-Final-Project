package com.isia.service;
import com.isia.model.DatasetVO;
import java.util.List;


public interface DatasetService 
{
	public void insert(DatasetVO datasetVO);
	
	public List search();
	
	public List searchById(DatasetVO datasetVO);
	
}
