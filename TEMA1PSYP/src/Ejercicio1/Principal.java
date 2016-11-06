package Ejercicio1;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Este es un proceso que cuenta hasta 100.");
		for (int i = 0; i < 100; i++) {
			System.out.println(i+1);
			try{
				Thread.sleep(50);
			}catch(InterruptedException e){e.printStackTrace();}
		}
		
	}
	
	

}
