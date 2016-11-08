package Ejercicio21;

public class B extends Thread{
	String nombre;
	Control cntrl;
	public B(Control control) {
		this.nombre="B";
		this.cntrl=control;
	}
	@Override
	public void run() {
		while (true) {
			cntrl.pintaB(nombre);
		
		}
	}
}
