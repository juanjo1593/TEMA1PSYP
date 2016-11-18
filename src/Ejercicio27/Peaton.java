package Ejercicio27;

public class Peaton extends Thread{
	String nombre;
	Puente puente;
	
	public Peaton(String nombre, Puente puente) {
		this.nombre=nombre;
		this.puente=puente;
	}
	
	@Override
	public void run() {
	for (int i = 0; i < 5; i++) {
		puente.pasaPeaton(nombre);
	}
	}
}
