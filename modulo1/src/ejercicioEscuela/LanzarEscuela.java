package ejercicioEscuela;

import java.util.ArrayList;
import java.util.List;

import javax.naming.ldap.ManageReferralControl;

public class LanzarEscuela {
	public static void main(String[] args) {
		
		
		//List<Persona> alumnos = new ArrayList<>();
		Persona alba = new Persona(10, "Alba");
		Perro perroTito = new Perro("Perro Tito", "Blanco y Negro");
		// ALBA QUIERE UN PERRO.
		alba.setPerro(perroTito);
		//MARTINA TAMBIEN ES DUEÑA DEL PERRO DE ALBA.
		Persona martina = new Persona(1,"Martina");
		// SET PERRO DE ALBA TAMBIEN ES PROPIEDAD DE MARTINA Y LE ACARICIA EN EL LOMO.
		martina.setPerro(perroTito);
		System.out.println(martina);
		System.out.println("\n");
		System.out.println(martina.acariciarPerro(perroTito));
		System.out.println("\n");
		//TOCAMOS EL PERRO EN LAS PARTES INDICADAS
		System.out.println(martina.tocar(perroTito, "cabeza"));
		System.out.println("Lo mejor del diaaa Mis animalitos");
		System.out.println("\n");
		System.out.println(martina.darComer(perroTito));
		//ALBA Y MARTINA SON HERMANAS Y DEBE ESTAR REGISTRARO.
		System.out.println("");
		// LA ASIGNACION DE HERMANOS  NO ME COGE LA PROPIEDAD
		System.out.println("Asignacion de hermanos");
		
		alba.setHermano(martina);
		martina.setHermano(alba);
		System.out.println(alba);
		System.out.println(martina);
		System.out.println("");
		Persona marcos = new Persona(6, "Marcos");
		Gato misifu = new Gato("miziifu");
		System.out.println("Marcos acaricia el gato");
		System.out.println(marcos.acariciarPerro(misifu));
		System.out.println(misifu.tirarCola());
		/*CON EL METODO TOCAR EXISTE POLIMORFISMO PORQUE MISMO METODO VALE PARA DOS ANIAMES DISTINTOS.*/
		System.out.println(marcos.tocar(misifu, "pierna"));
		System.out.println("==========AÑADIMOS ALUMNOS A LA ESCUELA==========");
		Escuela escuela = new Escuela("Montpellier");
		escuela.insertarAlumno(marcos);
		escuela.insertarAlumno(martina);
		escuela.insertarAlumno(alba);
		escuela.insertarAlumno(new Persona(3, "Jartin"));
//		alumnos.add(martina);
//		alumnos.add(marcos);
//		alumnos.add(new Persona(3, "Jartin"));
//		alumnos.add(new Persona(8, "Carla"));
		System.out.println("");
		System.out.println("============ALUMNOS DE LA ESCUELA "+ escuela + " en el curso de parbulitos JAVA============");
		escuela.listar();

		
		

	}

}
