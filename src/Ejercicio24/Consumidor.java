package Ejercicio24;

public class Consumidor extends Thread {
	Controlador cont;
	
	public Consumidor(Controlador controlador) {
		this.cont= controlador;
	}
	@Override
	public void run() {
	for (int i = 0; i < 100; i++) {
		cont.intentanConsumir();
	}
	}
}
