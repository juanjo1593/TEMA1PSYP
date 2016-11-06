package Ejercicio8;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
	String [] animales ={"Tortuga","Liebre","Guepardo"};
	
	for (int i = 0; i < animales.length; i++) {
		Thread hilo=new Thread( new CorredorAnimal()); 
		hilo.setName(animales[i]);

		if ("Tortuga".equals(hilo.getName())) {
			hilo.setPriority(1);
		} else if ("Liebre".equals(hilo.getName())) {
			hilo.setPriority(5);
		} else {
			hilo.setPriority(10);
		}
		
		hilo.start();
		hilo.yield();
		
	}

	}

}
