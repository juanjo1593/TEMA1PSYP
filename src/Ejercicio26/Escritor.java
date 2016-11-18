package Ejercicio26;

public class Escritor extends Thread{
	String nombre;
	int numIteracion;
	Controlador contr;
	
	public Escritor(Controlador contr,String nombre) {
		this.contr=contr;
		this.nombre= nombre;
		this.numIteracion=0;
		
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			contr.entraEscritor();
			contr.actualEscritor(nombre, i);
			contr.saleEscritor();
		}
	}
	
	

}
