package Ejercicio6;

public class Principal {

	public static void main(String[] args) {
		HiloHola hiloHola= new HiloHola();
		Thread hiloAdios= new Thread(new HiloAdios());
		
		hiloHola.start();
		hiloAdios.start();
		

	}

}
