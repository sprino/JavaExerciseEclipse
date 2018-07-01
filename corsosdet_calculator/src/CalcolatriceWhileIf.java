/*Indico in quale package si trova questa classe.*/


/*importo questa classe per usare il system.read() per "premi 
un tasto per continuare".*/
import java.io.IOException;
/*Importo la classe Scanner.*/
import java.util.Scanner;

/**
 * Classe CalcolatriceSwitch che esegue le 4 operazioni elementari implementata
 * tramite costrutto if e ciclo while.
 */
public class CalcolatriceWhileIf {
	/**
	 * Dichiaro il metodo main, entry point del programma. throws IOException è per
	 * gestire le modulo_8_eccezzioni_asserzioni, in questo caso mi serve per la
	 * scritta "Premi un tasto per continuare."
	 */
	public static void main(String[] args) throws IOException {
		/* Dichiaro ed inizializzo stringa select e creo oggetto classe scanner. */
		String select = "";
		Scanner insert = new Scanner(System.in);

		/* Pulisco lo stream. */
		System.out.flush();

		/*
		 * Creo un ciclo while che viene eseguito fino a quando non viene premuto il
		 * tasto 5.
		 */
		while (select.equals("5") != true) {
			/* Stampo il menu. */
			System.out.println("MENU CALCOLATRICE DUE NUMERI:\n" + "PREMI 5 PER USCIRE.\n\n" + "1)Somma.\n"
					+ "2)Sottrazione.\n" + "3)Prodotto.\n" + "4)Divisione.\n");

			/* Chiedo l'inserimento del tipo di Operazione. */
			System.out.print("Scegli l'Operazione da eseguire: ");
			select = insert.next();

			/* if che vengono attivati se viene selezionato il numero corrispondente. */
			if (select.equals("1")) {
				/* Chiedo l'inserimento dei due numeri di tipo booleano. */
				System.out.println("Inserisci il primo numero: ");
				double num1 = insert.nextInt();
				System.out.println("Inserisci il secondo numero: ");
				double num2 = insert.nextInt();

				/* Stampo il risultato. */
				System.out.println("La somma dei due numeri è: " + (num1 + num2));

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale.");
				System.in.read();
			} else if (select.equals("2")) {
				/* Chiedo l'inserimento dei due numeri di tipo booleano. */
				System.out.println("Inserisci il primo numero:");
				double num1 = insert.nextInt();
				System.out.println("Inserisci il secondo numero:");
				double num2 = insert.nextInt();

				/* Stampo il risultato. */
				System.out.println("La differenza tra il primo numero ed il secondo �:\n" + (num1 - num2));

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();
			} else if (select.equals("3")) {
				/* Chiedo l'inserimento dei due numeri di tipo booleano. */
				System.out.println("Inserisci il primo numero:");
				double num1 = insert.nextInt();
				System.out.println("Inserisci il secondo numero:");
				double num2 = insert.nextInt();

				/* Stampo il risultato. */
				System.out.println("Il prodotto tra i due numeri �:\n" + (num1 * num2));

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();
			} else if (select.equals("4")) {
				/* Chiedo l'inserimento dei due numeri di tipo booleano. */
				System.out.println("Inserisci il primo numero:");
				double num1 = insert.nextInt();
				System.out.println("Inserisci il secondo numero:");
				double num2 = insert.nextInt();

				/* Stampo il risultato. */
				System.out.println("La divisione tra i due numeri �:\n" + (num1 / num2));

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();
			} else if (select.equals("5"))
				System.out.println("ByeBye...\n");
			else
				System.out.println("Scelta non consentita, premi un tasto per tornare al menu principale.");
			System.in.read();
		}

		// Chiudo l'oggetto insert della classe Scanner.
		insert.close();
	}
}
