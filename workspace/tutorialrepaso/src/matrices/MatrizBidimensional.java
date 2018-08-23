package matrices;

public class MatrizBidimensional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] elementos = {{8,23,2,14},{5,12,13,18},{7,15,16,20}};
		System.out.println("Con un FOR NORMAL ");
		for (int i = 0; i < elementos.length; i++) {
			for (int j = 0; j < elementos[i].length; j++) {
				System.out.println("Elemento POSICIONES "+ i +" "+ " " + j +" ----ARRAY ELEMENTO= "+ elementos[i][j]);
			}
			
			
		}
		
		System.out.println("CON FOREACH");
		for (int[] fila : elementos) {
			
			for (int columna : fila) {
				System.out.println("Elemento POSICIONES "+" "+ " " + columna +" ----ARRAY ELEMENTO= "+ columna);
			}
			
		}
		
		//elemento[0][1]=23;

	}

}
