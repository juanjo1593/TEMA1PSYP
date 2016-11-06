package Ejercicio7;

public class Hilo<T> extends Thread{
	T atri;
	
	public Hilo (T atri){
		this.atri=atri;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			System.out.println((i+1)+"-"+atri+" -Id: "+getId()+" -Prioridad: "+getPriority()+" -Nombre: "+getName());
			
			
		}
		
	}

}

