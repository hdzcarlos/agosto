package ejercicio3;

public class Juego extends Soporte{
	
	protected String consola;
	protected int numeroMinimoJugadores;
	protected int numeroMaximoJugadores;
	
	public Juego(String titulo, String numero, double precio, String consola,
			int numeroMinimoJugadores, int numeroMaximoJugadores) {
		super(titulo, numero, precio);
		this.consola = consola;
		this.numeroMinimoJugadores = numeroMinimoJugadores;
		this.numeroMaximoJugadores = numeroMaximoJugadores;
	}

	
	public String imprimeCaracteristicas() {
		return "Juego del " +super.imprimeCaracteristicas()+"\n"+
				" - consola: " + consola +"\n"+
				" - numero Minimo de Jugadores: " + numeroMinimoJugadores +"\n"+
				" - numero Maximo de Jugadores:" + numeroMaximoJugadores;
	}
	public void imprimeJugadoresPosibles(){
		
	}
	
	
	
	
	
	

}
