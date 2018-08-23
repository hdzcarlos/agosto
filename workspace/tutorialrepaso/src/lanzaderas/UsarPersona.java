package lanzaderas;

import clases.Persona;
import clases.Perro;

public class UsarPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona p = new Persona("Antonio");
		Perro per = new Perro("perro", "Chguagua", (short)7.0);
		System.out.println(p.quieroUnPerro());
		System.out.println(p.quieroUnPerro(per));
		p.setPerro(per);
		per.setPersona(p);
	
		System.out.println(p.getPerro().getRaza());
		System.out.println(per.getPersona().getNombre());
	}

}
