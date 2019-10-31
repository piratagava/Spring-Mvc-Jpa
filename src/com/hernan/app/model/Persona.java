package com.hernan.app.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_persona;
	
	@Column
	private String nombre;
	@Column
	private String apellidoPaterno;
	@Column
	private String apellidoMaterno;
	
	public Persona() {
		
	}
	
	public Persona(int id_persona, String nombre, String apellidoPaterno, String apellidoMaterno) {
		super();
		this.id_persona = id_persona;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}

	
	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	
	//El método toString nos permite mostrar la información completa de un objeto, es decir, el valor de sus atributos.
	@Override
	public String toString() {
		return "persona [id_persona=" + id_persona + ", nombre=" + nombre + ", apellidoP=" + apellidoPaterno + ", apellidoM="
				+ apellidoMaterno + "]";
	}
	//Override : Es la capacidad que tiene para sobreescribir un metodo de una clase al hacer herencia
}
