package Ejercicio17;

import java.util.ArrayList;

public class Hilo extends Thread {
	int valor;
	String nombre;
	ArrayList<Integer> divisibles;
	Object o;

	public Hilo(String nombre, int valor,Object o) {
		this.valor = valor;
		this.nombre = nombre;
		divisibles = new ArrayList<>();
		this.o= o;
	}

	@Override
	public void run() {
		pintaPorPantalla();
	}

	public void pintaPorPantalla() {
		int cont = 0;
		int i = 1;
		synchronized (o) {
			System.out.println("\nSoy el hilo " + nombre + " los primeros divisibles son ");

			do {
				if (i % valor == 0) {
					divisibles.add(i);
					cont++;
				}
				i++;
			} while (cont != 5);

			for (int j = 0; j < divisibles.size(); j++) {
				System.out.println("[" + divisibles.get(j) + "]");
			}
		}

	}

}
