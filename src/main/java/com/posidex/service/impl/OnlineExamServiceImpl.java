package com.posidex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.posidex.api.dto.LoginDetails;
import com.posidex.api.dto.UserDetails;
import com.posidex.dao.OnlineExamDAO;
import com.posidex.exception.DAOException;
import com.posidex.service.OnlineExamService;

@Service
public class OnlineExamServiceImpl  implements OnlineExamService{

	@Autowired
	private OnlineExamDAO dao;
	@Override
	public String userRegistration(UserDetails userdetails) {
		
		dao.userRegistration(userdetails);
		
		return null;
	}
	@Override
	public UserDetails getUserLoginDetails(LoginDetails loginDetails) {
		UserDetails userDetails=null;
		try {
			userDetails = dao.getUserLoginDetails(loginDetails);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			if(userDetails==null) {
				userDetails=new UserDetails();
				userDetails.setMessage(e.getMessage());
			}
			e.printStackTrace();
		}
		return userDetails;
	}
	
	
	

}
