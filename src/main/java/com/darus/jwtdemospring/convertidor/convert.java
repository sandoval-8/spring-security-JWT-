package com.darus.jwtdemospring.convertidor;

import java.util.ArrayList;
import java.util.List;

import com.darus.jwtdemospring.entity.usuario;
import com.darus.jwtdemospring.util.User;
import com.darus.jwtdemospring.util.usuarioRespuesta;

public class convert {
	
	public List<usuarioRespuesta> convertToList(List<usuario> listaUsuario){
		
		List<usuarioRespuesta> lista = new ArrayList<>();
		
		for(usuario list : listaUsuario) {
			lista.add(new usuarioRespuesta(list));
		}
		return lista;
	}

}
