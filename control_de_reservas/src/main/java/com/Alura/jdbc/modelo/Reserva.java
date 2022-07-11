package com.Alura.jdbc.modelo;

import java.sql.Date;

public class Reserva {
	private Integer idReserva;
	private Date fechaE;
	private Date fechaS;
	private String valor;
	private String formaPago;
	//private String IdHuesped;
	
	
	public Reserva(Date fechaE, Date fechaS, String valor, String formaPago) {
		super();
		this.fechaE = fechaE;
		this.fechaS = fechaS;
		this.valor = valor;
		this.formaPago = formaPago;
		//this.IdHuesped = IdHuesped;
	}

	public Integer getId() {
		return idReserva;
	}

	public void setId(Integer idReserva) {
		this.idReserva = idReserva;
	}

	public Date getFechaE() {
		return fechaE;
	}

	public Date getFechaS() {
		return fechaS;
	}

	public String getValor() {
		return valor;
	}

	public String getFormaPago() {
		return formaPago;
	}

//	public String getIdHuesped() {
//		return IdHuesped;
//	}
	
	
}

