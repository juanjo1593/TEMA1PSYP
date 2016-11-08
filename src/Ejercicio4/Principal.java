package Ejercicio4;

import javax.swing.event.TreeExpansionEvent;

public class Principal {

	public static void main(String[] args) {
		
		Thread hilo = new Thread(new Hilo());
		hilo.start();

	}
	

}
