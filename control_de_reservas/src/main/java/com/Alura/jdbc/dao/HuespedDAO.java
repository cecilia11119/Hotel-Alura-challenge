package com.Alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.Alura.jdbc.modelo.Huesped;

public class HuespedDAO {
	//private Connection connection;
	private Connection connection;
	
	public HuespedDAO(Connection connection) {
		this.connection = connection;
	}

	//metodo
			public void guardar(Huesped huesped) {
				try {
					
					String sql = "INSERT INTO huespedes (nombre,apellido,fechaNac,nacionalidad,telf)VALUES(?,?,?,?,?)"; 
							try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
								statement.setString(1,huesped.getNombre());
								statement.setString(2,huesped.getApellido());
								statement.setDate(3,huesped.getFechaNac());
								statement.setString(4, huesped.getNacionalidad());
								statement.setString(5, huesped.getTelf());
								//pstm.setString(5, reserva.getIdHuesped());
								
								statement.executeUpdate();
								
								try (ResultSet rst = statement.getGeneratedKeys()){
									while (rst.next()) {
										huesped.setId(rst.getInt(1));
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
	 public List<Huesped> listar() {
	        List<Huesped> resultado = new ArrayList<>();

	        try {
	            String sql = "SELECT idHuespedes, nombre FROM huespedes";
	            
	            System.out.println(sql);
	            
	            final PreparedStatement statement = connection
	                    .prepareStatement(sql);

	            try (statement) {
	                final ResultSet resultSet = statement.executeQuery();

	                try (resultSet) {
	                    while (resultSet.next()) {
	                        resultado.add(new Huesped(
	                                resultSet.getInt("idHuespedes"),
	                                resultSet.getString("nombre")));
	                    }
	                }
	            }
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	        return resultado;
	    }
	 */
	 
			
			/* 
	    public List<Huesped> listarConReservas() {
	        List<Huesped> resultado = new ArrayList<>();

	        try {
	            String sql = "SELECT H.idHuespedes, H.nombre, R.idReserva, R.fechaEntrada, R.fechaSalida "
	                    + " FROM Huespedes H INNER JOIN reservas R "
	                    + " ON H.idHuespedes = R.idHuesped";
	            
	            System.out.println(sql);
	            
	            final PreparedStatement statement = connection
	                    .prepareStatement(sql);

	            try (statement) {
	                final ResultSet resultSet = statement.executeQuery();

	                try (resultSet) {
	                    while (resultSet.next()) {
	                        int idHuesped = resultSet.getInt("H.idHuespedes");
	                        String categoriaNombre = resultSet.getString("H.nombre");
	                        
	                        Huesped huesped = resultado
	                            .stream()
	                            .filter(res -> res.getId().equals(idHuespedes))
	                            .findAny().orElseGet(() -> {
	                            	Huesped res = new Huesped(
	                            			idHuespedes, nombre);
	                                resultado.add(res);
	                                
	                                return res;
	                            });
	                        
	                        Reserva reserva = new Reserva(
	                                resultSet.getInt("R.idReserva"),
	                                resultSet.getString("R.fechaEntrada"),
	                                resultSet.getString("R.fechaSalida"));
	                        
	                        huesped.agregar(reserva);
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
