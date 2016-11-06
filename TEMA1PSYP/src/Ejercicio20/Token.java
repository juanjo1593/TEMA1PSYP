package Ejercicio20;

public class Token {
	int contador;

	public Token() {
		contador = 1;
	}

	public synchronized void pintaTic(String nombre) {
		
		while (contador!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(nombre);
		notifyAll();
		contador++;
	
		
		
	}

	public synchronized void pintaTac(String nombre) {
		while (contador!=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("\t"+nombre);
		notifyAll();
		contador++;
		
		
		

	}

	public synchronized void pintaToc(String nombre) {
		
		while (contador!=3) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("\t\t"+nombre);
		contador=1;
		
		

	}
}
