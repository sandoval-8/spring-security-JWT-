package com.darus.jwtdemospring.controller.persona.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.darus.jwtdemospring.controller.centro.Centro;
import com.darus.jwtdemospring.controller.persona.Persona;
import com.darus.jwtdemospring.controller.persona.service.personaService;

//@CrossOrigin(origins = "http://localhost:4200") //Referenciamos nuestra URL
@RestController
//@CrossOrigin()
@RequestMapping({"user"})
public class Controlador {
	
	private static Logger log = LoggerFactory.getLogger(Controlador.class);
	
	@Autowired
	personaService servicioPersona;
	
	//RETORNA TODAS LAS PERSONAS
	@GetMapping("/userAll")
	public List<Persona> listarAll(){
		return servicioPersona.listarAll();
	}
	
	//RETORNA PERSONA POR CENTRO  ---------
	@PostMapping("/forCentro")
	@ResponseBody
	public List<Persona> listarForCentro(@RequestBody Centro centro){
		log.info(centro.getId() + " " + centro.getNombre());
		List<Persona> personas = servicioPersona.listarForCentro(centro);
		return personas;
	} 
/*	public List<PersonaDto> listarForCentro(@RequestBody CentroDto centro){
		log.info(centro.getId() + " " + centro.getNombre());
		List<PersonaDto> personasDto = new ArrayList<PersonaDto>();
		List<Persona> personas = this.service.listarForCentro(convertidorCentro.getCentro(centro));
		for(Persona PERSONA : personas) {
			personasDto.add(convertidorPersona.getPersonaDto(PERSONA));
		}
		return personasDto;
	} */
	
	//RETORNA UNA SOLA PERSONA
	@GetMapping(path= {"/{id}"})
	public Persona listarId(@PathVariable("id") int id) {
		return servicioPersona.listarForId(id);
	}
	
	//CREA NUEVA PERSONA
	@PostMapping("/new")
	public void create(@RequestBody Persona persona) {
		servicioPersona.add(persona);
	}
	
	//MODIFICA UNA PERSONA
	@PutMapping(path= {"/{id}"})
	public Persona editar(@RequestBody Persona p, @PathVariable("id") Long id) {
		p.setId(id);
		return servicioPersona.edit(p);
	}
}