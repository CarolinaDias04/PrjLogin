package com.caroldias.demo.service;

import org.springframework.stereotype.Service;

import com.caroldias.demo.entities.Usuario;
@Service
public class LoginService {

	public  boolean validarLogin(Usuario usuario) {
		return "admin".equals( usuario.getUsername()) && "1234".equals(usuario.getPassword());
	}
	
	
}
