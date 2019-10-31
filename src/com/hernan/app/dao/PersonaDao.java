package com.hernan.app.dao;

import java.util.List;

import com.hernan.app.model.Persona;

/*definimos nuestra lista de metodos ocupando interface
 los cuales se declaran para las acciones que llevara nuestro objeto*/ 
 public interface PersonaDao {
	
	 //para crear un nuevo registro
	public void crearPersona(Persona persona);

	//sirve para eliminar los registros
	public void eliminarPersona(Integer id_persona);

	//Creamos una lista que regresara todos los datos de nuestra tabla registro Persona
	public List<Persona> getAllPersonas();
	
	//actualiza los datos de la persona
	public void actualizarPersona(Persona persona);
	
	//permite obtener el id de la Persona para realizar una busqueda o utilizarla para poder actualizar los datos
	public Persona getPersona(int id_persona);

}
