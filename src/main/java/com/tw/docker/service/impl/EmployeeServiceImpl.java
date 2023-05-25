package com.tw.docker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tw.docker.entity.Employee;
import com.tw.docker.repository.EmployeeRepository;
import com.tw.docker.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Override
	public Employee addEmployee(Employee e) {

		return repository.save(e);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return repository.findAll();
	}

}
