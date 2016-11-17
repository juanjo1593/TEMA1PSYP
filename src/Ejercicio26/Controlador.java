package Ejercicio26;

public class Controlador {
	int numLectores;
	boolean hayEscritores;
	String recurso;
	
	public Controlador() {
	recurso="VACÍO";
	numLectores=0;
	hayEscritores=false;
	}
	
	public synchronized void entraLector(){
		
	}
	
	public synchronized void saleLector(){
		
		
	}
	
	public synchronized void entraEscritor(){
		
	}
	public synchronized void saleEscritor(){
		
	}
	
	public void actualLector(String nombreLector,int numIteracion){
		
	}
	
	public void actualEscritor(String nombreEscritor, int numIteracion){
		
	}

}
