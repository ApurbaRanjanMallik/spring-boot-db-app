package com.tw.docker.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tw.docker.entity.Employee;
import com.tw.docker.service.impl.EmployeeServiceImpl;

@RestController
public class EmployeeAPI {
	
	@Autowired
	EmployeeServiceImpl service;
	
	@PostMapping
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
		service.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body("Employee Created");
	}
	public ResponseEntity<List<Employee>> getAllEmployee(){
		//List<Employee> el=service.getAllEmployees();
		return ResponseEntity.ok(service.getAllEmployees());
	}
}
