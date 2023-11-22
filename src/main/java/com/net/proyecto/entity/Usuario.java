package com.net.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "usuario")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_usuario;
	
		
	
	private String usuario;
	
	private String contrasena;
	
	
	
	@ManyToOne
	@JoinColumn(name = "id_persona")
	private Persona persona;
	
	
	@ManyToOne
	@JoinColumn(name = "id_rol")
	private Rol rol;
}
