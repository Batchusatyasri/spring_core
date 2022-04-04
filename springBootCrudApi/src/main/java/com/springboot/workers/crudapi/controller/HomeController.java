package com.springboot.workers.crudapi.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.springboot.workers.crudapi.util.DateTimeUtilities;
@RestController
public class HomeController
{
	@GetMapping("/")
	public String index()
	{
		return "<h1> Hello Visitor: <br/> Visiting time: </h1>" +DateTimeUtilities.getTimeStamp();
	}
}
