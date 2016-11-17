package Ejercicio26;

public class Principal {

	public static void main(String[] args) {
		Controlador cont= new Controlador();
		
		for (int i = 0; i < 3; i++) {
			Lector lect= new Lector(cont);
			lect.start();
		}
		for (int i = 0; i < 2; i++) {
			Escritor escr= new Escritor(cont);
			escr.start();
		}

	}

}
