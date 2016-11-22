package Ejercicio27Modificacion;

public class Puente {
	int numBarcos;
	int numPeatones;
	boolean entra;
	
	public Puente() {
		this.numPeatones=0;
		this.numBarcos=0;
		
		this.entra=false;
	}

	public void pasaBarco(String nombre) {
		
		synchronized (this) {
			System.out.println("--------EL BARCO QUIERE CRUZAR-----------");
			entra=true;
			while (numPeatones>0) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			numBarcos++;
			System.out.println("\nPASA EL BARCO\n");
		}
		System.out.println(nombre+" está en el puente.");
		
		synchronized (this) {
			numBarcos--;
			if (numBarcos==0) {
				entra= false;
			}
			
			System.out.println(nombre+" sale del puente.");
			notifyAll();
		}
		
		
		
	}

	public void pasaPeaton(String nombre) {
		synchronized (this) {
			while (entra) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			numPeatones++;
			System.out.println("\nEntra "+nombre+" en el puente. Hay "+numPeatones);
		}
		System.out.println(nombre+" está en el puente.");
		
		synchronized (this) {
			numPeatones--;
			System.out.println("Sale "+nombre+" del puente. Hay "+numPeatones);
			notifyAll();
		}
		
	}
	

}
