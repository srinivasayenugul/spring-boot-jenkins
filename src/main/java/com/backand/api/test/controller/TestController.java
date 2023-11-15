package com.backand.api.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String gettest() {
		return "successfully build  and  deployed in serve using jenkins"; 
	}

}
