package Ejercicio21;

public class Principal {

	public static void main(String[] args) {
		Control ctrl= new Control();
		
		A a= new A(ctrl);
		B b= new B(ctrl);
		a.start();
		b.start();
		
		

	}

}
