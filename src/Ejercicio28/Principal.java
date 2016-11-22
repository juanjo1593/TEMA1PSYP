package Ejercicio28;

public class Principal {

	public static void main(String[] args) {
	Controlador contr= new Controlador();
	
	Hidrogeno hidro= new Hidrogeno(contr);
	Oxigeno oxi= new Oxigeno(contr);
	
	hidro.start();
	oxi.start();

	}

}
