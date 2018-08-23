package ejercicioEscuela;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Escuela {
	private String nombre;
	private List<Persona> personas = new ArrayList<Persona>();
	
	
	public Escuela() {
	}

	public Escuela(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
	public void insertarAlumno(Persona persona) {
		
		this.personas.add(persona);
		
	}
	//PREGUNTAR ----- SI YO TENGO OTRA ESCUELA SERÍA NECESRIO SOBREESCRIBIR DE NUEVO EL METODO  COMPARE
	public void listar(){
		Collections.sort(personas, new Comparator<Persona>() {
			@Override
			public int compare(Persona o1, Persona o2) {
				return (o1.getNombre()).compareTo(o2.getNombre());
				//return new Integer(o1.getEdad()).compareTo(new Integer(o2.getEdad()));
			}
		});
		for (Persona persona : personas) {
			System.out.println(persona);
		}	
	
}
	@Override
	public String toString() {
		return "Escuela "
				+ nombre;
	}
	
	
	
	
	

}
