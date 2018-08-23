package ejercicioEscuela;

public class Escuela {
	
	private String nombre;

	public Escuela(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Escuela() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Escuela [nombre=" + nombre + "]";
	}
	
	

}
