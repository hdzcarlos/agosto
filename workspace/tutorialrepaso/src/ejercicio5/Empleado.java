package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empleado implements Comparable<Empleado>{
	
	private String nombre;
	private double salario;
	private String categoria;
	private int dni;
	private int edad;
	private List<Empleado> empleados;
	
	public Empleado() {
		super();
	}

	public Empleado(String nombre, double salario, String categoria, int dni, int edad) {
		super();
		this.edad = edad;
		this.dni = dni;
		this.nombre = nombre;
		this.salario = salario;
		this.categoria = categoria;
	}

	// GETERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario
				+ ", categoria=" + categoria + ", dni=" + dni + ", edad="
				+ edad + ", empleados=" + empleados + "]";
	}



	// LOGICA DE NEGOCIO
	public ArrayList<Empleado> verDatos(){
		
		return null;
	}

	@Override
	public int compareTo(Empleado o) {
		if(this.edad>o.getEdad()){
			return 1;
			
		}else if(this.dni<o.getEdad()){
			return -1;
		}else{
			return 0;
		}
		 
	}


	


	
}
