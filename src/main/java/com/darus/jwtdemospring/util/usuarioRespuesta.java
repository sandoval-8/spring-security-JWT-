package com.darus.jwtdemospring.util;

import javax.persistence.Column;

public class usuarioRespuesta {
	
	
	public usuarioRespuesta(com.darus.jwtdemospring.entity.usuario user) {
		this.id = user.getId();
		this.usuario = user.getUsuario();
		this.contrasena = user.getContrasena();
		this.rol = user.getRol();
		this.activo = user.isActivo();
	}

	private long id;	
	private String usuario;	
	private String contrasena;	
	private byte rol;	
	private boolean activo;

	@Override
	public String toString() {
		return "usuario [id=" + id + ", usuario=" + usuario + ", contrasena=" + contrasena + ", rol=" + rol
				+ ", activo=" + activo + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public byte getRol() {
		return rol;
	}

	public void setRol(byte rol) {
		this.rol = rol;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
