package com.pro.adress.adressservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="t_adress_service")
public class Adress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private Long id;
	
	@Column(name="lane_1")
	private String lane_1;
	
	@Column(name="lane_2")
	private String lane_2;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private String zip;

}
