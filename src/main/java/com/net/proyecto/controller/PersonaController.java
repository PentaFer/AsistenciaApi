package com.net.proyecto.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	@PostMapping("/registrar")
	@ResponseBody
	public ResponseEntity<?> insertaPersona(@RequestBody Persona obj){
		HashMap<String, String> mensaje = new HashMap<>();
		Persona objSalida = service.insertaPersona(obj);
		if (objSalida == null) {
			mensaje.put("mensaje", "Error en el registro");
		}else {
			mensaje.put("mensaje", "Se ha registrado el Alumno de ID " + objSalida.getId_persona());
		}
		return ResponseEntity.ok(mensaje);
	}
	
	@PutMapping("/actualizar")
	@ResponseBody
	public ResponseEntity<?> actualizaPersona(@RequestBody Persona obj){
		HashMap<String, String> mensaje = new HashMap<>();
		
		Optional<Persona> optPersona = service.buscarPersona(obj.getId_persona());
		if (optPersona.isPresent()) {
			Persona objSalida = service.actualizaPersona(obj);
			if (objSalida == null) {
				mensaje.put("mensaje", "Error en el registro");
			}else {
				mensaje.put("mensaje", "Se ha actualizado el Alumno de ID " + objSalida.getId_persona());
			}
		}else {
			mensaje.put("mensaje", "No existe alumno de ID " + obj.getId_persona());
		}
		return ResponseEntity.ok(mensaje);
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity<?> eliminaPersona(@PathVariable("id") int idPersona){
		HashMap<String, String> mensaje = new HashMap<>();
		Optional<Persona> optPersona = service.buscarPersona(idPersona);
		if (optPersona.isPresent()) {
			service.eliminarPersona(idPersona);
			mensaje.put("mensaje", "Se ha eliminado el Alumno de ID " + idPersona);
		}else {
			mensaje.put("mensaje", "No existe alumno de ID " + idPersona);
		}
		return ResponseEntity.ok(mensaje);
	}
	
	
	@GetMapping("/{id}")
	@ResponseBody
	public Optional<Persona> listaPorId(@PathVariable("id") int idPersona ){
		Optional<Persona> listaSalida = service.buscarPersona(idPersona);
		return listaSalida;
	}
	

}
