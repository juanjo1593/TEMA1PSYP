package Ejercicio6;

public class HiloHola extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println((i+1)+"-Hola");
		}
	}

}
