package Ejercicio22;

public class Principal {

	public static void main(String[] args) {
	Control cont= new Control();
	for (int i = 0; i < 4; i++) {
		Pata pata= new Pata(String.valueOf(i));
		pata.start();
	}
	

	}

}
