package com.Alura.jdbc.modelo;

import java.sql.Date;

import com.Alura.jdbc.modelo.Huesped;

public class Huesped {
	private Integer idHuespedes; 
	private String nombre;
	private String apellido;
	private Date fechaNac;
	private String nacionalidad;
	private String telf;
	private String idReserva;
	//private List<Huesped> Huespedes = new ArrayList<>();
	
	public Huesped(String nombre, String apellido, Date fechaNac, String nacionalidad, String telf) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.telf = telf;
	}


	public Huesped(String nombre, String apellido, Date fechaNac, String nacionalidad, String telf, String idReserva) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.telf = telf;
		this.idReserva = idReserva;
	}


	public Integer getId() {
		return idHuespedes;
	}

	public void setId(Integer idHuespedes) {
		this.idHuespedes = idHuespedes;
	}

	public String toString() {
		return this.nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public String getTelf() {
		return telf;
	}
	
	
//	public List<Huesped> getHuespedes() {
//        return this.Huespedes;
//    }

	
//	public Huesped2 (String nombre,String apellido,Date fechaNac,String nacionalidad, String telf) {
//	super();
//	this.nombre = nombre;
//	this.apellido = apellido;
//	this.fechaNac = fechaNac;
//	this.nacionalidad = nacionalidad;
//	this.telf = telf;
//	this.idReserva = idReserva;
//}


//public Huesped(Integer idHuespedes, String nombre, String apellido, String fechaNac, String nacionalidad, String telf, int idReserva) {
//	this.idHuespedes = idHuespedes;
	//this.nombre = nombre;
	//this.apellido = apellido;
	//this.fechaNac = fechaNac;
	//this.nacionalidad = nacionalidad;
	//this.telf = telf;
//	this.idReserva = idReserva;
//}

	
	
}
