package Ejercicio20;

public class TAC extends Thread {
	String nombre;
	Token tok;

	public TAC(Token tok) {
		this.nombre = "TAC";
		this.tok = tok;
	}
	@Override
	public void run() {
		while (true) {
			
			tok.pintaTac(nombre);
		}
	
	
	}
	

}
