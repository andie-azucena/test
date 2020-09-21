package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return repo.getEmployees();
	}

}
