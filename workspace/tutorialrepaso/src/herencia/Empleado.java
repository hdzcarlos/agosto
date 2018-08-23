package herencia;

public class Empleado {
	
	private String nif;
	private String nombre;
	private double sueldo;
	public static int empleadosTotales=0;
	

	

	public Empleado(String nif, String nombre, double sueldo) {

		this.nif = nif;
		this.nombre = nombre;
		this.sueldo = sueldo;
		empleadosTotales++;
	}
	public static String quePasa(){
		return "Que pasa";
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public String quienSoy(){
		return "Soy un trabajador";
	}
	@Override
	public String toString() {
		return "Empleado [nif=" + nif + ", nombre=" + nombre + ", sueldo="
				+ sueldo + "]";
	}
	
	
	
	
	
	

}
