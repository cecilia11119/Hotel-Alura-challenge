package com.Alura.jdbc.controller;

import java.sql.Connection;
import com.Alura.jdbc.dao.ReservaDAO;
import com.Alura.jdbc.factory.ConnectionFactory;
import com.Alura.jdbc.modelo.Reserva;

public class ReservasController {
	
	private ReservaDAO reservaDAO;
	//private ReservaDAO huespedDAO;
	
	public ReservasController() {
	Connection connection = new ConnectionFactory().RecuperarConexion();
	this.reservaDAO = new ReservaDAO(connection);
	}	
	
	
	//guarda solo la reserva
	public void guardar(Reserva reserva) {
		this.reservaDAO.guardar(reserva);
		
	}
	
	
	public void cerrarConexion() {
		this.reservaDAO.cerrarConexion();
		
	}

	
	//guarda solo la huesped
	//public void guardar(Huesped huesped) {
	//	this.huespedDAO.guardar(huesped);
		
	//}
	
	//se guarda la reserva y el id del huesped no me sale
	//	public void guardar(Reserva reserva, Integer idHuesped) {
	//		reserva.setIdHuesped(idHuesped);
	//		reservaDAO.guardar(reserva);
	//	}
	
	
	
	
	//public List<Reserva> listar(Huesped huesped) {
    //    return reservaDAO.listar(huesped);
   // }
	
	//public List<Reserva> listar() {
   //     return reservaDAO.listar();
   // }
	

}
