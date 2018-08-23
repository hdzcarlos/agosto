package excepciones;

import java.awt.Image;
import java.io.File;
import java.io.IOError;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		System.out.println("Antes de la excepcion");
		

	
			try {
				puedefallar();
			} catch (ArrayIndexOutOfBoundsException | ArithmeticException | IOError | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
		
	
	
	public static void puedefallar()throws IOError, IOException, ArithmeticException, ArrayIndexOutOfBoundsException {
		
		int[] a = new int[2];
		a[1] = 24;
		a[2] = 24;
		a[3] = 24;
		
	}
	
	public static void cargarFichero() throws IOException {
		Image imagen;
		imagen = ImageIO.read(new File ("foto.jpg"));
	}

}
