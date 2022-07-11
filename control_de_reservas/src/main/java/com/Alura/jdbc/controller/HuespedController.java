package com.Alura.jdbc.controller;

import java.sql.Connection;
import com.Alura.jdbc.dao.HuespedDAO;
import com.Alura.jdbc.factory.ConnectionFactory;
import com.Alura.jdbc.modelo.Huesped;


public class HuespedController {
	
	private HuespedDAO huespedDAO;
	

	public HuespedController() {
	Connection connection = new ConnectionFactory().RecuperarConexion();
	this.huespedDAO = new HuespedDAO(connection);
	}	
	
	

	//guarda solo el huesped
	public void guardar(Huesped huesped) {
		this.huespedDAO.guardar(huesped);
	}
	
	

	public void cerrarConexion() {
		this.huespedDAO.cerrarConexion();
		
	}
	
}
