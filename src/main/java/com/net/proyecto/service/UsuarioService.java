package com.net.proyecto.service;

import java.util.List;

import com.net.proyecto.entity.Usuario;

public interface UsuarioService {
	
	
	public List<Usuario> listarUsuarios();
	
	public Usuario insertarUsuario (Usuario obj);
	
	 // Nueva función para iniciar sesión
	Usuario iniciarSesion(String usuario, String contrasena);

}
