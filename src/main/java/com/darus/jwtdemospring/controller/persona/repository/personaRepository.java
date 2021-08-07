package com.darus.jwtdemospring.controller.persona.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.darus.jwtdemospring.controller.centro.Centro;
import com.darus.jwtdemospring.controller.persona.Persona;

public interface personaRepository extends Repository<Persona, Integer> {

	List<Persona> findAll();
	
	List<Persona> findByCentro(Centro centro);
	
	Persona findById(int id);
	
	Persona save(Persona p);
	
	void delete(Persona p);
}