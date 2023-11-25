package com.net.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.net.proyecto.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	@Query("{'usuario': ?0, 'contrasena': ?1}")
	public Usuario login(String usuario, String contrasena);
    
}
