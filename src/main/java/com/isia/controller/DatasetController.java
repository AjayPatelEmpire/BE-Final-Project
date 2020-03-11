package com.isia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.isia.model.DatasetVO;
import com.isia.service.DatasetService;


@Controller
public class DatasetController 
{
	@Autowired
	DatasetService datasetService;
	
	@RequestMapping(value="/admin/addDataset",method=RequestMethod.GET)
	public ModelAndView addDatasetLoad()
	{
		return new ModelAndView("admin/addDataset","insertData",new DatasetVO()); 
	}
	@RequestMapping(value="/admin/Datasetinsert",method=RequestMethod.POST)
	public ModelAndView datasetInsert(@ModelAttribute DatasetVO datasetVO,@RequestParam(name="file") MultipartFile file,HttpSession session)
	{
		String path=session.getServletContext().getRealPath("/");
		String dataset=file.getOriginalFilename();
		String finalPath =path+"\\document\\dataset\\";
		try{
			
		byte b[]=file.getBytes();
		BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(finalPath+dataset));
		bufferedOutputStream.write(b);
		bufferedOutputStream.flush();
		bufferedOutputStream.close();
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		datasetVO.setDataset(dataset);
		datasetVO.setFilePath(finalPath);
		this.datasetService.insert(datasetVO);
		return new ModelAndView("redirect:/admin/addDataset"); 
	}
	@RequestMapping(value="/admin/viewDataset",method=RequestMethod.GET)
	public ModelAndView viewDatasetLoad(@ModelAttribute DatasetVO datasetVO)
	{
		List ls=this.datasetService.search();
		System.out.println(ls.size());
		return new ModelAndView("admin/viewDataset","viewDataset",ls); 
	}
	@RequestMapping(value="/admin/deleteViewData",method=RequestMethod.GET)
	public ModelAndView deleteViewData(@ModelAttribute DatasetVO datasetVO,@RequestParam int id)
	{
		datasetVO.setId(id);
		List ls=this.datasetService.searchById(datasetVO);
		DatasetVO d=(DatasetVO)ls.get(0);
		d.setStatus(false);
		this.datasetService.insert(d);
		return new ModelAndView("redirect:/viewDataset"); 
	}
	@RequestMapping(value="/admin/editViewData",method=RequestMethod.GET)
	public ModelAndView editViewData(@ModelAttribute DatasetVO datasetVO,@RequestParam int id)
	{
		datasetVO.setId(id);
		List ls=this.datasetService.searchById(datasetVO);
		return new ModelAndView("admin/addDataset","insertData",(DatasetVO)ls.get(0)); 
	}
}
