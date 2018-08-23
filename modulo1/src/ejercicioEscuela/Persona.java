package ejercicioEscuela;


public class Persona {
	private Integer edad;
	private String nombre;
	private Persona hermano;
	//private String hermano;
	private Perro perro;
	private Gato gato;
	
	public Persona() {
	
	}
	public Persona(Integer edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// PREGUNTAR MAÑANA 
	public Persona getHermano() {
		return hermano;
	}
	public void setHermano(Persona hermano) {
		this.hermano = hermano;
	}
//	
//	public Perro getPerro() {
//		return perro;
//	}
//	public String getHermano() {
//		return hermano;
//	}
//	public void setHermano(Persona hermano) {
//		this.hermano = hermano;
//	}
	public void setPerro(Perro perro) {
		this.perro = perro;
	}
	public Gato getGato() {
		return gato;
	}
	public void setGato(Gato gato) {
		this.gato = gato;
	}
	// LOGICA DE PERSONA
	
	public String tocar(Object object, String lugar) {
		return "Estoy tocando a "+"\n"+
				object + " En "+lugar+" y le encanta";
	}
	public String darComer(Object object) {
		return "Estoy contento porque a "+"\n"+
				object +" le estoy dando el pienso que mas le gusta";
	}
	public String acariciarPerro(Perro perro) {
		return "Estas acariciando a: "+"\n"+
					perro +" y me siento contento con las caricias.";
	}
	public String acariciarPerro(Gato gato) {
		return "Estas acariciando a: "+"\n"+
					gato +" y me siento contento con las caricias.";
	}
	
	public String perroEsNull(Perro perro) {
		if(perro == null) {
			return "No tiene perro";
		}else {
			
			return perro.toString();
		}
	}
	@Override
	public String toString() {
		Perro perro = this.perro;
		if(hermano == null) {
		return	"Persona"+"\n"+
					  " · Edad: " + edad +"\n"+
					  " · Nombre: " + nombre + "\n"+
					  " · Hermano: " + "Propiedades del Hermano : no tiene hermanos "+"\n"+
					  " · perro: " + perroEsNull(perro);
		}
		else if(perro == null) {
			return "no tiene perro";
		}
		return "Persona"+"\n"+
				  " · Edad: " + edad +"\n"+
				  " · Nombre: " + nombre + "\n"+
				  " · Hermano: " + "Propiedades del Hermano [ "+ hermano.getNombre() +" ]"+"\n"+
				  " · perro: " + perroEsNull(perro);
	}
}

	

