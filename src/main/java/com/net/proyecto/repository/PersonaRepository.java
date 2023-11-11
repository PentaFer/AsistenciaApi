package com.net.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.proyecto.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
