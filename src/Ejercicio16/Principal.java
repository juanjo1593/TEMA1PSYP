package Ejercicio16;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
	
		Furgoneta [] furgonetas= new Furgoneta[3];
		PilaPaquetes paquetes = new PilaPaquetes();
		String [] cadenaNombres={"furgo1","furgo2","furgo3"};
		
		for (int i = 0; i < furgonetas.length; i++) {
		furgonetas[i]= new Furgoneta(cadenaNombres[i],paquetes);
		furgonetas[i].start();
		
	}
		for (int i = 0; i < furgonetas.length; i++) {
			furgonetas[i].join();
		}
		int paquetesTotalesRepartidos=0;
		for (int i = 0; i <furgonetas.length; i++) {
			paquetesTotalesRepartidos=paquetesTotalesRepartidos+furgonetas[i].getPaquetesRepartidos();
			System.out.println(furgonetas[i].muestraPaquetes());
			
		}
		System.out.println("Se han repartido "+paquetesTotalesRepartidos);
	

	}

}
