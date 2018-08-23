package ejercicio6;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class Diccionario {

	public static void main(String[] args) {
		Map<String, String> diccionario = new Hashtable<>();
		Scanner sc = new Scanner(System.in);	
		diccionario.put("ordenador", "computer");
		diccionario.put("gato", "cat");      
		diccionario.put("rojo", "red");
		diccionario.put ("árbol", "tree");
		diccionario.put("pingüino", "penguin");
		diccionario.put("sol", "sun");
		diccionario.put("agua", "water");
		diccionario.put("viento", "wind");
		diccionario.put("siesta", "siesta");
		diccionario.put("arriba", "up");
		diccionario.put("ratón", "mouse");
		diccionario.put("estadio", "arena");
		diccionario.put("calumnia", "aspersion");
		diccionario.put("aguacate", "avocado");
		diccionario.put("cuerpo", "body");
		diccionario.put("concurso", "contest");
		diccionario.put("cena", "dinner");
		diccionario.put("salida", "exit");
		diccionario.put("lenteja", "lentil");
		diccionario.put ("cacerola", "pan");
		diccionario.put("pastel", "pie");
		diccionario.put("membrillo", "quince");
		
		System.out.println("Introduzca una palabra");
		String respuesta = sc.nextLine();
		if(diccionario.containsKey(respuesta)) {
			System.out.println(diccionario.get(respuesta));
			}else {
				System.out.println("Eso no existe.");
		}
		
		for(Map.Entry elemento:diccionario.entrySet()) {
			System.out.println(elemento.getKey()+ "----> Significa ====>: "+elemento.getValue());
		}


	}

}
