package com.tw.docker.service;

import java.util.List;

import com.tw.docker.entity.Employee;

public interface IEmployeeService {
	
	Employee addEmployee(Employee e);
	
	List<Employee> getAllEmployees();

}
