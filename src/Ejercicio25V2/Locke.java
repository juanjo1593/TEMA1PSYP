package Ejercicio25V2;

public class Locke extends Thread{
	String nombre;
	Controlador contr;
	public Locke(Controlador contr) {
		nombre= "Locke";
		this.contr=contr;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			contr.comeLocke(nombre);
			yield();
		}
		
	}
}
