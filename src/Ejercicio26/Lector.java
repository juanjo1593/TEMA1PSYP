package Ejercicio26;

public class Lector extends Thread{
	Controlador contr;
	int numIteracion;
	String nombre;
	
	public Lector(Controlador contr,String nombre) {
		this.contr=contr;
		this.nombre=nombre;
		this.numIteracion=0;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			
		}
	}

}
