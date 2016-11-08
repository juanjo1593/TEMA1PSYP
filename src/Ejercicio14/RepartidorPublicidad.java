package Ejercicio14;


import java.util.Random;

public class RepartidorPublicidad {
	int flayers ;
	
	public RepartidorPublicidad() {
		flayers=1000;
	}
	
	public void reparteFlayers(){
		Random rand = new Random();
		
		flayers= flayers-rand.nextInt(1000);
	}
	public int obtenerFlayers(){
		return flayers;
	}

}
