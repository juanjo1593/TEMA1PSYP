package Ejercicio11;

public class Suma extends Thread{
	int i;
	int j;
	
	public Suma(int i,int j){
		i=i;
		j=j;
	}

	@Override
	public void run() {
	
		try {
			sleep(1);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Principal.matrizResultado[i][j] = Principal.matriz1[i][j]+Principal.matriz2[i][j];
	}
	

}
