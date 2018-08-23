package basico;

public class Caja {

	
	private int ancho;
	private int largo;
	private int alto;
	private String color;
	
	private String contenido;

	
	public Caja() {
	}

	public Caja(int ancho, int largo, int alto, String color) {
		super();// Si viene heredada de otra sería necesaria.
		
		this.ancho = ancho;
		this.largo = largo;
		this.alto = alto;
		this.color = color;
	}
	/*
	 * Este metodo no devuelve nada y viene por parametros con una variable String.
	 */
	public void introducir(String algo){
		System.out.println("Estoy introduciendo bolis");
		// Esta variable nace , vive y muere dentro del metodo.
		int contador = 1 ;
		// Esto indica que estamos guardando la variable que nos viene por parametros en una 
		// variable de la clase.
		this.contenido = algo;
	}
	public String extraer(){
		return this.contenido;
	}
	
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Caja [ancho=" + ancho + ", largo=" + largo + ", alto=" + alto
				+ ", color=" + color + ", contenido=" + contenido
				+ ", getContenido()=" + getContenido() + "]";
	}


	
	
	
	




}
