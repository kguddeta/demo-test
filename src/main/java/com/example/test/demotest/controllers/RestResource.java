package com.example.test.demotest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestResource {
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String getMessage() {
		return "Hello, there!";
	}

}
