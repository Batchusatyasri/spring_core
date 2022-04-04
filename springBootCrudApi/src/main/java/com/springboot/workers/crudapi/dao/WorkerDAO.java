package com.springboot.workers.crudapi.dao;

import com.springboot.workers.crudapi.model.Worker;

import java.sql.*;
import java.util.List;
import javax.sql.DataSource;

public interface WorkerDAO {
	
	public int insertWorker(Worker worker) throws SQLException;

	public void deleteWorkerById(int workerId) throws SQLException;

	public Worker findWorkerById(int workerId) throws SQLException;

	public List<Worker> findAllWorkers() throws SQLException;

	public void replaceWorker(Worker worker) throws SQLException;
	
	public boolean updateWorkerEmailById(int workerId,String email) throws SQLException;
}