package Ejercicio24;

import java.util.ArrayList;

public class Controlador {
	ArrayList<Integer> buffer;

	public Controlador() {
		buffer = new ArrayList<>();
	}

	public synchronized void intentaProducir(int i) {
		while (buffer.size()==5) {
		try {
			System.out.println("El productor espera.\n");
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		
		System.out.println("Se produce el número "+i+"\n");
		buffer.add(i);
		System.out.print("\n*");
		for (int j = 0; j < buffer.size(); j++) {
			System.out.print(buffer.get(j)+"\t");
		}
		notify();
		
	}

	public synchronized void intentanConsumir() {

		while (buffer.isEmpty()) {
			try {
				System.out.println("El consumidor espera.\n");
				System.out.println();
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		buffer.remove(0);
		System.out.print("*");
		for (int j = 0; j < buffer.size(); j++) {
			System.out.print(buffer.get(j)+"\t");
		}
		notify();

	}

}
