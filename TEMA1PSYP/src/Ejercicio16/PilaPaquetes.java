package Ejercicio16;

public class PilaPaquetes {
	final static int paquetesTotales=2000;
	
	int paquetesRepartidos;
	
	public PilaPaquetes() {
		paquetesRepartidos=paquetesTotales;
	}
	
	public int getPaquetesRepartidos() {
		return paquetesRepartidos;
	}
	public void setPaquetesRepartidos(int paquetesRepartidos) {
		this.paquetesRepartidos = paquetesRepartidos;
	}
	public synchronized boolean repartir(){
		if (paquetesRepartidos>0) {
			paquetesRepartidos--;
			return true;
		}else{
			return false;
		}
	}
	
	

}
