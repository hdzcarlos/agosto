package ejercicio3;

public class LanzaderaVideoCLub {
	
	public static void main(String[] args) {
		CintaVideo cintaVideo =new CintaVideo("Los gunis", "10000", 100, "2");
		Juego juego = new Juego("World of Warcraft", "1000", 200, "PC", 1, 100);
		Dvd dvd = new Dvd("Samurai", "10", 20, "Espagnol", "FullHD");
		
		System.out.println(cintaVideo.imprimeCaracteristicas());
	    System.out.println(juego.imprimeCaracteristicas());
	    System.out.println(dvd.imprimeCaracteristicas());
	}
	
	
}
