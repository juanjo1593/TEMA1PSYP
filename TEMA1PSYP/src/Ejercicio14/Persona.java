package Ejercicio14;

public class Persona extends Thread{
	String nombre;
	int flayers;
	
	public Persona(String nom,int fla) {
		nombre= nom;
		flayers= fla;
	}

	@Override
	public void run() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFlayers() {
		return flayers;
	}

	public void setFlayers(int flayers) {
		this.flayers = flayers;
	}
	
}
