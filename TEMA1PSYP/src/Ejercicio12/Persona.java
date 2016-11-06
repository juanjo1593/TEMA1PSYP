package Ejercicio12;

public class Persona extends Thread{
	CuentaBancaria cuenta;
	public Persona(CuentaBancaria cu) {
		cuenta=cu;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			cuenta.sacarDinero();
			cuenta.meterDinero(); 
		}
		
	
	}
	
}
