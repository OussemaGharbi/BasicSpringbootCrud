package com.thymleafcrudwebapp.services;

import java.util.List;
import java.util.Optional;

import com.thymleafcrudwebapp.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Optional<Employee> getEmployeeByID(long id);
	void delete (long id);

}
