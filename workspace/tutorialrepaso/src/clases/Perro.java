package clases;

public class Perro {
	
	private String nombre;
	private String raza;
	private short peso;
	private Persona persona;
	

	public Perro(String nombre, String raza, short peso) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
	}
	
	

	public Persona getPersona() {
		return persona;
	}



	public void setPersona(Persona persona) {
		this.persona = persona;
	}



	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public short getPeso() {
		return peso;
	}


	public void setPeso(short peso) {
		this.peso = peso;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso
				+ "]";
	}
	
	
	
	

}
