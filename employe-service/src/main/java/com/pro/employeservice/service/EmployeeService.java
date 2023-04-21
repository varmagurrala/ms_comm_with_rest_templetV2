package com.pro.employeservice.service;

import java.util.Optional;

import com.pro.employeservice.dto.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto saveEmployee(EmployeeDto empolyee);
	
	EmployeeDto getById(Long empid);

}
