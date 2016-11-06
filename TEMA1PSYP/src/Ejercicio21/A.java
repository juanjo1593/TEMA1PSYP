package Ejercicio21;

public class A extends Thread{
	String nombre;
	Control cntrl;
	
	public A(Control control) {
		this.nombre= "A";
		this.cntrl=control;
	}
	
	@Override
	public void run() {
		while (true) {
			cntrl.pintaAB(nombre);
			yield();
			
		}
	}
	

}
