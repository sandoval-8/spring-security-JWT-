package com.darus.jwtdemospring.controller.util;

import org.springframework.stereotype.Component;

import com.darus.jwtdemospring.controller.persona.Persona;
import com.darus.jwtdemospring.controller.persona.Dto.PersonaDto;

@Component
public class convertPersona {
	
	public PersonaDto getPersonaDto(Persona persona) {
		PersonaDto personaDto = new PersonaDto();
		personaDto.setId(persona.getId());
		personaDto.setName(persona.getName());
		personaDto.setApellidos(persona.getApellidos());
	//	personaDto.setCentro(persona.getCentro());
		return personaDto;
	}
}
