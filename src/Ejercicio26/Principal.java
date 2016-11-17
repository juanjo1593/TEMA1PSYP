package Ejercicio26;

public class Principal {

	public static void main(String[] args) {
		Controlador cont= new Controlador();
		
		for (int i = 0; i < 3; i++) {
			Lector lect= new Lector(cont,"LECTOR-"+i);
			lect.start();
		}
		for (int i = 0; i < 2; i++) {
			Escritor escr= new Escritor(cont,"ESCRITOR-"+i);
			escr.start();
		}

	}

}
