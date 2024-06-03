package com.posidex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DedupeController {
	
	@GetMapping("helloWelcome")
	public String getDemodetails() {
		
		return "welcome demo details ";
	}

}
