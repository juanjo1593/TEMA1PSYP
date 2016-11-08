package Ejercicio22;

import java.util.Arrays;

public class Control {
	boolean patas[]= new boolean [4];
	int contador;
	
	public Control() {
		Arrays.fill(patas, false);
		contador=0;
		
	}
	public synchronized void pintaPata(String nombre){
		while (!patas[Integer.parseInt(nombre)]) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Se mueve la pata "+nombre);
		if (contador==4) {
			
			notifyAll();
			
		}
		
	}
}
