package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	//@RequestMapping(value="/RestAPI", method=RequestMethod.GET)
	
	@GetMapping("/rest")
	//@ResponseBody
	public String REST_API() {
		
		return "This is the REST API Controller...";
	}
}
