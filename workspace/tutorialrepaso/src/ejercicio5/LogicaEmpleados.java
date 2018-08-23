package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LogicaEmpleados {
	List<Empleado> empleados = new ArrayList<Empleado>();
	
	public void mostrarMenu(){
		
		  Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion; //Guardaremos la opcion del usuario
	        do{
	            
		           System.out.println("1. Introducir nuevo Empleado");
		           System.out.println("2. Mostar informacion de un Empleado (DNI)");
		           System.out.println("3. Listar Empleados (por edad, de mayor a menor)");
		           System.out.println("4. Imprimir el numero de Empleados");
		           System.out.println("4. listar todos los empleados");
		           System.out.println("5. Pulse 5 para salir");
		            
		           System.out.println("Escribe una de las opciones");
		           opcion = sn.nextInt();
	        	
	        }  while(salir);
	    
	      
	            
	           switch(opcion){
	               case 1:
	                   System.out.println("Has seleccionado la introducir nuevo empleado");
	                   insertarEmpleado();
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado Mostrar informacion DNI");
	                   mostrarDNI();
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado Listar Empleados Por edad de mayor a menor");
	                   listarEmpleadosPorEdad();
	                   break;
	                case 4:
	                	System.out.println("Has selecionado Listar todos los empleados");
	                	listarEmpleados();
	                	break;
	                case 5:
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 5");
	           }
	        
	}
	
	public void insertarEmpleado(){
		Empleado empleado = new Empleado();
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduzca el nombre del empleado");
		empleado.setNombre(sn.next());
		System.out.println("Introduzca el DNI");
		empleado.setDni(sn.nextInt());
		System.out.println("Introduzca la EDAD");
		empleado.setEdad(sn.nextInt());
		empleados.add(empleado);
		mostrarMenu();
		
	}
	public void mostrarDNI(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un DNI");
		int dni = sc.nextInt();
		for (Empleado emp : empleados) {
			if(dni==emp.getDni()){
				System.out.println(emp.getNombre());
				System.out.println(emp.getEdad());
				System.out.println(emp.getSalario());
				
			}else{
				System.out.println("No existe ese Empleado ");
			}
		}
	}
	public void listarEmpleadosPorEdad(){
		Collections.sort(empleados);
		for (Empleado emp : empleados) {
			System.out.println(emp);
		}
		mostrarMenu();
		
	}
	public void listarEmpleados(){
		
		for (Empleado e : empleados) {
			System.out.println(e);
			
		}
		mostrarMenu();
	}


}
