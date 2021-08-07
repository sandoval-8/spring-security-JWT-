package com.darus.jwtdemospring.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.darus.jwtdemospring.security.models.Usuario;

public interface usuarioRepositorio extends JpaRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
