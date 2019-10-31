package com.hernan.app.dao.impl;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hernan.app.dao.PersonaDao;
import com.hernan.app.model.Persona;

//Esta anotacion sirve para decir spring que se van a implemetar metodos que permitiran guardar datos
//o algun otro repositorio
@Repository
public class PersonaDaoImp implements PersonaDao {

	//sirve para indicar spring que debe realizar una inyeccion 
	@Autowired
	private SessionFactory sessionFactory;
	//SessionFactory lo que hace es encargarse de decir donde se encuentran todos los ficheros de mapeo Hibernate.
	
	public void crearPersona(Persona persona) {
		sessionFactory.getCurrentSession().persist(persona);
	}

	@Override
	public void eliminarPersona(Integer id_persona) {
		Persona personaa = (Persona) sessionFactory.getCurrentSession().load(Persona.class, id_persona);
		if (null != personaa) {
			this.sessionFactory.getCurrentSession().delete(personaa);
		}

	}

	//se utliza para suprimir las advertencias del compilador para el elemento anotado
	//tiene como finalidad decir al compilador lo que se implementa en el metodo es correcto
	@SuppressWarnings("unchecked")
	public List<Persona> getAllPersonas() {
		return sessionFactory.getCurrentSession().createQuery("from Persona").list();
	}

	@Override
	public void actualizarPersona(Persona persona) {
		sessionFactory.getCurrentSession().update(persona);
		//sessionFactory.getCurrentSession().merge(persona);
	}

	public Persona getPersona(int id_persona) {
		return (Persona) sessionFactory.getCurrentSession().get(Persona.class, id_persona);
	}

}
