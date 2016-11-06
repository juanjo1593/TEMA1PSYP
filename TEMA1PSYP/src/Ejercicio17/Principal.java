package Ejercicio17;

public class Principal {

	public static void main(String[] args) {
		Hilo [] hilos = new Hilo[3];
		String [] cadenaHilos= {"1","2","3"};
		Object o= new Object();
		for (int i = 0; i < cadenaHilos.length; i++) {
			hilos[i]= new Hilo(cadenaHilos[i],Integer.parseInt(cadenaHilos[i]),o);
			hilos[i].start();
		}
		

	}

}
