package Ejercicio21;

public class Control {
	boolean cont;

	public Control() {
		cont = true;
	}

	public synchronized void pintaA(String nombre) {

		System.out.println(nombre);

	}

	public synchronized void pintaB(String nombre) {

		System.out.print(nombre);
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();

	}

}
