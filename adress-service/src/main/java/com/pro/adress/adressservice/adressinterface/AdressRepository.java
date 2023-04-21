package com.pro.adress.adressservice.adressinterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pro.adress.adressservice.entity.Adress;

public interface AdressRepository extends JpaRepository<Adress, Long> {
	@Query(value="select a.id,a.lane_1,a.lane_2,a.state,a.zip from t_adress_service a join t_employee e on a.employee_id=e.id where a.employee_id= :empid",nativeQuery = true)
	Adress findAdressByEmployeeId(@Param("empid") Long empid);



}
