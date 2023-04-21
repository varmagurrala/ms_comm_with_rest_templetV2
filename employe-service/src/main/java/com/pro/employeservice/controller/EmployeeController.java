package com.pro.employeservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.employeservice.dto.EmployeeDto;
import com.pro.employeservice.service.EmployeeService;

@RestController
@RequestMapping
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/create")
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto empolyee){
		
		return new  ResponseEntity<>(employeeService.saveEmployee(empolyee),HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{empid}")
	public ResponseEntity<EmployeeDto> getById(@PathVariable(name="empid") Long empid ){
		
		EmployeeDto emp= employeeService.getById(empid);
		
		return new  ResponseEntity<EmployeeDto>(emp,HttpStatus.OK);
		
	}
	
	
}
