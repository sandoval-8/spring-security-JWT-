package com.darus.jwtdemospring.controller.persona.service;

import java.util.List;

import com.darus.jwtdemospring.controller.centro.Centro;
import com.darus.jwtdemospring.controller.persona.Persona;

public interface personaService {
	
	List<Persona> listarAll(); //No creo que lo use
	
	List<Persona> listarForCentro(Centro centro);
	
	Persona listarForId(int id);
	
	Persona add(Persona p);
	
	Persona edit(Persona p);
	
	Persona delete(int id);
}
