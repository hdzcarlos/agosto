package interfaces;

public class ClienteDAO {
	
	public String listar(){
		//1º Conectar a la base de datos
		OracleDAO oracleDAO = new OracleDAO();
		String pasos = "";
		pasos+=oracleDAO.conectar();
		System.out.println("Estamos conectados....");
		pasos+=oracleDAO.ejecutarSQL("SELECT * FROM CLIENTES");
		pasos+=oracleDAO.desconectar();
		
		return pasos;
	}

}
