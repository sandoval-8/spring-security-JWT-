package com.darus.jwtdemospring.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darus.jwtdemospring.entity.usuario;

public interface Repositorio extends JpaRepository<usuario, Serializable> {
	
	public abstract usuario findByUsuario(String usuario);
	
	public abstract usuario findByUsuarioAndContrasena(String usuario, String password);
	
}
