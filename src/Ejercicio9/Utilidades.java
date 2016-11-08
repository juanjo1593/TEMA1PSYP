package Ejercicio9;

import java.util.Scanner;

public class Utilidades {

	public static int menu(String[] menu) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;

		System.out.println("------------------------------");
		for (int i = 0; i < menu.length; i++) {
			System.out.println("-" + i + "-" + menu[i]);
		}
		System.out.println("Introduce una opción:");
		try {
			opcion = Integer.parseInt(entrada.nextLine());
		} catch (Exception e) {
			System.out.println("Introduce de nuevo.");
			menu(menu);
		}
		return opcion;

	}

	public static int introduceNumero() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el número del cual quieres generar la tabla.");
		return entrada.nextInt();
	}

}
