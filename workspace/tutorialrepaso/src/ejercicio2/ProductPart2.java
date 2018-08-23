package ejercicio2;

public class ProductPart2 {


	private int numeroDeElementos;
	private String nombreDelProducto;
	private int numeroDeExistencias;
	private double precioDeCadaUnidad;
	private double precioFinal;
	
	public ProductPart2() {
	this.numeroDeElementos=0;
	this.nombreDelProducto=null;
	this.numeroDeExistencias=0;
	this.precioDeCadaUnidad=0d;
	}
	


	public ProductPart2(int numeroDeElementos, String nombreDelProducto,
			int numeroDeExistencias, double precioDeCadaUnidad) {
		this.numeroDeElementos = numeroDeElementos;
		this.nombreDelProducto = nombreDelProducto;
		this.numeroDeExistencias = numeroDeExistencias;
		this.precioDeCadaUnidad = precioDeCadaUnidad;
	}

	public int getNumeroDeElementos() {
		return numeroDeElementos;
	}

	public void setNumeroDeElementos(int numeroDeElementos) {
		this.numeroDeElementos = numeroDeElementos;
	}

	public String getNombreDelProducto() {
		return nombreDelProducto;
	}

	public void setNombreDelProducto(String nombreDelProducto) {
		this.nombreDelProducto = nombreDelProducto;
	}

	public int getNumeroDeExistencias() {
		return numeroDeExistencias;
	}

	public void setNumeroDeExistencias(int numeroDeExistencias) {
		this.numeroDeExistencias = numeroDeExistencias;
	}

	public double getPrecioDeCadaUnidad() {
		return precioDeCadaUnidad;
	}

	public void setPrecioDeCadaUnidad(double precioDeCadaUnidad) {
		this.precioDeCadaUnidad = precioDeCadaUnidad;
	}
	
	

	@Override
	public String toString() {
		return "Productos \n" 
				+ " � ID DEL PRODUCTO : " + numeroDeElementos +"\n"
				+ " � NOMBRE DEL PRODUCTO : " + nombreDelProducto +"\n"
				+ " � NUMERO DE EXISTENCIAS : " + numeroDeExistencias +"\n"
				+ " � PRECIO DE CADA UNIDAD : " + precioDeCadaUnidad + "\n"
				+ " � DE TODOS LOS PRODUCTOS : " + precioFinal;
	}
	
	public double calcularPrecioDeCadaProducto(){
		double precioFinal;
		precioFinal= numeroDeExistencias * precioDeCadaUnidad;
		this.precioFinal=precioFinal ;
		System.out.println("El precio final  de todos los productos en stock es: "+ nombreDelProducto+ " es: "+this.precioFinal);
		return this.precioFinal;
		
	}
	
	
	
	

}
