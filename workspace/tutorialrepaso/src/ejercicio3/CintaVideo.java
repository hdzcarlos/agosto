package ejercicio3;

public class CintaVideo extends Soporte{
	
	protected String duracion;

	public CintaVideo(String titulo, String duracion, double precio, String numero) {
		super(titulo, numero, precio);
		this.duracion = duracion;
	}

	
	public String imprimeCaracteristicas() {
		return "Cinta de Video del " +super.imprimeCaracteristicas() + "\n"+
				" - duracion: " + duracion;
	}

	
	
	
	
	
	
	


	
}