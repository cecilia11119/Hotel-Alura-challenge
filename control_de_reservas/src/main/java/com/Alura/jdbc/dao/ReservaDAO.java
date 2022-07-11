package com.Alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.Alura.jdbc.modelo.Reserva;

public class ReservaDAO {
	private Connection connection;
	
	//constructor
	public ReservaDAO(Connection connection) {
		this.connection = connection;
	}
	
	
	//metodo
	public void guardar(Reserva reserva) {
		try {
			String sql = "INSERT INTO reservas (fechaEntrada,fechaSalida,valor,formaDePago)VALUES(?,?,?,?)"; 
			try  (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
				statement.setDate(1,reserva.getFechaE());
				statement.setDate(2,reserva.getFechaS());
				statement.setString(3,reserva.getValor());
				statement.setString(4, reserva.getFormaPago());
						//pstm.setString(5, reserva.getIdHuesped());
						
				statement.executeUpdate();
				
				try (ResultSet rst = statement.getGeneratedKeys()){
					while (rst.next()) {
						reserva.setId(rst.getInt(1));
					}
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
	public void cerrarConexion() {

		try {
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				throw new RuntimeException(e);
			}
			throw new RuntimeException(e);

		}

	}
	
	
	
	
	 /* 	
	  public List<Reserva> listar() {
	        List<Reserva> resultado = new ArrayList<>();

	        try {
	            final PreparedStatement statement = connection
	                    .prepareStatement("SELECT idReserva, fechaEntrada, fechaSalida, valor, formaDePago FROM reservas");
	    
	            try (statement) {
	                statement.execute();
	    
	                final ResultSet resultSet = statement.getResultSet();
	    
	                try (resultSet) {
	                    while (resultSet.next()) {
	                        resultado.add(new Reserva(
	                                resultSet.getInt("idReserva"),
	                                resultSet.getString("fechaEntrada"),
	                                resultSet.getString("fechaSalida"),
	                                resultSet.getInt("valor"))),
	                        		resultSet.getString("formaDePago");
	                    }
	                }
	            }
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	        return resultado;
	    }

*/	
	
	
}
