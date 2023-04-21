package com.pro.adress.adressservice.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.adress.adressservice.adressinterface.AdressRepository;
import com.pro.adress.adressservice.entity.Adress;
import com.pro.adress.adressservice.responce.AdressResponce;
import com.pro.adress.adressservice.service.AdressService;

@Service
public class AdressServiceImpl implements AdressService {
	
	@Autowired
	private AdressRepository adressRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public AdressResponce adressResponce(Long empid) {
		
		Adress adress= adressRepository.findAdressByEmployeeId(empid);
		
		AdressResponce adressResponce = modelMapper.map(adress, AdressResponce.class);
		return adressResponce ;
	}

}
