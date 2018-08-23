package interfaces;

public class ListarClientes {
	
	public static void main(String[] args) {
		System.out.println("-----------Listado de clientes----------");
		ClienteDAO clienteDAO = new ClienteDAO();
		System.out.println(clienteDAO.listar());
		System.out.println("-----------FIN DE APP------------");
		
		
	}

}
