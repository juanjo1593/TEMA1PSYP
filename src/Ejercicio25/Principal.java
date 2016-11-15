package Ejercicio25;

public class Principal {

	public static void main(String[] args) {
		Controlador contr= new Controlador();
		
		Socrates soc= new Socrates(contr);
		Kant kant= new Kant(contr);
		Locke locke= new Locke(contr);
		Aristoteles arist= new Aristoteles(contr);
		Hegel hegel = new Hegel(contr);
		
		soc.start();
		kant.start();
		locke.start();
		arist.start();
		hegel.start();

	}

}
