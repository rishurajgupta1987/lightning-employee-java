package com.lightning.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lightning.employee.model.Employee;
import com.lightning.employee.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class AppController {

	@Autowired
	EmployeeService empService;

	@RequestMapping(value = "/employee/all", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		System.out.println(this.getClass().getSimpleName() + " - Get all employees service is invoked.");
		return empService.getEmployees();
	}

	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee newemp) {
		System.out.println(this.getClass().getSimpleName() + " - Create new employee method is invoked.");
		return empService.addNewEmployee(newemp);
	}

}