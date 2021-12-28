package com.thymleafcrudwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thymleafcrudwebapp.model.Employee;


@Repository
public interface employeeRepository extends JpaRepository<Employee, Long> {

}
