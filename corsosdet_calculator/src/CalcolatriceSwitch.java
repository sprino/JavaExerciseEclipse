/*Indico in quale package si trova questa classe.*/


/*importo questa classe per usare il system.read() per "premi un tasto per continuare".*/
import java.io.IOException;
/*Importo la classe Scanner.*/
import java.util.Scanner;

/**
 * Classe CalcolatriceSwitch che esegue le 4 operazioni elementari implementata
 * tramite costrutto switch case.
 */
public class CalcolatriceSwitch {
	/**
	 * Dichiaro il metodo main, entry point del programma. throws IOException è per
	 * gestire le modulo_8_eccezzioni_asserzioni, in questo caso mi serve per la
	 * scritta "Premi un tasto per continuare."
	 */
	public static void main(String[] args) throws IOException {
		/* Istanzio oggetto CalcolatriceSwitch. */
		CalcolatriceSwitch calcS = new CalcolatriceSwitch();

		/*
		 * Dichiaro la variabile selezione ed istanzio l'oggetto inserimento della
		 * classe scanner.
		 */
		String select = "";
		Scanner insert = new Scanner(System.in);

		/* Dichiaro la variabile numeri e numero di elementi. */
		double numeri[];
		int nPar = 0;

		/* Pulisco lo stream. */
		System.out.flush();

		/* Creo un ciclo while che viene eseguito fino a quando viene scritto 'exit'. */
		while (select.equals("exit") != true) {

			/* Stampo il menu. */
			System.out.print("\nMENU CALCOLATRICE DUE NUMERI:\n" + "SCRIVE exit PER USCIRE.\n\n" + "1)Somma.\n"
					+ "2)Sottrazione.\n" + "3)Prodotto.\n" + "4)Divisione.\n");

			/* Chiedo l'inserimento del tipo di Operazione da eseguire. */
			System.out.print("Scegli l'Operazione da eseguire: ");
			select = insert.next();

			/* Inizia costrutto switch, in base a select sceglie i casi. */
			switch (select) {
			case "1":

				/*
				 * Dichiaro ed inizializzo una variabile che contiene il numero di elementi che
				 * si vuole sommare.
				 */
				System.out.print("Inserisci il numero di valori che desideri sommare: ");
				nPar = insert.nextInt();

				/* Dichiaro array di nome numeri e dimensione inserita dall'utente. */
				numeri = new double[nPar];

				/* Ciclo necessario per caricare l'array. */
				for (int i = 0; i <= nPar - 1; i++) {
					System.out.print("Inserisci il valore n° " + i + " :");
					numeri[i] = insert.nextDouble();
				}

				/* Richiamo metodo somma dell'oggetto calcS e stampo il risultato. */
				System.out.println("La somma dei " + nPar + " numeri inseriti e' :" + calcS.somma(numeri));

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();

				/* Senza mettere break, esegue in sequenza tutti i case uno dietro l'altro. */
				break;

			case "2":

				/*
				 * Dichiaro ed inizializzo una variabile che contiene il numero di elementi che
				 * si vuole sommare.
				 */
				System.out.print("Inserisci il numero di valori che desideri sommare: ");
				nPar = insert.nextInt();

				/* Dichiaro array di nome numeri e dimensione inserita dall'utente. */
				numeri = new double[nPar];

				/* Ciclo necessario per caricare l'array. */
				for (int i = 0; i <= nPar - 1; i++) {
					System.out.print("Inserisci il valore n° " + i + " :");
					numeri[i] = insert.nextDouble();
				}

				/* Richiamo metodo differenza dell'oggetto calcS e stampo il risultato. */
				System.out.println("La differenza dei " + nPar + " numeri inseriti e' :" + calcS.differenza(numeri));

				/* Premi un tasto per continuare. */
				System.out.print("Premi un tasto per tornare al menu principale: ");
				System.in.read();

				break;

			case "3":

				/*
				 * Dichiaro ed inizializzo una variabile che contiene il numero di elementi che
				 * si vuole sommare.
				 */
				System.out.println("Inserisci il numero di valori dei quali vuoi fare il prodotto. \n");
				nPar = insert.nextInt();

				/* Dichiaro array di nome numeri e dimensione inserita dall'utente. */
				numeri = new double[nPar];

				/* Ciclo necessario per caricare l'array. */
				for (int i = 0; i <= nPar - 1; i++) {
					System.out.print("Inserisci il valore n° " + i + " :");
					numeri[i] = insert.nextDouble();
				}

				/* Richiamo metodo prodotto dell'oggetto calcS e stampo il risultato. */
				System.out.println("Il prodotto dei " + nPar + " numeri inseriti e' :" + calcS.prodotto(numeri));

				// Premi un tasto per continuare.
				System.out.print("Premi un tasto per tornare al menu principale: ");
				System.in.read();

				break;

			case "4":

				/*
				 * Dichiaro ed inizializzo una variabile che contiene il numero di elementi che
				 * si vuole sommare.
				 */
				System.out.println("Inserisci il numero di valori che desideri sommare. \n");
				nPar = insert.nextInt();

				/* Dichiaro array di nome numeri e dimensione inserita dall'utente. */
				numeri = new double[nPar];

				/* Ciclo necessario per caricare l'array. */
				for (int i = 0; i <= nPar - 1; i++) {
					System.out.print("Inserisci il valore n° " + i + " :");
					numeri[i] = insert.nextDouble();
				}

				/* Richiamo metodo divisione dell'oggetto calcS e stampo il risultato. */
				System.out.println("La divisione dei " + nPar + " numeri inseriti e' :" + calcS.divisione(numeri));

				/* Premi un tasto per continuare. */
				System.out.print("Premi un tasto per tornare al menu principale: ");
				System.in.read();

				break;

			default:
				/*
				 * Costrutto che controlla se la scelta inserita e' diversa da un numero del
				 * menu' e se è diverso da exit stampa scelta non consentita.
				 */
				if (!select.equals("exit")) {
					System.out.println("Scelta non consentita...premi un tasto per tornare al menu principale...");
					System.in.read();
				}
			}

		}
		/* Esco dal while perchè ho premuto exit */
		System.out.println("Bye Bye...");

		/* Chiudo l'oggetto insert della classe Scanner. */
		insert.close();
	}

	/* Dichiaro metodi che eseguono le operazioni. */
	/** Metodo che fa la somma dei numeri inseriti. */
	public double somma(double... numeri) {
		double result = 0;

		for (double numero : numeri) {
			result += numero;
		}

		return result;
	}

	/** Metodo che fa la differenza dei numeri inseriti. */
	public double differenza(double... numeri) {
		double result = numeri[0];

		for (int i = 1; i < numeri.length; i++) {
			result -= numeri[i];
		}

		return result;
	}

	/** Metodo che fa il prodotto dei numeri inseriti. */
	public double prodotto(double... numeri) {
		double result = numeri[0];

		for (int i = 1; i < numeri.length; i++) {
			result *= numeri[i];
		}

		return result;
	}

	/** Metodo che fa la divisione dei numeri inseriti. */
	public double divisione(double... numeri) {
		double result = numeri[0];

		for (int i = 1; i < numeri.length; i++) {
			result /= numeri[i];
		}

		return result;
	}
}