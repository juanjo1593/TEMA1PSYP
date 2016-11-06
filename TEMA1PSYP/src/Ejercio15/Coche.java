package Ejercio15;

public class Coche extends Thread {
	String nombre;
	int km;
	Carretera carre;

	public Coche(String nombre) {
		this.nombre = nombre;
		this.km = 0;
		carre= new Carretera();
	}

	@Override
	public void run() {

		carre.recorreCarretera(nombre);

	}

}
