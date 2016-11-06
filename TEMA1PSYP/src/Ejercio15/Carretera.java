package Ejercio15;

public class Carretera {
	int recorrido ;
	int km;
	
	public Carretera() {
		recorrido=12;
	}
	
	public boolean puedePasar(){
		if (recorrido>0) {
			return true;
		}
		return false;
	}
	
	public void recorreCarretera(String nombre){
		System.out.println("El coche "+nombre+" inicia su recorrido.");
		for (int i = 0; i < 12; i++) {
			if (i<10 && i>4) {
				synchronized (this) {
					
					recorrido--;
					
				}
				
			}else{
				recorrido--;
			}
			
			km++;
			System.out.println(nombre+" kilometro -->"+km+"km");
			
			
		}
			
			
			
	
		
		
		
	}
	

	

}
