package clases;

public class Persona {
	
	private String nombre;
	private Perro perro; // Pasa a ser propiedad de la clase persona , una vez creado la persona se se liga la clase perro
	
	
	

	public Persona() {
		super();
	}


	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}
	


	public Perro getPerro() {
		return perro;
	}


	public void setPerro(Perro perro) {
		this.perro = perro;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String quieroUnPerro(){
		Perro unPerro = new Perro("Toby", "Pointer", (short) 25);
		return "Toma Perro: "+ unPerro;
	}
	
//eL PERRO  se solicita ocasionalmente no esta ligado a la persona
	public String quieroUnPerro(Perro perro){
		
		
		return "Toma Perro" +perro;
	}

}
