package ejercicioEscuela;

public class Gato {
	
	private String nombre;
	
	
	
	public Gato(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String tirarCola() {
		
		return "Te reviento";
	}
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + "]";
	}

	
	

}
