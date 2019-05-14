package com.spring.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Employee;
import com.spring.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Transactional
	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);
	}

	@Transactional
	public List<Employee> getAllEmployees() {
		return StreamSupport.stream(employeeRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}
}
