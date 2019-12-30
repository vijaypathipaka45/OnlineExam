package com.posidex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.posidex.api.dto.LoginDetails;
import com.posidex.api.dto.UserDetails;
import com.posidex.service.OnlineExamService;

@RestController
public class OnlineExamController {
	
	@Autowired
	private OnlineExamService service;

	@GetMapping("getDetails")
	public String getStringDetails() {
		
		return "welcome";
	}
	
	@PostMapping(value="getAllUsers",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<UserDetails> getAllUsers(@RequestBody LoginDetails loginDetails) {
		List<UserDetails> users=null;
		
		return users;
	}
	
	
	@PostMapping(value="registration",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String userRegistration(@RequestBody UserDetails userdetails) {
		
		System.out.println("inside controller");
		service.userRegistration(userdetails);
		
		return "";
	}
	
	@PostMapping(value="authentication",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public UserDetails getUserLoginDetails(@RequestBody LoginDetails loginDetails) {
		
		UserDetails userDetails=service.getUserLoginDetails(loginDetails);
		
		return userDetails;
	}
	
	
	
	
}
