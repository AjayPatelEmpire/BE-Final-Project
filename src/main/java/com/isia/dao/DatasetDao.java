package com.isia.dao;
import java.util.List;
import com.isia.model.DatasetVO;

public interface DatasetDao 
{
	public void insert(DatasetVO datasetVO); 
	
	public List search();
	
	public List searchById(DatasetVO datasetVO);
	
}
