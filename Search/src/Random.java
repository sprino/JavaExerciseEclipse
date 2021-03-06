/*Indico dove si trova la classe.*/


/*Importo la classe scanner.*/
import java.util.Scanner;

/*Creo classe scanner pubblica*/
/** Classe che genera un numero casuale e chiede all'utente di indovinarlo. */
public class Random {
	/* Dichiaro metodo main. */
	public static void main(String[] args) {
		/* Creo oggetto scanner. */
		Scanner insert = new Scanner(System.in);

		/*
		 * Inizializzo le variabili number e myNumber a valori differenti altrimenti con
		 * il while non esegue nemmeno un ciclo, simulo il do while.
		 */
		int number = 0;
		int myNumber = -1;

		/*
		 * Genero numero casuale compreso tra zero e 10 di tipo intero (casting perchè
		 * il metodo random() genera double).
		 */
		number = (int) (Math.random() * 10);

		/*
		 * Fino a quando il numero e' diverso da myNumber chiede di inserire un valore.
		 */
		while (number != myNumber) {
			/* Chiedo numero da confrontare con quello casuale */
			System.out.println("Indovina il numero con il while...inserisci un numero intero compreso tra 0 e 10.");
			myNumber = insert.nextInt();
		}

		/* Stampo il numero indovinato. */
		System.out.println("Numero indovinato:\n" + number);

		/*
		 * Inizializzo le variabili entrambe a zero perchè uso il do while, quindi
		 * esegue almeno una volta.
		 */
		number = 0;
		myNumber = 0;

		/*
		 * Genero numero casuale compreso tra zero e 10 di tipo intero (casting perchè
		 * il metodo random() genera double).
		 */
		number = (int) (Math.random() * 10);

		do {
			/* Chiedo numero da confrontare con quello casuale. */
			System.out.println("Indovina il numero con il do-while...Inserisci un numero intero compreso tra 0 e 10.");
			myNumber = insert.nextInt();

		} while (number != myNumber);

		System.out.println("Numero indovinato:\n" + myNumber);

		/* Chiudo oggetto scanner. */
		insert.close();
	}
}
