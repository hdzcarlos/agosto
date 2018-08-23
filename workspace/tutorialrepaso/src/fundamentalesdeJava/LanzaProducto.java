package fundamentalesdeJava;

public class LanzaProducto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProductPart1 product1 = new ProductPart1();
		ProductPart1 product2 = new ProductPart1();
		ProductPart1 product3 = new ProductPart1(2,"Frigorifico",5,100.0);
		ProductPart1 product4 = new ProductPart1(100,"Servilletas",500,50.00d);
		ProductPart1 product5 = new ProductPart1(5,"Horno",30,600.00d);
		ProductPart1 product6 = new ProductPart1(1,"Micro-ondas",1000,80.00);
		
		
		
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);
		System.out.println(product4);
		System.out.println(product5);
		System.out.println(product6);
		

	}

}
