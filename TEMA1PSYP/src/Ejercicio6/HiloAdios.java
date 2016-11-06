package Ejercicio6;

public class HiloAdios implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println((i+1)+"-Adios");
		}
		
	}

}
