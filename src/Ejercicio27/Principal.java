package Ejercicio27;

public class Principal {

	public static void main(String[] args) {
		Puente puente= new Puente();
		String [] nombres={"María","Pepe","Juan","Raúl","Javier"};
		for (int i = 0; i < 5; i++) {
			Peaton peaton = new Peaton(nombres[i],puente);
			peaton.start();
			
		}
		Barco barco= new Barco(puente);
		barco.start();

	}

}
