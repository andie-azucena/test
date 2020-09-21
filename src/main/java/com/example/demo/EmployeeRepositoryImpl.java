package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public List<Employee> getEmployees() {

		Employee emp1 = new Employee("John", "Doe", 2);
		Employee emp2 = new Employee("Jane", "Doe", 3);
		Employee emp3 = new Employee("Johnny", "Doe", 5);
		
		return Arrays.asList(emp1, emp2, emp3);
	}

}
