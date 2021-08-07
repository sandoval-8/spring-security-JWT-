package com.darus.jwtdemospring.security.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.darus.jwtdemospring.security.models.Usuario;
import com.darus.jwtdemospring.security.repository.usuarioRepositorio;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private static Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

	@Autowired
	private usuarioRepositorio repositorio;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Nombre:" + username);
		Usuario usuario = repositorio.findByUsername(username);
		try {
			if (usuario != null) {
				log.info("EL USUARIO SE RECUPERO CON EXITO (gener. UserDetails)");
				List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
				roles.add(new SimpleGrantedAuthority("ROLE_USER"));
				User userLoger = new User(usuario.getUsername(), 
						usuario.getPassword(), 
						usuario.isEnabled(),
						usuario.isAccountNonExpired(), 
						usuario.isCredentialsNonExpired(), 
						usuario.isAccountNonLocked(),
						roles);
				return userLoger;
			}
		} catch (UsernameNotFoundException error) {
			return new User(null, null, null);
		}
		return new User(null, null, null);
	}

}
