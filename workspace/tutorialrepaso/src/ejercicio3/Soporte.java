package ejercicio3;

public class Soporte {
	// Variables de clase
	public String titulo;
	protected String numero;
	private double precio;
	public static final double IVA = 0.25;
	
	//Constructor con parametros
	public Soporte(String titulo, String numero, double precio) {
		super();
		this.titulo = titulo;
		this.numero = numero;
		this.precio = precio;
	}
	// Metodo que devuelve el precio sin el iba
	public double damePrecioSinIva(){
		
		return precio;
	}
	//Precio que devuelve el precio con el iva
	public double damePrecioConIva(){
		precio*=IVA;
		return precio ;
	}
	//precio que devuelve el numero de identificacion
	public String dameNumeroIdentificacion(){
		
		return numero;
	}

	// Metodo que imprime todas las caracteristicas
	public String imprimeCaracteristicas() {
		return "Video CLub Netflix:"+ "\n"+
							" - Titulo: " +titulo + "\n"+
							" - numero: " + numero + "\n"+
							" - precio: " + precio;
	}
	
	
	
	
	
	

}
