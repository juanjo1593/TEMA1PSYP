package Ejercio15;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		String [] NombreCoches ={"Coche1","Coche2","Coche3","Coche4"};
		Coche [] coche= new Coche[4];
		Carretera carretera=new Carretera();
		
		for (int i = 0; i <  NombreCoches.length; i++) {
			coche[i]=new Coche ( NombreCoches[i]);
			coche[i].start();
			
		}
		
		
		

	}

}
