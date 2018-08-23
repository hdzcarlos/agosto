package colecciones;

import java.util.HashSet;
import java.util.Set;

public class ColeccionSet {
	public static void main(String[] args) {
		
		Set<Alumno> alumnos = new HashSet<>();
		alumnos.add(new Alumno("Juan"));
		alumnos.add(new Alumno("ambrosio"));
		alumnos.add(new Alumno("pepe"));
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
			
		}
		
		Set<Alumno> alumnos1 = new HashSet<>();
		alumnos.add(new Alumno("Juan"));
		alumnos.add(new Alumno("ambrosio"));
		alumnos.add(new Alumno("pepe"));
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.hashCode()+ " " +alumno.getNombre());
			
		}
	}

}
