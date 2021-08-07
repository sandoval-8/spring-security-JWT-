package com.darus.jwtdemospring.controller.centro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darus.jwtdemospring.controller.centro.Centro;

public interface centroRepository extends JpaRepository<Centro, Long> {
	
	List<Centro> findAll();
}
