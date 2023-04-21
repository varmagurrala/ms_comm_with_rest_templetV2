package com.pro.employeservice.serviceimppl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pro.employeservice.dto.AdressResponce;
import com.pro.employeservice.dto.EmployeeDto;
import com.pro.employeservice.entity.Empolyee;
import com.pro.employeservice.exception.EmpNotFound;
import com.pro.employeservice.repository.EmployeeRepository;
import com.pro.employeservice.service.EmployeeService;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeServiceimpl implements EmployeeService  {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public EmployeeDto saveEmployee(EmployeeDto empolyee) {
		
		Empolyee emp= modelMapper.map(empolyee, Empolyee.class);
		
		Empolyee savedemp = employeeRepository.save(emp);
		
		return modelMapper.map(savedemp, EmployeeDto.class);
	}
	
	@Override
	public EmployeeDto getById(Long empid) {
		
		
		
		Empolyee emp = employeeRepository.findById(empid).orElseThrow(()
				-> new EmpNotFound(String.format("the %d not found", empid)) );
		
		log.info("employee"+emp);
		
		EmployeeDto dto=modelMapper.map(emp, EmployeeDto.class);
		
		 AdressResponce adressResponce= restTemplate.getForObject("http://localhost:8080/adress-app/api/{empid}", AdressResponce.class, empid);
		 log.info("adress"+adressResponce);
		 dto.setAdressResponce(adressResponce);
		
		return  dto;
	}
	
}
	


