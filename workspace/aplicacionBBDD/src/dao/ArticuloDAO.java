package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import pojos.Articulo;

public class ArticuloDAO {
	
	private Connection con;
	private DbConexion conexion;
	
	
	public Articulo getByID(int id) throws SQLException {
		Articulo articulo = new Articulo();
		DbConexion.conectar();
		String sql = "SELECT * FROM articulos WHERE id_articulo ="+id+";";
		ResultSet resultSet = DbConexion.ejecutarConsultaSeleccion(sql);
		resultSet.next();
		articulo.setId(id);
		articulo.setNombre(resultSet.getString("nombre"));
		articulo.setPrecio(resultSet.getDouble("Pvp"));
		DbConexion.desconexion();
		return articulo;
	}
	
	public List<Articulo> getAll() throws SQLException{
		Articulo articulo;
		String sql = "SELECT * FROM articulos;";
		DbConexion.conectar();
		List<Articulo> articulos = new ArrayList<>();
		ResultSet resultSet = DbConexion.ejecutarConsultaSeleccion(sql);
		while(resultSet.next()) {
			articulo  = new Articulo();
			articulo.setId(resultSet.getInt("id_articulo"));
			articulo.setNombre(resultSet.getString("nombre"));
			articulo.setPrecio(resultSet.getDouble("Pvp"));
			articulos.add(articulo);
		}
		DbConexion.desconexion();
		return articulos;
	}
	
	public int insertar(Articulo articulo) throws SQLException {
		DbConexion.conectar();
		String sql="INSERT INTO articulos(id_articulo,nombre,descripcion,Pvp,Stock,foto,id_categoria,id_proveedor)"
				+ "VALUES("+articulo.getIdArticulo()+","
						  + articulo.getNombre()+','
						  + articulo.getDescripcion()+','
						  + articulo.getPrecio()+","
						  + articulo.getStock()+","
						  + articulo.getFoto()+','
						  + articulo.getCategoria()+','
						  + articulo.getIdProvedor()+","
						  +");";
		int filas = DbConexion.ejecutarConsultaCUD(sql);
		return filas;
		
		// VERSION CON SENTENCIAS PREPARADAS
	//	String sql2 ="INSERT INTO articulos(id_articulo,nombre,descripcion,Pvp,Stock,foto,id_categoria,id_proveedor)"
		//		+ "VALUES (?,?,?,?,?,?,?,?);"
			//	PreparedStatement preparedStatement = 
	}
	
	public int updateArticulo() throws SQLException {
		DbConexion.conectar();
		String sql = "UPDATE articulos  SET Pvp=Pvp*1.05;";
		int filas = DbConexion.ejecutarConsultaCUD(sql);
		DbConexion.desconexion();
		return filas;
		
	}
	
	

}
