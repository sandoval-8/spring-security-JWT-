package com.darus.jwtdemospring.controller.centro.service;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darus.jwtdemospring.controller.centro.Centro;
import com.darus.jwtdemospring.controller.centro.repository.centroRepository;

@Service
public class centroServiceImpl implements centroService {
	
	@Autowired
	private centroRepository repositorio;
	
	private static Logger log = org.slf4j.LoggerFactory.getLogger(centroServiceImpl.class);
	
	@Override
	public List<Centro> getCentros() {
		// TODO Auto-generated method stub
		List<Centro> lista = this.repositorio.findAll();
		log.info(lista.get(0).toString());
		return lista;
	}

}
