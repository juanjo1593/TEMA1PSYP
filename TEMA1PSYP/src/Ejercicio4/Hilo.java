package Ejercicio4;

public class Hilo implements Runnable {
	String ad = "ADIOS";

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println((i+1)+"-"+ad);
		}
		
	}

	

}
