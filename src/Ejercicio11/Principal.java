package Ejercicio11;

import java.util.ArrayList;

public class Principal {
	public static int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	public static int[][] matriz2 = { { 4, 2, 1 }, { 9, 8, 1 }, { 1, 1, 0 } };
	public static int[][] matrizResultado = new int[3][3];

	public static void main(String[] args) throws InterruptedException {
		//ArrayList<Suma> hilos=new ArrayList<Suma>();
		Thread[][] hilos= new Thread[3][3];

		for (int i = 0; i < matrizResultado.length; i++) {
			for (int j = 0; j < matrizResultado[i].length; j++) {
				Suma sum=new Suma(i, j); 
				sum.start();
				hilos[i][j]=sum;
				hilos[i][j].join();
			
				

			}
		}
		
		pintarMatriz(matrizResultado);
		
	}
	public static void pintarMatriz(int[][] matriz){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
	}

}
