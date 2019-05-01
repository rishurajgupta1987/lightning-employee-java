package com.lightning.employee.service;

import java.util.List;

import com.lightning.employee.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();

	public Employee addNewEmployee(Employee emp);
	
}