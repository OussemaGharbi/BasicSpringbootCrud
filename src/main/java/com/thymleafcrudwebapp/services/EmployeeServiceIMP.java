package com.thymleafcrudwebapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleafcrudwebapp.model.Employee;
import com.thymleafcrudwebapp.repository.employeeRepository;
@Service
public class EmployeeServiceIMP implements EmployeeService {
	
	@Autowired
	employeeRepository employeeRepo;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepo.save(employee);
		
	}

	@Override
	public Optional<Employee> getEmployeeByID(long id) {
		
		Optional<Employee> e = employeeRepo.findById(id);
		return  e;
	}

	@Override
	public void delete(long id) {
		employeeRepo.deleteById(id);
		
	}

}
