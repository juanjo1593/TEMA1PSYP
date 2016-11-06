package Ejercicio21;

public class Control {
	int cont;

	public Control() {
		cont = 1;
	}

	public synchronized void pintaAB(String nombre) {
		notifyAll();
		if (nombre.equals("A")) {
			System.out.println(nombre);
			
		}else if (nombre.equals("B")) {
			System.out.print(nombre);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public synchronized void pintaB(String nombre) {
		while (cont != 2) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.print(nombre);
		notify();
		cont = 1;

	}

}
