package Ejercicio25;

public class Hegel extends Thread{
	
	String nombre;
	Controlador contr;
	public Hegel(Controlador contr) {
		nombre= "Socrates";
		this.contr=contr;
	}
	
	@Override
	public void run() {
		for (int i = 0; i <3; i++) {
			contr.comeHegel(nombre);
		}
		
	}

}
