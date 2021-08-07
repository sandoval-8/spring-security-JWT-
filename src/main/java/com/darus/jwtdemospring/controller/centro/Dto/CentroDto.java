package com.darus.jwtdemospring.controller.centro.Dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.darus.jwtdemospring.controller.centro.Centro;
import com.darus.jwtdemospring.controller.persona.Persona;


public class CentroDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String nombre;

	private List<Persona> personal = new ArrayList<Persona>();

	public CentroDto(Centro centro) {
		this.id = centro.getId();
		this.nombre = centro.getNombre();
//		this.personal = centro.getPersonal();
	}

	public CentroDto(Long id, String nombre, List<Persona> personal) {
		this.id = id;
		this.nombre = nombre;
		this.personal = personal;
	}
	
	public CentroDto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> getPersonal() {
		return personal;
	}

	public void setPersonal(List<Persona> personal) {
		this.personal = personal;
	}
	
}