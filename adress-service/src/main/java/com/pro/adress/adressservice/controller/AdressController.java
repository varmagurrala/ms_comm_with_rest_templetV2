package com.pro.adress.adressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.adress.adressservice.responce.AdressResponce;
import com.pro.adress.adressservice.service.AdressService;

@RestController
@RequestMapping
public class AdressController {
	
	@Autowired
	private AdressService adressService;
	
	@GetMapping("/{empid}")
	public ResponseEntity<AdressResponce> getAdressByempid(@PathVariable( name="empid") long empid) {
		
		AdressResponce adressResponce= null;
		adressResponce= adressService.adressResponce(empid);
		
		return new ResponseEntity<>(adressResponce,HttpStatus.OK);
	}

}
