package ejercicio4;

abstract public class Vehiculo {
	int potencia;
	int peso;

	
	public Vehiculo() {
		
	}


	public Vehiculo(int potencia, int peso) {
		super();
		this.potencia = potencia;
		this.peso = peso;
	}
	public double relacionPesoPotencia(){
		double pesoPotencia = 0;
		
		return pesoPotencia;
	}
	abstract Double aceleracionAproximada();
		
}

