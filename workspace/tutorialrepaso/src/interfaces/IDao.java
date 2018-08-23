package interfaces;

import java.sql.ResultSet;

public interface IDao {
	
	String conectar();
	String desconectar();
	String ejecutarSQL(String consulta);
	int contarFilas(ResultSet resultSet);

}
