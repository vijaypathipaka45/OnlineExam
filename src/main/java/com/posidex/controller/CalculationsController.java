package com.posidex.controller;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.posidex.api.dto.LoginDetails;
import com.posidex.api.dto.UserDetails;

@RestController
public class CalculationsController {
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value="addingtwonumbers/{firstNumber}/and/{secondNumber}")
	public String addNumbers(@PathVariable Integer firstNumber,@PathVariable Integer secondNumber) {
		
		int sum=firstNumber+secondNumber;
		
		return String.valueOf(sum);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value="substraction/{firstNumber}/and/{secondNumber}")
	public String substracting(@PathVariable int firstNumber,@PathVariable int secondNumber) {
		
		int value=firstNumber-secondNumber;
		
		return String.valueOf(value);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value="multiplication/{firstNumber}/and/{secondNumber}")
	public String multiplication(@PathVariable int firstNumber,@PathVariable int secondNumber) {
		
		int value=firstNumber*secondNumber;
		
		return String.valueOf(value);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value="division/{firstNumber}/and/{secondNumber}")
	public String divison(@PathVariable int firstNumber,@PathVariable int secondNumber) {
		
		double value=firstNumber/secondNumber;
		System.out.println("inside division method");
		return String.valueOf(value);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(value="loginUser",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public LoginDetails loginUser(@RequestBody LoginDetails userdertails) {
		LoginDetails user=null;
		if("vijay".equalsIgnoreCase(userdertails.getEmailId()) && "vijay".equals(userdertails.getPassword())){
			user= new LoginDetails();
			user.setEmailId(userdertails.getEmailId());
			user.setPassword(userdertails.getPassword());
			user.setLoginStatus(true);
		}
		else {
			user=new LoginDetails();
			user.setLoginStatus(false);
		}
		
		return user;
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value="loginUser/{uname}/and/{password}",produces=MediaType.APPLICATION_JSON_VALUE)
	public LoginDetails getloginUser(@PathVariable String uname,@PathVariable String password ) {
		LoginDetails user=null;
		if("vijay".equalsIgnoreCase(uname) && "vijay".equals(password)){
			user= new LoginDetails();
			user.setEmailId(uname);
			user.setPassword(password);
			user.setLoginStatus(true);
		}
		else {
			user=new LoginDetails();
			user.setLoginStatus(false);
		}
		
		return user;
	}

}
