package Ejercicio14;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) throws InterruptedException {
		String [] nombres= {"Juan","Marta","Pedro","María","Lucía"};
		ArrayList<Persona> personas= new ArrayList<>();
		RepartidorPublicidad rep= new RepartidorPublicidad();
		for (int i = 0; i < nombres.length; i++) {
			Persona per= new Persona(nombres[i],rep.obtenerFlayers());
			per.start();
			personas.add(per);
			
		}
		for (int i = 0; i < personas.size(); i++) {
			personas.get(i).join();
		}
		for (int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i).getNombre()+","+personas.get(i).getFlayers());
		}
		
	}

}
