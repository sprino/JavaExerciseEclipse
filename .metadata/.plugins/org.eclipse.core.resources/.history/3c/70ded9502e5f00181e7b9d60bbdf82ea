/*Ordinamento Select Sort.*/

/*Indico il nome del package dell' esercizio.*/


/*Importo la classe Scanner.*/
import java.util.Scanner;

/*Creo Classe pubblica*/
public class OrdinamentoSsort {
	/* Dichiaro il metodo main, entry point del programma. */
	public static void main(String[] args) {
		/* Istanzio la classe scanner. */
		Scanner insert_value = new Scanner(System.in);

		/* Dichiaro variabili., sinistra e destra del vettore di array. */
		int posMin = 0;
		/* Definisco variabile dimensione dell'array e variabile d'appoggio. */
		int dimension = 0;
		int temp = 0;

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

		/* Fino a quando i è minore della dimensione dell'array esegue il ciclo */
		for (int i = 0; i < dimension - 1; i++) {
			/* posMin riceve il punto di partenza del controllo. */
			posMin = i;

			/*
			 * Ciclo che effettua l'ordinamento. j parte da i+1 fino a quando è minore
			 * della dimensione (dimensione + 1 = dimension)
			 */
			for (int j = (i + 1); j < dimension; j++) {
				/*
				 * Se il numero successivo è minore di quell oin posizione minima, assegna la
				 * nuova posizione minima.
				 */
				if (numeri[j] < numeri[posMin]) {
					posMin = j;
				}
			}

			/*
			 * Se posizione minima è diversa da i, cioè se non sono arrivato alla fine,
			 * allora fai l'inversione.
			 */
			if (posMin != i) {
				temp = numeri[i];
				numeri[i] = numeri[posMin];
				numeri[posMin] = temp;
			}
		}

		/* Stampo l'array. */
		System.out.println("Stampo l'array ordinato:");

		for (int i = 0; i <= dimension - 1; i++) {
			System.out.println(numeri[i]);
		}

		/* Chiudo oggetto scanner. */
		insert_value.close();
	}
}