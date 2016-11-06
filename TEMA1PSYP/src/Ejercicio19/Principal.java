package Ejercicio19;

public class Principal {

	public static void main(String[] args) {
		Token tok= new Token();
		TIC tic = new TIC(tok);
		TAC tac = new TAC(tok);
		tic.start();
		tac.start();

	}

}
