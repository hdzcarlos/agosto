package herencia;

public class Jefe extends Empleado{
	
	private double incentivos;

	public Jefe(String nif, String nombre, double sueldo, double incentivos) {
		super(nif, nombre, sueldo);
		this.incentivos = incentivos;
	}

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}
	@Override
	public String toString() {
		return super.toString()+"Jefe [incentivos=" + incentivos + "]";
	}
	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		return super.getSueldo()+this.incentivos;
	}
	@Override
	public String quienSoy() {
		// TODO Auto-generated method stub
		return super.quienSoy()+" y Ademas soy un jefe";
	}
	
}