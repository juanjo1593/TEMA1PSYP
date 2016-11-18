package Ejercicio27;

public class Barco extends Thread{
	String nombre;
	Puente puente;
	
	public Barco(Puente puente) {
		this.puente=puente;
		this.nombre="Titanic";
	}
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			puente.pasaBarco(nombre);
		}
	}

}
