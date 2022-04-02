package com.springboot.workers.jdbcexample.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.springboot.workers.jdbcexample.model.Worker;
import com.springboot.workers.jdbcexample.repository.WorkerRepository;

@RestController
@RequestMapping("/worker")
public class WorkerController {
	
	@Autowired
	WorkerRepository workerRepo;
	
	@GetMapping("/showWorker")
	public Worker showWorker() {
		try {
			return workerRepo.getWorker(6);
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/all/showWorkers")
	public List<Worker> showWorkers() {
		try{
			return workerRepo.getWorkers();
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/create")
	public String create() {
		try{
			Worker worker = new Worker(9, "Satyasri", "Batchu", 5000,Date.valueOf("2022-03-31"), "SD", "bsatya@org.in");
			workerRepo.add(worker);
			return worker.getFirstName()+" Added Successfully";
		} catch(SQLException e) {
			e.printStackTrace();
			return "Error";
		}		
	}
	
	@GetMapping("/update")
	public String update() {
		try {
			Worker worker = new Worker(9, "Satya", "Sri", 5000,Date.valueOf("2022-03-31"), "SD", "bat.satya@gmail.com");
			workerRepo.update(worker);
			return "Email updated successfully";
		} catch(SQLException e) {
			e.printStackTrace();
			return "Error";
		}
	}
	
	@GetMapping("/delete")
	public String delete() {
		try {
			workerRepo.delete(9);
			return "Record deleted successfully";
		} catch(SQLException e) {
			e.printStackTrace();
			return "Error";
		}
	}
	
}