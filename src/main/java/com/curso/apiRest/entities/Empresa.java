package com.curso.apiRest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "rfc")
	private String rfc;

	@Column(name = "direccion")
	private String direccion;

	public Empresa() {

	}

	public Empresa(int id, String nombre, String rfc, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rfc = rfc;
		this.direccion = direccion;
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

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", rfc=" + rfc + ", direccion=" + direccion + "]";
	}

}
