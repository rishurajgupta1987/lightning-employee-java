package com.lightning.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightning.employee.dao.Employeedaorepository;
import com.lightning.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	Employeedaorepository employeeRepo;

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		try {
			employeeRepo.findAll().forEach(employees::add);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return employees;
	}

	@Override
	public Employee addNewEmployee(Employee emp) {
		return employeeRepo.save(emp);
	}
}