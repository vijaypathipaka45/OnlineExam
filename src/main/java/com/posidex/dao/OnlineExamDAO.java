package com.posidex.dao;

import com.posidex.api.dto.LoginDetails;
import com.posidex.api.dto.UserDetails;
import com.posidex.exception.DAOException;

public interface OnlineExamDAO {

	void userRegistration(UserDetails userdetails);
	
	public UserDetails getUserLoginDetails(LoginDetails loginDetails) throws DAOException;


}
