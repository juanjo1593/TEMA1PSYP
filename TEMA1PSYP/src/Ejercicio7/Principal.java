package Ejercicio7;

public class Principal {

	public static void main(String[] args) {
		Hilo [] hilos = new Hilo[5];
		
		String []cadenas ={"Zapato","Hola","Adios","Pepe","Mesa"}; 
		
		for (int i = 0; i < hilos.length; i++) {
			hilos[i]= new Hilo(cadenas[i]);
			hilos[i].start();
		}
		
		
		
		

	}

}
