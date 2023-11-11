package com.net.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.proyecto.entity.Persona;
import com.net.proyecto.service.PersonaService;

@RestController
@RequestMapping("/api/v1")
public class PersonaController {
	
	@Autowired
	private PersonaService service;
	
	
	@GetMapping
	@ResponseBody
	public List<Persona> listaPersonas(){
		List<Persona> listaSalida = service.listaPersonas();
		return listaSalida;
	}

}
