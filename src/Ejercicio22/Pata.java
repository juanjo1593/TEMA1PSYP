package Ejercicio22;

public class Pata extends Thread{
	String nombre;
	Control cont;
	public Pata(String nom) {
	this.nombre=nom;
	cont= new Control();
	}
	@Override
	public void run() {
		while (true) {
		cont.pintaPata(nombre);
			
		}
	}
	
}
