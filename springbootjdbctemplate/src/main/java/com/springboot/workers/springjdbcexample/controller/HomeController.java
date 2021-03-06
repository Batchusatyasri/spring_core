package com.springboot.workers.springjdbcexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.workers.springjdbcexample.util.DateTimeUtilities;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "<h1> Hello visitor!\nVisiting time:</h1> "+DateTimeUtilities.getTimeStamp();
	}
}