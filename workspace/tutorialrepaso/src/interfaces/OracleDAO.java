package interfaces;

import java.sql.ResultSet;

public class OracleDAO implements IDao {

	@Override
	public String conectar() {
		// TODO Auto-generated method stub
		return "Me he conectado" ;
	}

	@Override
	public String desconectar() {
		// TODO Auto-generated method stub
		return "Me desconecto de oracle";
	}

	

	@Override
	public int contarFilas(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public String ejecutarSQL(String consulta) {
		// TODO Auto-generated method stub
		return "Cliente 1: Pepito" +
				"cliente2 Fulanito";
	}
	

}
