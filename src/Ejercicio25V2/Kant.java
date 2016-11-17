package Ejercicio25V2;

public class Kant extends Thread {
	String nombre;
	Controlador contr;
	public Kant(Controlador contr) {
		nombre= "Kant";
		this.contr=contr;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			contr.comeKant(nombre);
			yield();
		}
	}
}
