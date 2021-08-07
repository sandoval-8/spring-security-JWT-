package com.darus.jwtdemospring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.darus.jwtdemospring.util.User;

@RestController
@CrossOrigin()
public class UserController {
	
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private AuthenticationManager authenticationManager;
/*
	@PostMapping("login")
	public User login(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(username, password);
            Authentication auth = authenticationManager.authenticate(authentication);
            System.out.println("isAuthenticated():"+auth.isAuthenticated());
            if(auth.isAuthenticated()) {
            	log.info("authController:"+SecurityContextHolder.getContext().getAuthentication().isAuthenticated());
            	SecurityContext securityContext = SecurityContextHolder.createEmptyContext();
                securityContext.setAuthentication(authentication);

                // Create a new session and add the security context.
                HttpSession session = request.getSession(true);
                session.setAttribute("SPRING_SECURITY_CONTEXT", securityContext);
            }
            System.out.println("Se guardo en el contexto de seguridad con exito 2");
        } catch (BadCredentialsException e) {
            throw new Exception("Invalid username or password", e);
        }

		String token = new Token().getJWTToken(username);
		response.addHeader("Authorization", token);
		User user = new User();
		user.setUser(username);
		user.setToken(token);		
		return user;  
	}
	*/
	@GetMapping("hola")
	public String saludo() {
		
		return "hola";
	}

}
