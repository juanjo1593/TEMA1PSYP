package Ejercicio25V2;

public class Socrates extends Thread{
	String nombre;
	Controlador contr;
	public Socrates(Controlador contr) {
		nombre= "Socrates";
		this.contr=contr;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			contr.comeSocrates(nombre);
		}
	}
	

}
