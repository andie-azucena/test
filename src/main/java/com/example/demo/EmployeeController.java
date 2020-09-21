package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping("/message")
	public ResponseEntity<?> getMessage() {
		return ResponseEntity.ok().body("Hello World");
	}
	
	@GetMapping("/employees")
	public ResponseEntity<?> getEmployees() {
		return ResponseEntity.ok().body(service.getEmployees());
	}
	
}
