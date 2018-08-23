package basico;

public class Cadenas {
	public static void main(String[] args) {
		String cadena="El perro se llama Toby";
		String cadena2="El perro se llama toby";
			
		System.out.println(cadena.length());
		System.out.println(cadena.substring(2,11));
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.charAt(5));
		System.out.println(cadena.indexOf("perro"));
		cadena.toCharArray();
		System.out.println(cadena.equals(cadena2));
		
	}
	
}
