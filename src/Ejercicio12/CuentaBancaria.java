package Ejercicio12;

public class CuentaBancaria {
	int saldoActual;
	
	public CuentaBancaria() {
		saldoActual=1000;
	}
	public synchronized void sacarDinero(){
		saldoActual--;
	}
	public synchronized  void meterDinero(){
		saldoActual++;
	}
	public int obtenerSaldo(){
		return saldoActual;
	}
	
}
