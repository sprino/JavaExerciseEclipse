package correzione_test_basile_vincenzo;

public class Algoritmo2 {

	public static void main(String[] args) {

		int[] interi = new int[5];
		int numero, s = 0; // Variabili non inizializzate.

		for (int j = 0; j < interi.length; j++) {
			numero = ((int) (Math.random() * 10));
			s = s + numero;
		}

		System.out.println("La media e' : " + s / interi.length);
	}
}
