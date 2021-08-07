package com.darus.jwtdemospring.controller.util;

import org.springframework.stereotype.Component;

import com.darus.jwtdemospring.controller.centro.Centro;
import com.darus.jwtdemospring.controller.centro.Dto.CentroDto;

@Component
public class convertCentro {
	
	public Centro getCentro(CentroDto centroDto) {
		Centro centro = new Centro();
		centro.setId(centro.getId());
		centro.setNombre(centroDto.getNombre());
//		centro.setPersonal(centroDto.getPersonal());
		return centro;
	}
}
