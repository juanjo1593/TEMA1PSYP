package Ejercicio18;

public class Token {
	boolean turnoTic;

	public Token() {
		this.turnoTic = false;

	}

	public void compruebaTurnoTIC(String nombre) {
		while (true) {
			synchronized (this) {
				if (turnoTic) {

					System.out.println(nombre);
					turnoTic = false;

				}

			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void compruebaTurnoTAC(String nombre) {
		while (true) {
			synchronized (this) {
				if (!turnoTic) {

					System.out.println("\t"+nombre);
					turnoTic = true;

				}
			}

		}

	}

}
