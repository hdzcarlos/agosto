package lanzaderas;

import basico.Caja;

public class UsarCaja {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Siempre que este en otro paquete es necesario importar la clase.
		// PAra usar las variables SHORT es necesario hacer un casting
		Caja caja = new Caja(1,1,1,"roja");
		System.out.println(caja.toString());
	}
}