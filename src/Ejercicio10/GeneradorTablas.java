package Ejercicio10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import UtilidadesJava.Utilidades;

public class GeneradorTablas extends Thread {
	final static String ruta = "tablas\\";
	int numeroTabla;

	public GeneradorTablas(int num) {
		numeroTabla = num;
	}

	@Override
	public void run() {
		try {
			FileWriter fw = new FileWriter(ruta + numeroTabla);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("-------------Tabla del " + numeroTabla + "---------");
			for (int i = 0; i < 11; i++) {
				pw.println(numeroTabla + "*" + i + "= " + numeroTabla * i);

			}
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		System.out.println("Fichero generado de la tabla " + numeroTabla);
	
	}

}
