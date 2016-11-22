package Ejercicio27Modificacion;

public class Principal {

	public static void main(String[] args) {
		Puente puente= new Puente();
		String [] nombres={"María","Pepe","Juan","Raúl","Javier"};
		String [] nombreBarcos={"Titanic","Lisa","Santa María"};
		for (int i = 0; i < 5; i++) {
			Peaton peaton = new Peaton(nombres[i],puente);
			peaton.start();
			
		}
		
		for (int i = 0; i < 3; i++) {
			Barco barco= new Barco(puente,nombreBarcos[i]);
			barco.start();
		}
		
		

	}

}
