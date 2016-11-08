package Ejercicio20;

public class TOC extends Thread{
	String nombre;
	Token tok;

	public TOC(Token tok) {
		this.nombre = "TOC";
		this.tok = tok;
	}
	@Override
	public void run() {
		while (true) {
			
				tok.pintaToc(nombre);
		}
	
	
	}
	
	
	
}
