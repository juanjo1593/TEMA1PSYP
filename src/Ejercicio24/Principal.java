package Ejercicio24;

public class Principal {

	public static void main(String[] args) {
		Controlador controlador= new Controlador();
		
		Consumidor consumidor= new Consumidor(controlador);
		Productor productor= new Productor(controlador);
		
		consumidor.start();
		productor.start();
		

	}

}
