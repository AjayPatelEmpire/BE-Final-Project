package com.isia.controller;
import com.isia.model.ComplainVO;
import com.isia.model.LoginVO;
import com.isia.service.ComplainService;
import com.isia.service.LoginService;
import com.isia.utils.Basemethods;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.stream.FileImageInputStream;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserComplainController 
{

	@Autowired
	ComplainService complainService;
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/worker/addComplain",method=RequestMethod.GET)
	public ModelAndView userAddComplainLoad()
	{
		
		return new ModelAndView("worker/addComplain","complainVO",new ComplainVO()); 
	}
	@RequestMapping(value="/worker/insertComplain",method=RequestMethod.POST)
	public ModelAndView insertComplainLoad(@ModelAttribute ComplainVO complainVO,@RequestParam(name="file") MultipartFile file,HttpSession session)
	{
		String path=session.getServletContext().getRealPath("/");
		String complFile=file.getOriginalFilename();
		String finalPath =path+"\\document\\complain\\";
		try{
			
		byte b[]=file.getBytes();
		BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(finalPath+complFile));
		bufferedOutputStream.write(b);
		bufferedOutputStream.flush();
		bufferedOutputStream.close();
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		Date d=new Date();
		DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		complainVO.setComplainDate(dateFormat.format(d));
		
		String username=Basemethods.getUser();
		List loginlist=loginService.searchLoginID(username);
		LoginVO loginVO=(LoginVO) loginlist.get(0);
		complainVO.setLoginVO(loginVO);
		complainVO.setComplainStatus("pending");
		complainVO.setComplainFileName(complFile);
		complainVO.setComplainFilePath(finalPath);
		System.out.println("loginId:::::"+complainVO.getLoginVO().getLoginId());
		
		System.out.println("subject:::::"+complainVO.getComplainSubject());
		System.out.println("desc...:::::"+complainVO.getComplainDesription());
		
		this.complainService.insertComplain(complainVO);
		return new ModelAndView("redirect:/worker/addComplain"); 
	}
	
	@RequestMapping(value="/worker/viewComplain",method=RequestMethod.GET)
	public ModelAndView userViewComplainLoad(@ModelAttribute ComplainVO complaintVO)
	{
		String userName = Basemethods.getUser();

		List loginList  = loginService.searchLoginID(userName);
    	
    	
		LoginVO loginVO2 = (LoginVO) loginList.get(0);
		
		complaintVO.setLoginVO(loginVO2);
		
		List complaintList = this.complainService.seeComplaint(complaintVO);
		
		return new ModelAndView("/worker/viewComplain","complaintList",complaintList);
		 
	}
}
