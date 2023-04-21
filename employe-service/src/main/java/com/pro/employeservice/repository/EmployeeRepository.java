package com.pro.employeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.employeservice.entity.Empolyee;

public interface EmployeeRepository extends JpaRepository<Empolyee, Long> {

}
