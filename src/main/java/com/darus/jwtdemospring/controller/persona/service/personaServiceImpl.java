package com.darus.jwtdemospring.controller.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darus.jwtdemospring.controller.centro.Centro;
import com.darus.jwtdemospring.controller.persona.Persona;
import com.darus.jwtdemospring.controller.persona.repository.personaRepository;

@Service
public class personaServiceImpl implements personaService{
	
	@Autowired
	private personaRepository repositorio;
	
	@Override
	public List<Persona> listarAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}
	
	//DEVOLVER PERSONAS POR CENTRO
	
	@Override
	public List<Persona> listarForCentro(Centro centro) {
		// TODO Auto-generated method stub
		
		return repositorio.findByCentro(centro);
	}
	
	@Override
	public Persona listarForId(int id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}

	@Override
	public Persona add(Persona p) {
		// TODO Auto-generated method stub
		return repositorio.save(p);
	}

	@Override
	public Persona edit(Persona p) {
		// TODO Auto-generated method stub
		return repositorio.save(p);
	}

	@Override
	public Persona delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
