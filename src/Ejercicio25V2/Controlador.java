package Ejercicio25V2;

import java.util.Arrays;

public class Controlador {
	int cont;
	boolean[] palillos;

	public Controlador() {
		cont = 1;
		palillos = new boolean[5];
		Arrays.fill(palillos, false);
	}

	public void comeHegel(String nombre) {
		synchronized (this) {

			while (palillos[0] == true | palillos[1] == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			palillos[0] = true;
			palillos[1] = true;
		}

		comer(nombre, 0, 1);
		synchronized (this) {

			System.out.println("El filosofo " + nombre + " SOLTÓ los dos palillos\n");
			notifyAll();
		}
	}

	public void comer(String nombre, int i, int j) {
		System.out.println(nombre + " cogió los dos palillos.");
		System.out.println(nombre + " come.");

		palillos[i] = false;
		palillos[j] = false;

	}

	public void comeArist(String nombre) {
		synchronized (this) {

			while (palillos[1] == true | palillos[2] == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			palillos[1] = true;
			palillos[2] = true;
		}
		comer(nombre, 1, 2);
		synchronized (this) {

			System.out.println("El filosofo " + nombre + " SOLTÓ los dos palillos\n");
			notifyAll();
		}
	}

	public void comeLocke(String nombre) {
		synchronized (this) {

			while (palillos[2] == true | palillos[3] == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			palillos[2] = true;
			palillos[3] = true;
		}
		comer(nombre, 2, 3);
		synchronized (this) {

			System.out.println("El filosofo " + nombre + " SOLTÓ los dos palillos\n");
			notifyAll();
		}
	}

	public void comeSocrates(String nombre) {
		synchronized (this) {

			while (palillos[3] == true | palillos[4] == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			palillos[3] = true;
			palillos[4] = true;
		}

		comer(nombre, 3, 4);

		synchronized (this) {
			System.out.println("El filosofo " + nombre + " SOLTÓ los dos palillos\n");
			notifyAll();
		}

	}

	public void comeKant(String nombre) {
		synchronized (this) {

			while (palillos[4] == true | palillos[0] == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			palillos[4] = true;
			palillos[0] = true;
		}
		comer(nombre, 4, 0);
		synchronized (this) {

			System.out.println("El filosofo " + nombre + " SOLTÓ los dos palillos\n");
			notifyAll();
		}
	}

}
