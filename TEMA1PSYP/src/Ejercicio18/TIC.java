package Ejercicio18;

public class TIC extends Thread {
	String nombre;
	Token tok;
	
	public TIC(Token tok) {
		this.nombre = "TIC";
		this.tok = tok;
	}
	@Override
	public void run() {
		tok.compruebaTurnoTIC(nombre);
		
		
	}

}
