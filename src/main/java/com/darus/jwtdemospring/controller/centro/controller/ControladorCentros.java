package com.darus.jwtdemospring.controller.centro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darus.jwtdemospring.controller.centro.Centro;
import com.darus.jwtdemospring.controller.centro.service.centroService;

//@CrossOrigin(origins = "http://localhost:4200") //Referenciamos nuestra URL
@RestController
//@CrossOrigin()
@RequestMapping({"/centros"})
public class ControladorCentros {

	@Autowired
	centroService service;
	
	@GetMapping
	public List<Centro> centros(){
		return this.service.getCentros();
	}
}
