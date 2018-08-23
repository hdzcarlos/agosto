package ejercicio3;

public class Dvd extends Soporte{
	
	protected String idiomasDisponibles;
	protected String formatoPantalla;
	
	public Dvd(String titulo, String numero, double precio,
			String idiomasDisponibles, String formatoPantalla) {
		super(titulo, numero, precio);
		this.idiomasDisponibles = idiomasDisponibles;
		this.formatoPantalla = formatoPantalla;
	}

	
	public String imprimeCaracteristicas() {
		return "Dvd del " +super.imprimeCaracteristicas()+"\n"+
				" - idiomas Disponibles: " + idiomasDisponibles+"\n"+
				" - formato de Pantalla: " + formatoPantalla;
	}
	
	
	

}
