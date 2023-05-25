package com.tw.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tw.docker.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
