package ejercicioEscuela;

public class Perro {
	
	private String nombre;
	private String color;
	private String estomago;
	
	public Perro() {
		super();
	}
	public Perro(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEstomago() {
		return estomago;
	}
	public void setEstomago(String estomago) {
		this.estomago = estomago;
	}
	
	private String hacerDigestion() {
		
		return "";
	}
	public String comerComida(String comida) {
		
		return "";
	}
	public String tocar(String lugar) {
		
		return "";
	}
	private String moverCola() {
		
		return "";
	}
	private String hacerNecesidades() {
		
		return "";
	}
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", color=" + color + ", estomago=" + estomago + "]";
	}
	
	
	
}
