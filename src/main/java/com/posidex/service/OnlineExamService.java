package com.posidex.service;

import com.posidex.api.dto.LoginDetails;
import com.posidex.api.dto.UserDetails;

public interface OnlineExamService {

	String userRegistration(UserDetails userdetails);

	UserDetails getUserLoginDetails(LoginDetails loginDetails);

}
