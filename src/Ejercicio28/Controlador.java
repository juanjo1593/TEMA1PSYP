package Ejercicio28;

public class Controlador {
	int contadorHidro;
	int contadorOxi;

	public Controlador() {
		this.contadorHidro = 0;
		this.contadorOxi = 0;
	}

	public synchronized void produceHidrogeno(String nombre) {
		while (contadorHidro > 1) {
			try {
				System.out.println("No se puede meter más " + nombre);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("Se ha metido " + nombre);
		contadorHidro++;
		if (contadorHidro==1) {
			notifyAll();
		}

	}

	public synchronized void produceOxigeno(String nombre) {
		while (contadorOxi > 0) {
			try {
				System.out.println("No se puede meter más " + nombre);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Se ha metido " + nombre);
		contadorOxi++;
		

	}

	public synchronized void produceAgua() {
		if (contadorHidro == 2 & contadorOxi == 1) {
			System.out.println("Se hizo agua.\n\n");
			contadorHidro = 0;
			contadorOxi = 0;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notifyAll();

		}

	}

}
