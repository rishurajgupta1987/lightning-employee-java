package com.lightning.employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lightning.employee.model.Employee;

@Repository
public interface Employeedaorepository extends CrudRepository<Employee, String> {

}