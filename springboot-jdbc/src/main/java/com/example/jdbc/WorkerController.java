package com.example.jdbc;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapp.model.Worker;
@RestController
@RequestMapping("/worker")
public class WorkerController {
	 Worker emp = new Worker(9, "Satya", "Sri", 50000, new Date(), "new",
             "b.sri@my_org.in");
	 Worker emp1 = new Worker(10, "Adaka", "Vani", 60000, new Date(), "new",
             "a.vani@my_org.in");
	 Worker emp2 = new Worker(11, "Kavya", "Allu", 70000, new Date(), "new",
             "k.allu1@my_org.in");
	 
	@GetMapping("/showWorker")
	public Worker task() {
		
		return emp;
	}
	
	@GetMapping("/all/showWorkers")
	public List<Worker> showHobbies() {
		return List.of(emp,emp1,emp2);
	}
}