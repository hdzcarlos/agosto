package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbConexion {
	public static Connection jdbcConnection = null;
	public final static String URL = "jdbc:mysql://localhost:3306/tienda-generica";
	public final static String USER = "root";
	public final static String PASS = "4P4CH3";
	
	
	public static  void conectar() throws SQLException {
		
		if(jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			/**
			 * Inicializamos jdbcConnection y recuperamos la URL Username y Password.
			 */
			jdbcConnection = DriverManager.getConnection(
					URL, USER, PASS);
		}
		
	}
	
	public static void desconexion () throws SQLException {
		if(jdbcConnection !=null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
		
	}
	
	public  static ResultSet ejecutarConsultaSeleccion(String sql) throws SQLException {
		
		Statement statement = jdbcConnection.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		
		return rs;
	}
	
	public static int ejecutarConsultaCUD(String sql) throws SQLException {
		Statement statement = null;
		int resultado = 0;
		
		statement = jdbcConnection.createStatement();
		resultado = statement.executeUpdate(sql);
		return resultado;
	}
	public Connection getJdbcConnection() {
		return jdbcConnection;
	}
	

}
