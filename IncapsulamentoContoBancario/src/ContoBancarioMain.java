

import java.util.Scanner;

public class ContoBancarioMain {
	public static void main(String[] args) {
		/* Istanzio oggetti e variabili. */
		Scanner insert = new Scanner(System.in);
		ContoBancario conto_1 = new ContoBancario();
		String scelta = "";

		while (true) {
			/* Pulisco lo stream. */
			System.out.flush();

			/* Chiedo di inserire il codice. */
			System.out.print("Inserisci il codice del tuo condo bancario: ");
			conto_1.setCodiceInserito(insert.nextInt());

			/*
			 * Richiamo il metodo getContoBancario che in base al codice accede oppure no al
			 * saldo.
			 */
			System.out.println(conto_1.getContoBancario());

			/* Chiedo all'utente di continuare oppure uscire. */
			System.out.println("Scrivi exit per uscire oppure continue per continuare.");
			scelta = insert.next();
			if (scelta.equals("continue") == true) {
				continue;
			} else if (scelta.equals("exit") == true) {
				break;
			}
		}
		insert.close();
	}
}
