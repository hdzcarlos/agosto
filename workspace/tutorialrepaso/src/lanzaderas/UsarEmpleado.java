package lanzaderas;

import herencia.Empleado;
import herencia.Jefe;

public class UsarEmpleado {
	
	public static void main(String[] args) {
		
		System.out.println("Total empleados "+Empleado.empleadosTotales);
		
		
		Empleado empleado = new Empleado("71029098R","Perico",500);
		Empleado empleado2 = new Empleado("9809457R","Rodolfo",899d);
		Empleado jefe = new Jefe("999999R","Florentino",50000d,20000d);
		
		System.out.println("Empleados totales: " +Empleado.empleadosTotales);
		System.out.println("Metodo estatico "+ Empleado.quePasa());
		
		//DEfino directamente la dimension
		Empleado[] empleados1 = new Empleado[3];
		
		empleados1[0] = empleado;
		empleados1[1] = empleado2;
		empleados1[2] = jefe;
		//Inicializamos y instanciamos 
		Empleado[] empleados2 ={
								new Empleado("71029098R","Perico",500),
							    new Empleado("9809457R","Rodolfo",899d),
					            new Jefe("999999R","Florentino",50000d,20000d)};
		// Inicializamos a la vez que declaramos.
		Empleado[] empleados3 = {empleado,empleado2,jefe};
		System.out.println("=========FOREACH=========");
		System.out.println("Forentino aumenta su incentivo");
		
		//Jefe objEmpleado3 = (Jefe)empleados1[2];
		//objEmpleado3.setIncentivos(20000d);
		//empleados1[2] = objEmpleado3;
		((Jefe)empleados1[2]).setIncentivos(20000);
		
		for (Empleado empleado1 : empleados2) {
			
			System.out.println(empleado1);
			System.out.println(empleado1.quienSoy());
			System.out.println(empleado1.getSueldo());
			System.out.println("\n");
			
		}
		
		
		System.out.println("==========FOR NORMAL ===========");
		
		for (int i = 0; i < empleados3.length; i++) {
			System.out.println(empleado2);
			
		}
		System.out.println("\n");
		System.out.println("================ METODOS NORMALES ==============");
		System.out.println(empleado.quienSoy());
		System.out.println(empleado2.quienSoy());
		System.out.println(jefe.quienSoy());
		
		System.out.println(empleado);
		System.out.println(empleado2);
		System.out.println(jefe);
		
		System.out.println("El sueldo del jefe es: " +jefe.getSueldo());
	
		
	}

}
