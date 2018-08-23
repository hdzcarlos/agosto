package lanzadera;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.ArticuloDAO;
import pojos.Articulo;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------ Introduce el articulo que quieres ver ------");
		
		int codigo = sc.nextInt();
		
		ArticuloDAO articuloDAO = new ArticuloDAO();
		try {
			Articulo articulo = articuloDAO.getByID(codigo);
			
			System.out.println("DATOS  DEL ARTICULO");
			System.out.println("");
			System.out.println("ID: "+ articulo.getId());
			System.out.println("Nombre: "+ articulo.getNombre());
			System.out.println("PRECIO: "+ articulo.getPrecio());
			System.out.println("");
			System.out.println("=========== TODOS LOS ARTICULOS ===============");
			List<Articulo> todosArticulos = articuloDAO.getAll();
			for (Articulo articulos: todosArticulos) {
				System.out.println("");
				System.out.println("ID: "+ articulos.getId());
				System.out.println("Nombre: "+ articulos.getNombre());
				System.out.println("PRECIO: "+ articulos.getPrecio());
				System.out.println("");	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			int total = articuloDAO.updateArticulo();
			System.out.println("Todos los articulos actualizados " + total);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
