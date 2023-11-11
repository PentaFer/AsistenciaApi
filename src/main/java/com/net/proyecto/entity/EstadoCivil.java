package com.net.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "estadocivil")
public class EstadoCivil {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_estado_civil;
	
	private String nombre;
	
	private String descripcion;
	
}
