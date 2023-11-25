package com.net.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.proyecto.entity.Usuario;
import com.net.proyecto.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	
	@Override
	public List<Usuario> listarUsuarios() {
		return repository.findAll();
	}

	@Override
	public Usuario insertarUsuario(Usuario obj) {
		return repository.save(obj);
	}

	@Override
	public Usuario iniciarSesion(String usuario, String contrasena) {
		 // Implementa la lógica para validar las credenciales y devolver el usuario autenticado
        return repository.findByUsuarioAndContrasena(usuario, contrasena);
	}

}
