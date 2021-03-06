/*Ordinamento Bubble Sort.*/

/*Indico il nome del package dell' esercizio.*/


/*Importo la classe Scanner.*/
import java.util.Scanner;

/*Creo Classe pubblica*/
/** Classe ordinamento usando l'algoritmo Bubble Sort. */
public class OrdinamentoBsort {
	/* Dichiaro il metodo main, entry point del programma. */
	public static void main(String[] args) {
		/* Istanzio la classe scanner. */
		Scanner insert_value = new Scanner(System.in);

		/*
		 * Dichiaro variabili., sinistra e destra del vettore di array. Definisco
		 * variabile dimensione dell'array e variabile d'appoggio.
		 */
		int left = 0;
		int dimension = 0;
		int temp = 0;

		/* Flag che indica quando viene effettuato un ordinamento. */
		boolean flag = true;

		/*
		 * Dichiaro ed inizializzo una variabile che contiene il numero di elementi che
		 * si vuole ordinare.
		 */
		System.out.println("Inserisci il numero di valori che desideri ordinare. \n");
		int nPar = insert_value.nextInt();

		/* Dichiaro array di nome numeri e dimensione inserita dall'utente. */
		int numeri[];
		numeri = new int[nPar];

		/* Ciclo necessario per caricare l'array. */
		for (int i = 0; i <= nPar - 1; i++) {
			System.out.println("Inserisci il valore n° " + i + " :");
			numeri[i] = insert_value.nextInt();
		}

		/* Ricavo dimensione dell'array. */
		dimension = numeri.length;

		/* Fin tanto che il flag e' vero esegui questo ciclo. */
		while (flag == true) {
			/* Re-inizializzo ad ogni ciclo variabile a zero e flag a false. */
			left = 0;
			flag = false;

			/* Ciclo che effettua l'ordinamento. */
			for (int i = 0; i < dimension - 1; i++) {
				/* Se il numero precedente e' maggiore del successivo inverti. */
				if (numeri[left] > numeri[left + 1]) {
					temp = numeri[left];
					numeri[left] = numeri[left + 1];
					numeri[left + 1] = temp;

					/* Basta che ci sia una sola inversione allora il flag viene messo a true. */
					flag = true;
				}

				/* Incrementa indice sinistra */
				left += 1;

			}
		}

		/* Stampo array ordinato */
		System.out.println("Stampo l'array ordinato:");
		for (int i = 0; i <= dimension - 1; i++) {
			System.out.println(numeri[i]);
		}

		/* Chiudo oggetto scanner. */
		insert_value.close();
	}
}