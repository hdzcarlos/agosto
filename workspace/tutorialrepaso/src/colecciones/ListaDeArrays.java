package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaDeArrays {
	
	public static void main(String[] args) {
		/*
		 * No esta definido el tipo dentro del diamante <>
		 * 	List lista = new ArrayList();
		
		
		lista.add("pepe");
		lista.add(115);
		lista.add(125.9F);
		lista.add(new Alumno("Jose"));
		
		
		float tres = (float)lista.get(3);
		Alumno a = (Alumno)lista.get(4);
		 */
		
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Ketama");
		nombres.add("Pepe");
		nombres.add("Jose");
		nombres.add("Mery");
		System.out.println("Longitud "+nombres.size());
		System.out.println(nombres.indexOf("Jose"));
		System.out.println(nombres.toArray());
		System.out.println(nombres.get(2));
		nombres.add(2,"Uha");
		System.out.println(nombres.toString());
		System.out.println("Longitud "+nombres.size());
		//Collections.sort(nombres);
		
		// RECORREMOS CON UN FOR
		for (int i = 0; i<=0; i++ ) {
			System.out.println(nombres);
		}
		//Recorremos con FOREACH 
		for (String string : nombres) {
			System.out.println(string);
		}
		// Recorremos con un ITERATOR.
		Iterator it = nombres.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		List<Alumno> alumnos = new ArrayList<>();
		alumnos.add(new Alumno("Pedro"));
		alumnos.add(new Alumno("Jose"));
		alumnos.add(new Alumno("Mary"));
		alumnos.add(new Alumno("Antonio"));
		
		for (Alumno alumno : alumnos) {
			
			System.out.println("___________HAS CODE__________");
			System.out.println(alumno.getNombre().hashCode());

		}
		Iterator< Alumno> ita = alumnos.iterator();
		while(ita.hasNext()){
			Alumno a = ita.next();
			System.out.println(a.hashCode()+"  "+ a.getNombre());
		}
		
		ArrayList<ArrayList<String>> prueba = new ArrayList<>();
		
		ArrayList<String> a2 = new ArrayList<String>();
		ArrayList<String > a1 = new ArrayList<String>();
		a1.add("Verano Azul");
		a1.add("Black Mirrow");
		a1.add("Game of Trones");
		
		a2.add("Los bingueros");
		a2.add("Traca");
		a2.add("Temario");
		
		prueba.add(a1);
		prueba.add(a2);
		
		System.out.println(prueba.get(1).get(2));
		
		
		
		
		
	
		
		
		
		
		
	}

}
