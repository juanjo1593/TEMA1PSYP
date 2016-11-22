package Ejercicio27Modificacion;

public class Barco extends Thread{
	String nombre;
	Puente puente;
	
	public Barco(Puente puente,String nombre) {
		this.puente=puente;
		this.nombre=nombre;
	}
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			puente.pasaBarco(nombre);
		}
	}

}
