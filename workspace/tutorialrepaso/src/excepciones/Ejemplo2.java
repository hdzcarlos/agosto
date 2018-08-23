package excepciones;

public class Ejemplo2 {

	public static void main(String[] args) {

		int edad= 15;
		if(edad <18) {
			throw new MenorEdadExcption();
		}

	}

}
