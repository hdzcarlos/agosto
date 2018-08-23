package clases;

public class UsarCliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cliente c = new Cliente(1, "Antonio");
		System.out.println(c.saludar());
		System.out.println(c.saludar("jose"));
		System.out.println(c.saludar(12, "Pedro"));
		System.out.println(c.saludar("Pepe", 30));
		System.out.println(c.saludar("Perico", (short)2));
	}

}
