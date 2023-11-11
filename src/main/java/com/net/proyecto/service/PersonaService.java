package com.net.proyecto.service;

import java.util.List;

import com.net.proyecto.entity.Persona;

public interface PersonaService {
	
	
	public abstract List<Persona> listaPersonas();
	
	public abstract Persona insertaPersona(Persona persona);
	
	public abstract Persona actualizaPersona(Persona persona);
	
	public abstract void eliminarPersona(int id);


}
