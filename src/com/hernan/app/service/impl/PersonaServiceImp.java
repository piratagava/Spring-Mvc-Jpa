package com.hernan.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hernan.app.dao.PersonaDao;
import com.hernan.app.model.Persona;
import com.hernan.app.service.PersonaService;

//Esta anotación sirve como una especialización @Component, indica que es un servicio 
//lo que permite que las clases de implementación se detecten automáticamente a través del escaneo de classpath.
@Service
//La anotación @transaccional es un metadato que especifica que una interfaz,  
//clase o método debe tener semántica transaccional.
@Transactional
public class PersonaServiceImp implements PersonaService {

	//inyectamos con spring a la interface PersonaDao para hacer uso de los metodos y recursos 
	@Autowired
	private PersonaDao dao;

	@Override
	@Transactional
	public void crearPersona(Persona persona) {
		dao.crearPersona(persona);
	}

	@Override
	@Transactional
	public void eliminarPersona(Integer id_persona) {
		dao.eliminarPersona(id_persona);

	}

	@Override
	@Transactional
	public List<Persona> getAllPersonas() {
		return dao.getAllPersonas();
	}

	
	public void actualizarPersona(Persona persona) {
		dao.actualizarPersona(persona);
	}

	public Persona getPersona(int id_persona) {
		return dao.getPersona(id_persona);
	}

}
