package com.pro.adress.adressservice.responce;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdressResponce {
	
	private Long id;
	private String lane_1;
	private String lane_2;
	private String state;
	private String zip;
	
	

}
