package Ejercicio25V2;

public class Aristoteles extends Thread{
	String nombre;
	Controlador contr;
	public Aristoteles(Controlador contr) {
		nombre= "Aristoteles";
		this.contr=contr;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			contr.comeArist(nombre);
			yield();
		}
	}

}
