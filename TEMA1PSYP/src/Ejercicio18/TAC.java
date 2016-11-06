package Ejercicio18;

public class TAC extends Thread{
	String nombre;
	Token tok;
	
	public TAC(Token tok) {
	this.nombre="TAC";
	this.tok=tok;
	}
	@Override
	public void run() {
		tok.compruebaTurnoTAC(nombre);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
