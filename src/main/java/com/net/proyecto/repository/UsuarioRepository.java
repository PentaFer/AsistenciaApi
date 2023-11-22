package com.net.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.proyecto.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
