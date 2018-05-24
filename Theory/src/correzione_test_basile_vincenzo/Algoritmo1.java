package correzione_test_basile_vincenzo;

public class Algoritmo1 {

	public static void main(String[] args) {

		String parola = "radar"; // parola se e' di tipo char, il metodo charAt non e' applicabile
		int i = 0;
		boolean palindroma = true;

		while (i <= (parola.length()) / 2) {
			if (parola.charAt(i) != parola.charAt(parola.length() - i - 1)) {
				palindroma = false;
			}
			i = i + 1;
		}

		if (palindroma) {
			System.out.println("Parola palindroma.");
		} else {
			System.out.println("Parola non palindroma.");
		}

	}

}
