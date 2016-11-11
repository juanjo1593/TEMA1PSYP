package Ejercicio24;

public class Productor  extends Thread{
	Controlador cont;
	public Productor(Controlador controlador) {
		this.cont=controlador; 
	}
	@Override
	public void run() {
	for (int i = 0; i < 100; i++) {
		cont.intentaProducir(i);
	}
	}

}
