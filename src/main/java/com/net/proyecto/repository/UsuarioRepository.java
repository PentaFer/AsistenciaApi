package com.net.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.proyecto.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	// Método para buscar un usuario por usuario y contraseña
    Usuario findByUsuarioAndContrasena(String usuario, String contrasena);
    
}
