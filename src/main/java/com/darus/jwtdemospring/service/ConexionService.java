package com.darus.jwtdemospring.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.darus.jwtdemospring.convertidor.convert;
import com.darus.jwtdemospring.entity.usuario;
import com.darus.jwtdemospring.repository.Repositorio;
import com.darus.jwtdemospring.util.usuarioRespuesta;

@Service
public class ConexionService{
	
	@Autowired
	private Repositorio repo;
	
	public boolean login(String username, String password) {		
		if(repo.findByUsuarioAndContrasena(username, password) != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean guardar(usuario USUARIO) {
		if(repo.save(USUARIO) != null) {
			return true;
		}		
		return true;
	}
	
	public boolean eliminar(usuario USUARIO) {
		try{
			repo.delete(USUARIO);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<usuarioRespuesta> consultar(){
		List<usuario> us = repo.findAll();
		List<usuarioRespuesta> listaUsuarios=  new convert().convertToList(us);
		return listaUsuarios;
	}
	
		

}
