package Ejercicio25;

public class Aristoteles extends Thread{
	String nombre;
	Controlador contr;
	public Aristoteles(Controlador contr) {
		nombre= "Socrates";
		this.contr=contr;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			contr.comeArist(nombre);
		}
	}

}