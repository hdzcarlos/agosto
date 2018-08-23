package abstracta;

public abstract class Animal {
	
	public void comer(){
		
		System.out.println("El animal come");
	}
	
	private void dormir() {
		// TODO Auto-generated method stub
System.out.println("El animal duerme");
	}
	
	abstract public void sonido();

}
