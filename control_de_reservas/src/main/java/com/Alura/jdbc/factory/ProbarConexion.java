package com.Alura.jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;

public class ProbarConexion {
	public static void main(String[] args) throws SQLException{
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.RecuperarConexion();
		System.out.println("cerrando conexion!!");
		connection.close();
	}
}


