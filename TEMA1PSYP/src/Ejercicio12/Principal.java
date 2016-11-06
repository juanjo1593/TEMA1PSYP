package Ejercicio12;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		ArrayList <Persona>personas= new ArrayList<>();
		CuentaBancaria cuenta= new CuentaBancaria();
		for (int i = 0; i <3; i++) {
			Persona per= new Persona(cuenta);
			per.start();
			personas.add(per);
			
			
		}
		for (int i = 0; i < personas.size(); i++) {
			personas.get(i).join();
		}
		
		
		
		System.out.println(cuenta.obtenerSaldo());

	}

}
