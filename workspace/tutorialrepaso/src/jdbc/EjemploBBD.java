package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class EjemploBBD {
	public static void main(String[] args) throws SQLException  {
		Connection con = null;
		
		System.out.println("1.- CArgamos el DRIVER JDBC y DEFINIMOS LAS VARIABLES DE ACCESO");
		String jdbcURL = "jdbc:mysql://localhost:3306/tienda-generica";
		String jdbcUSER="root";
		String jdbcPASS="4P4CH3";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(jdbcURL, jdbcUSER, jdbcPASS);
			String sql="SELECT * FROM articulos ;";
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
			System.out.println(resultSet.getString("nombre"));
			System.out.println(resultSet.getString("descripcion"));
			System.out.println(resultSet.getFloat("Pvp"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

}
