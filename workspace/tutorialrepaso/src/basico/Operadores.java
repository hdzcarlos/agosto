package basico;

public class Operadores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	int x=1;
	int y=2;
	int z=3;
	char j='d';
	
	//operadores de asignación
	/*
	x++ > x=x+1;
	++x > x=x+1;
	
	x+=y > x=x+y;
	x-=y > x=x-y;
	x*=y > x=x*y;
	*/
	System.out.println(x++);
	System.out.println(++x);
	System.out.println(x+=y);
	System.out.println(x-=y);
	System.out.println(x*=y);
	System.out.println(x/=y);
	
	
	//operadores de comparacion
	/*
	 * 
	 */
	System.out.println(x==y);
	 System.out.println(x>y);
	 System.out.println(x<y);
	 System.out.println(x>=y);
	 System.out.println(x<=y);
	 System.out.println(x!=y);
	 System.out.println(x==j);
	
	//operadores logicos
	
	 /*
		 * condicion1 && condicion2 se evaluan las dos condiciones true true = true
		 * condicion1 & condicion2 se evalua solo 1 condición true = true
		 * || or
		 * ! negacion
		 */
	 boolean millonario=true;
	 boolean espanol=false;
	 System.out.println(millonario && espanol);
	 System.out.println(millonario & espanol);
	 System.out.println(millonario || espanol);
	 System.out.println(!millonario);
	}

}
