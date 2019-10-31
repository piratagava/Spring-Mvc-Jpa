package com.hernan.app.service;

import java.util.List;

import com.hernan.app.model.Persona;

//se crean los metodos para implementar los servicios 
public interface PersonaService {
	
	public void crearPersona(Persona persona);

	public void eliminarPersona(Integer id_persona);

	public List<Persona> getAllPersonas();

	public void actualizarPersona(Persona persona);

	//para buscar a un registro persona por medio de su id_persona
	public Persona getPersona(int id_persona);
}