package mapas;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<Integer, String> nombres = new HashMap<Integer, String>();
		
		nombres.put(100, "Perico");
		nombres.put(101, "jose");
		nombres.put(102, "Antonio");
		nombres.put(103, "Pedrete");
		nombres.put(104, "Rorquemada");
		
		nombres.get(100);
		nombres.containsKey(102);
		
		for(Map.Entry elemento:nombres.entrySet()) {
			System.out.println(elemento.getKey()+" "+ elemento.getValue());
		}
		
		
		
		
	}

}
