package Ejercicio25V2;

import java.util.Arrays;

public class Controlador {
	int cont;
	boolean [] palillos;

	public Controlador() {
		cont = 1;
		palillos=new boolean [4];
		Arrays.fill(palillos, false);
	}

	public   synchronized void comeHegel(String nombre) {
		while (cont != 5) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("\t\t\t\t"+nombre+" toma el palillod de la izquierda y la derecha, come y lo suelta.");
		cont=1;
		notifyAll();
	}

	public synchronized void comeArist(String nombre) {
		while (cont != 4) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\t\t\t" + nombre + " toma el palillod de la izquierda y la derecha, come y lo suelta.");
		cont++;
		notifyAll();
	}

	public  synchronized void comeLocke(String nombre) {
		while (cont != 3) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("\t\t" + nombre + " toma el palillod de la izquierda y la derecha, come y lo suelta.");
		cont++;
		notifyAll();
	}

	public  synchronized void comeSocrates(String nombre) {
		while (cont != 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
			System.out.println(nombre + " toma el palillod de la izquierda y la derecha, come y lo suelta.");
			cont++;
			notifyAll();
		

	}

	public  synchronized void comeKant(String nombre) {
		while (cont != 2) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("\t" + nombre + " toma el palillod de la izquierda y la derecha, come y lo suelta.");
		cont++;
		notifyAll();
	}

}
