package Ejercicio8;

import org.omg.CORBA.Current;

public class CorredorAnimal implements Runnable {

	public CorredorAnimal() {

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "-" + Thread.currentThread().getName()+"-"+Thread.currentThread().getPriority());
			
		}

	}


}
