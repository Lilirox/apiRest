package com.curso.apiRest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "email")
	private String email;

	@Column(name = "celular")
	private String celular;

	public Cliente() {
	}
	
	

	public Cliente(int id, String nombre, String email, String celular) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.celular = celular;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", email=" + email + ", celular=" + celular + "]";
	}

}
