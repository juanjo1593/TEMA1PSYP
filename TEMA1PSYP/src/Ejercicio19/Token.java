package Ejercicio19;

public class Token {

	public Token() {

	}
//
	public synchronized void pintaTic(String nombre) {
		while (true) {
			notify();
			System.out.println(nombre);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	public synchronized void pintaTAC(String nombre) {
		while (true) {

			notify();
			System.out.println("\t"+nombre);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
