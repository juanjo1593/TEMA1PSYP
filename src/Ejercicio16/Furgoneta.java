package Ejercicio16;

public class Furgoneta extends Thread {

	String nombre;
	PilaPaquetes paquetes;
	int paquetesRepartidos;

	public Furgoneta(String nombre,PilaPaquetes paque) {
	this.nombre= nombre;
	this.paquetes=paque;
	this.paquetesRepartidos=0;
	
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public PilaPaquetes getPaquetes() {
		return paquetes;
	}



	public void setPaquetes(PilaPaquetes paquetes) {
		this.paquetes = paquetes;
	}



	public int getPaquetesRepartidos() {
		return paquetesRepartidos;
	}



	public void setPaquetesRepartidos(int paquetesRepartidos) {
		this.paquetesRepartidos = paquetesRepartidos;
	}



	@Override
	public void run() {
		while (paquetes.repartir()) {
			
			paquetesRepartidos++;
			//yield();
		}
		
	
	}
	public String muestraPaquetes(){
		return "La furgoneta "+nombre+" ha repartido "+paquetesRepartidos+" paquetes";
	}
}
