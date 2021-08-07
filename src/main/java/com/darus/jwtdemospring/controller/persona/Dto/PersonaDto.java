package com.darus.jwtdemospring.controller.persona.Dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.darus.jwtdemospring.controller.centro.Centro;

public class PersonaDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;

	private String apellidos;

	private List<Centro> centro = new ArrayList<Centro>();

	public PersonaDto(Long id, String nombre, String apellidos, List<Centro> centro) {
		this.id = id;
		this.name = nombre;
		this.apellidos = apellidos;
		this.centro = centro;
	}
	
	public PersonaDto() {
	}

	public PersonaDto(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public List<Centro> getCentro() {
		return centro;
	}

	public void setCentro(List<Centro> centro) {
		this.centro = centro;
	}
	
}
