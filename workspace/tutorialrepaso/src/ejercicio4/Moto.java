package ejercicio4;

public class Moto extends Vehiculo {

	double coeficientetransmision = 3.1d;
	

	

	public Moto(int potencia, int peso,double coeficientetransmision) {
		super(potencia, peso);
		this.coeficientetransmision = coeficientetransmision;
		// TODO Auto-generated constructor stub
	}


	@Override
	Double aceleracionAproximada() {
		double a = (peso*771.3/(2*potencia*735))*coeficientetransmision;
		return a;
	}
	
	

}
