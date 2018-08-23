package ejercicioEscuela;

public class Perro {
	private String nombre;
	private String color;
	private String estomago;
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
	public String comerComida(String comida) {
		moverCola();
		return "Estoy comiendo la comida que mi dueño amablemente me ha ofrecido";
		
	}
	public String tocan (String lugar) {
		
		return lugar;
	}
	private String moverCola() {
		return "Estoy contento y muevo la cola \n";
	}
	private String hacerDigestion() {
		return "Despues de comer siempre se hace la digestion \n";
	}
	private String hacerNecesidades() {
		return "Despues de la digestion mi dueño me saca a pasear al parque y recoge muy educadamente mis necesidades \n";
	}
	@Override
	public String toString() {
		return " · Nombre  ==> "+ nombre +"\n"+
			   " · Color del perro : " + color ;
	}
	
	
	

}
