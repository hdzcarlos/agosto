package basico;

public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// TIPOS PRIMITIVOS
		//bool ean true o false ( 1 o 0)
		//char = 1 solo caracter
		//byte
		
		// TIPOS DE DATOS PRIMITIVOS	
		
		int mivar = 5; //Variable de tipo entero
		double mivar2;
		System.out.println(mivar);
		 //CASTEO DE UNA VARIABLE
		mivar2= (float)mivar*0.6;
		System.out.println("Mi var 2 : "+mivar2);
		float f=123445566.23f;
		
		double d=8872392724.2823d;
		
		System.out.println("El contenido de mivar es :" + mivar);
		boolean millonario = false;
		System.out.println("El contenido de la variable millonario es: " + millonario);
		
		//DATOS NO PRIMITIVOS
		String cadena = "El perro se llama toby";
		
		// Conversion de cadena a entero y viceversa
		
		String cad ="1234";
		int numero = Integer.parseInt(cad);
		
		int numero2 =5555;
		
		String cadenaNumero = String.valueOf(numero2);
		String cadenaNumero2 = Integer.toString(numero2);
		String CadenaNumero3 = numero2+"";
		
		
		
		
	}
	

}
