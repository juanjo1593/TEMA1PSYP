package Ejercicio28;

public class Hidrogeno extends Thread {
	Controlador contr;
	String nombre;

	public Hidrogeno(Controlador contr) {
		this.contr = contr;
		this.nombre = "Hidr�geno";

	}

	@Override
	public void run() {
		while (true) {
			contr.produceHidrogeno(nombre);
			contr.produceAgua();
			
			
		}
	}
}
