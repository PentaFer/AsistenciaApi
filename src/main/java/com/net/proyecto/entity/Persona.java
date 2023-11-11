package com.net.proyecto.entity;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_persona;  
	private String nombre; 
	private String apellidoPaterno; 
    private String apellidoMaterno;
    private String dni; 
    private String correo; 
    private String direccion; 
    private int numero_hijos; 
    private String asegurado;
    private double sueldo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
    private Date fechaDeNacimiento;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    
    @ManyToOne
    @JoinColumn(name = "id_estado_civil")
    private EstadoCivil estadoCivil;
    
    @ManyToOne
    @JoinColumn(name = "id_tipo_seguro")
    private TipoSeguro tipoSeguro;
    

}
