package Ejercicio26;

public class Controlador {
	int numLectores;
	boolean hayEscritores;
	String recurso;

	public Controlador() {
		recurso = "VACÍO";
		numLectores = 0;
		hayEscritores = false;
	}

	public synchronized void entraLector() {

		while (hayEscritores) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		numLectores++;

	}

	public synchronized void saleLector() {
		numLectores--;
		System.out.println(numLectores);
		notifyAll();

	}

	public synchronized void entraEscritor() {

		while (numLectores > 0 || hayEscritores) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		hayEscritores = true;

	}

	public synchronized void saleEscritor() {

		hayEscritores = false;
		notifyAll();

	}

	public void actualLector(String nombreLector, int numIteracion) {
		System.out.println(nombreLector + "--" + numIteracion + "--->" + recurso);
	}

	public void actualEscritor(String nombreEscritor, int numIteracion) {
		recurso = nombreEscritor + "--" + numIteracion;
		System.out.println(recurso);
	}

}
