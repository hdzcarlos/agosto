package ejercicioEscuela;

public class Persona {
	
	private Integer edad;
	private String nombre;
	private Persona hermano;
	private Perro perro;
	private Gato gato;
	// CONSTRUCTORES 
	public Persona() {
		super();
	}
	
	public Persona( String nombre,Integer edad) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	// GETERS AND SETTERS
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Persona getHermano() {
		return hermano;
	}

	public void setHermano(Persona hermano) {
		this.hermano = hermano;
	}

	public Perro getPerro() {
		return perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}

	public Gato getGato() {
		return gato;
	}

	public void setGato(Gato gato) {
		this.gato = gato;
	}
	
	// LOGICA

	public String tocar (Object object, String lugar) {
	
		return "";
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", hermano=" + hermano + ", perro=" + perro + ", gato="
				+ gato + "]";
	}
	
	
	

}
