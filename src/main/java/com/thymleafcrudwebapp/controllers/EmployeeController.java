package com.thymleafcrudwebapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thymleafcrudwebapp.model.Employee;
import com.thymleafcrudwebapp.services.EmployeeServiceIMP;


@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeServiceIMP employeeServiceIMP ;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		
		
		model.addAttribute("listemployees", employeeServiceIMP.getAllEmployees());
		
		
		return "index" ;
	}
	@GetMapping("/showNewEmployeeForm")
	public String EmployeeFrom(Model model) {
		
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		
		return "new_employee";
	}
	@PostMapping("/saveEmployee")
	public String SaveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeServiceIMP.saveEmployee(employee);
		return"redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable long id) {
		
		employeeServiceIMP.delete(id);
		
		return "redirect:/";
		
	}
	
	
	@GetMapping("/showFormUpdate/{id}")
	public String showFromUpdate(@PathVariable(value="id") long id ,Model model) {
		Optional<Employee> emp = employeeServiceIMP.getEmployeeByID(id);
		
		model.addAttribute("employee", emp);
		return "update_employee" ;
	}
	
	
	@PostMapping("/editEmployee")
	public String editEmployee(@PathVariable long id) {
		
		Employee emp = new Employee();
		
		return " " ;
	}

}
