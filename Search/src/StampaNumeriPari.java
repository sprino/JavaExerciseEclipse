/* Indico dove si trova la classe. */


/*Importo la classe scanner.*/
import java.util.Scanner;

/*Creo classe pubblica*/
/**
 * Creo la classe che data una stringa in ingresso stampa solo i numeri pari.
 */
public class StampaNumeriPari {
	/* Creo metodo main, entry point del programma. */
	public static void main(String[] args) {
		/* Dichiaro variabile che contiene il numero di pari. */
		int numberP = 0;

		/* Istanzio oggetto scanner. */
		Scanner insert = new Scanner(System.in);

		/* Chiedo all'utente di iserire il valore finale dell'intervallo. */
		System.out.println("Inserisci il numero del quale vuoi contare i numeri pari.");
		int number = insert.nextInt();

		/* Stampo il range entro il quale individuare i numeri pari. */
		System.out.println("Il range dei numeri del quale vuoi contare i positivi va da 0 a " + number);

		/* Per temp <= number esegui il ciclo */
		for (int temp = 0; temp <= number; temp++) {
			/*
			 * Se la divisione tra il numero e due è zero riprendi il ciclo, altrimenti
			 * incrementa numberP.
			 */
			if (temp % 2 != 0) {
				/* Non eseguire numberP++ e riprendi il ciclo. */
				continue;
			}
			numberP++;
		}

		/* Stampo il numero di valori pari. */
		System.out.println("Il numero dei valori pari è: " + numberP);

		/* Chiudo oggetto scanner. */
		insert.close();
	}
}
