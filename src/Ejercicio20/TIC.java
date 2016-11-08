package Ejercicio20;

public class TIC extends Thread{
	String nombre;
	Token tok;
	public TIC(Token tok) {
		this.nombre = "TIC";
		this.tok=tok;
	}
	@Override
	public void run() {
		while (true) {
			tok.pintaTic(nombre);
	
			
		}
		
	}
	

}
