package Ejercicio10;

public class Tablas {

	int inicio;

	int fin;

	public void gestionarTablas() {
		String[] menu = { "Generar tabla.", "Rango de números", "Salir" };
		int opcion;
		GeneradorTablas gt;
		
		do {

			switch (opcion = Utilidades.menu(menu)) {
			case 0:

				gt = new GeneradorTablas(Utilidades.introduceNumero());
				gt.start();

				break;
			case 1: {
				inicio = Utilidades.introducePrimerNumero();
				fin = Utilidades.introduceSegundoNumero();
				for (int i = inicio; i < (fin + 1); i++) {
					 gt = new GeneradorTablas(i);
					gt.start();
				}

			}
				break;
			case 2:
				System.out.println("Adios");
				break;

			default:
				System.out.println("Opción incorrecta.");
				break;
			}
		} while (opcion != 2);
	}

}
