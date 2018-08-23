package condicionales;

public class OperadorTernario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Operador ternario
		 * 1º Valora la condicion
		 * (condicion) ? bloqueif:bloqueelse;
		 */
		boolean millonario = false;
		int edad = 20;
		if(millonario){
			System.out.println("Entras a la disco");
			
		}else{
			System.out.println("No entras a la disco");
		}
		String cadena =(millonario && edad>=18) ? "Entras":"No Entras";
		System.out.println(cadena);

	}

}
