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
		return "MIaaaaaaaaaaauuuuuuuuuuuuuuuuuuu Zarpazo Zarpazo Zarpazo";
	}

	@Override
	public String toString() {
		return "Gato "
				+ "� nombre: " + nombre;
	}
	
	
	

}
