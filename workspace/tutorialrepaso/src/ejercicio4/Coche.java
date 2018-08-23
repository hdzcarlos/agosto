package ejercicio4;

public class Coche extends Vehiculo {
	
	
	public final double  coeficienciaDeTransmision = 2.2d;
	
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coche(int potencia, int peso) {
		super(potencia, peso);
		// TODO Auto-generated constructor stub
	}






	@Override
	Double aceleracionAproximada() {
		double aceleracion = (peso*771.3/(2*potencia*735))*coeficienciaDeTransmision;
		return aceleracion;
	}

}
