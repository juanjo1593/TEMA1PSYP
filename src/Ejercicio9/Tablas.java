package Ejercicio9;

public class Tablas{

	

	public void gestionarTablas() {
		String [] menu={"Generar tabla.","Salir"};
		int opcion;
		do {
			
	
		switch (opcion=Utilidades.menu(menu)) {
		case 0:
			GeneradorTablas gt = new GeneradorTablas(Utilidades.introduceNumero());
			gt.start();
			
			break;
		case 1:
			System.out.println("Adios");
			break;
		default:
			System.out.println("Opción incorrecta.");
			break;
		}
		} while (opcion!=1);
	}
	
	

}
