

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, ParseException {

		final int NUMERO_PRODOTTI = 1000;

		Alimenti alimentare[] = new Alimenti[NUMERO_PRODOTTI];
		NonAlimenti nonAlimentare[] = new NonAlimenti[NUMERO_PRODOTTI];

		Scanner insert = new Scanner(System.in);
		String select = "";
		String dataScadenzaS = "";
		java.util.Date dataScadenza = null;
		int prodottoAlim = 0;
		int prodottoNonAlim = 0;

		for (int i = 0; i <= NUMERO_PRODOTTI - 1; i++) {
			alimentare[i] = new Alimenti("", "", 0, null);
			nonAlimentare[i] = new NonAlimenti("", "", 0, "");
		}

		while (select.equals("exit") != true) {
			System.out.println("MENU CARICAMENTO PRODOTTI NEGOZIO:\n" + "scrivi exit per uscire...\n\n"
					+ "1)Carica dati prodotto alimentare.\n" + "2)Carica dati prodotto non alimentare\n"
					+ "3)Applica sconto.\n" + "4)Inserisci nuovo prodotto alimentare.\n");

			select = insert.next();

			switch (select) {
			case "1":

				System.out.print("Inserisci codice a barre del prodotto : ");
				alimentare[prodottoAlim].setCodiceBarre(insert.next());

				System.out.print("Inserisci la descrizione del prodotto : ");
				alimentare[prodottoAlim].setDescrizione(insert.next());

				System.out.print("Inserisci il prezzo : ");
				alimentare[prodottoAlim].setPrezzo(insert.nextDouble());

				// Inserisco la data di scadenza di tipo stringa.
				System.out.print("Inserisci la data di scadenza nel formato gg/mm/yyyy : ");
				dataScadenzaS = insert.next();

				// Istanzio oggetto della classe DateFormat per avere il formato SHORT e
				// Italiano.
				DateFormat dataScadenzaFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
				// Specificare se l'analisi della data / ora fatta dal parser debba essere lenta
				// o meno.
				dataScadenzaFormat.setLenient(false);
				// Analizzo il testo per produrre una data.
				dataScadenza = dataScadenzaFormat.parse(dataScadenzaS);

				alimentare[prodottoAlim].setDataScadenza(dataScadenza);

				System.out.println("premi un tasto per tornare al menu principale...");
				System.in.read();

				break;

			case "2":

				System.out.print("Inserisci codice a barre del prodotto : ");
				nonAlimentare[prodottoNonAlim].setCodiceBarre(insert.next());
				System.out.print("Inserisci la descrizione del prodotto : ");
				nonAlimentare[prodottoNonAlim].setDescrizione(insert.next());
				System.out.print("Inserisci il prezzo : ");
				nonAlimentare[prodottoNonAlim].setPrezzo(insert.nextDouble());
				System.out.print("Inserisci il tipo di materiale:");
				nonAlimentare[prodottoNonAlim].setMateriale(insert.next());

				System.out.println("premi un tasto per tornare al menu principale...");
				System.in.read();

				break;

			case "3":

				System.out.println("Veccio prezzo prodotto alimentare: " + alimentare[prodottoAlim].getPrezzo());
				System.out.println("Il prezzo scontato e': " + alimentare[prodottoAlim].getApplicaSconto());
				System.out.println("\n");
				System.out.println(
						"Veccio prezzo prodotto non alimentare: " + nonAlimentare[prodottoNonAlim].getPrezzo());
				System.out.println("Il prezzo scontato e': " + nonAlimentare[prodottoNonAlim].getApplicaSconto());

				System.out.println("premi un tasto per tornare al menu principale...");
				System.in.read();

				break;

			case "4":

				prodottoAlim++;
				prodottoNonAlim++;

				break;

			default:
				if (!select.equals("exit")) {
					System.out.println("Scelta non consentita...premi un tasto per tornare al menu principale...");
					System.in.read();
				}

				break;
			}
		}
		insert.close();
	}
}
