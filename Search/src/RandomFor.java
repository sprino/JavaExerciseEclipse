/* Indico in quale package si trova la classe. */


/*Importo la classe scanner.*/
import java.util.Scanner;

/*Creo classe scanner pubblica*/
public class RandomFor {
	/* Dichiaro metodo main. */
	public static void main(String[] args) {
		/* Creo oggetto scanner. */
		Scanner insert = new Scanner(System.in);

		/* Inizializzo le variabili number e myNumber. */
		int number = 0;
		int myNumber = -1;

		/*
		 * Genero numero casuale compreso tra zero e 10 di tipo intero (casting perchè
		 * il metodo random() genera double).
		 */
		number = (int) (Math.random() * 10);

		/* Ciclo for che esce solo quando la condizione è verificata. */
		for (; number != myNumber;) {
			/* Chiedo numero da confrontare con quello casuale. */
			System.out.println("Esempio for infinito...Inserisci un numero intero compreso tra 0 e 10.");
			myNumber = insert.nextInt();
		}

		/*
		 * Genero numero casuale compreso tra zero e 10 di tipo intero (casting perchè
		 * il metodo random() genera double).
		 */
		number = (int) (Math.random() * 10);

		/* Ciclo for, fa solo cinque tentativi. */
		for (int tentativi = 5; tentativi != 0; tentativi--) {
			/* Chiedo numero da confrontare con quello casuale. */
			System.out.println("Tentativo numero " + tentativi + "...Inserisci un numero intero compreso tra 0 e 10.");
			myNumber = insert.nextInt();

			if (number == myNumber) {
				System.out.println("Numero indovinato: " + myNumber);
				break;
			} else if (number <= 3)
				System.out.println("Ritenta...\n");
		}
		System.out.println("Hai terminato il numero di tentativi...ByeBye...\n");

		/* Chiudo oggetto scanner. */
		insert.close();
	}
}