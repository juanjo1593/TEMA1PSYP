package Ejercicio28;

public class Oxigeno extends Thread{
	Controlador contr;
	String nombre;

	public Oxigeno (Controlador contr) {
		this.contr = contr;
		this.nombre = "Oxígeno";

	}

	@Override
	public void run() {
		while (true) {
			contr.produceOxigeno(nombre);
			contr.produceAgua();
			
		}
	}
}
