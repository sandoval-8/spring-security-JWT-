package com.darus.jwtdemospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.darus.jwtdemospring.service.ConexionService;
import com.darus.jwtdemospring.token.Token;
import com.darus.jwtdemospring.util.User;

@RestController
public class UserController {

	@Autowired
	private ConexionService servicio;

	@PostMapping("user")
	public User login(@RequestParam("user") String username, @RequestParam("password") String pwd) {	
		
		if(servicio.login(username, pwd)) {
			String token = new Token().getJWTToken(username);
			User user = new User();
			user.setUser(username);
			user.setToken(token);		
			return user;
		} 
		return null;
	}
	
	@GetMapping("hola")
	public String saludo() {
		
		return "hola";
	}

}
