package com.isia.service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import com.isia.model.DatasetVO;
import com.isia.dao.*;


@Service
@Transactional
public class DatasetServiceImpl implements DatasetService
{
	@Autowired
	DatasetDao datasetDao;

	@Override
	public void insert(DatasetVO datasetVO) 
	{
		this.datasetDao.insert(datasetVO);		
	}

	@Override
	public List search() 
	{
		List ls = this.datasetDao.search();
		return ls;
	}

	@Override
	public List searchById(DatasetVO datasetVO) 
	{
		List ls = this.datasetDao.searchById(datasetVO);
		return ls;
	}
}
