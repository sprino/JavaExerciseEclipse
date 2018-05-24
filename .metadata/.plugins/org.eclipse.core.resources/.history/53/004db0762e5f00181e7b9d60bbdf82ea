/*Indico dove si rtova la classe.*/



/*Importo la classe Scanner.*/
import java.util.Scanner;

/*Creo Classe pubblica*/
/** Classe che ricerca il numero minimo di un array di interi. */
public class RicercaNumMin {
	/* Dichiaro il metodo main, entry point del programma. */
	public static void main(String[] args) {
		/* Istanzio la classe scanner. */
		Scanner insert_value = new Scanner(System.in);

		int dimension = 0;
		int temp = 0;

		/* Dichiaro ed inizializzo una variabile che contiene il numero di elementi. */
		System.out.print("Inserisci il numero di valori che desideri inserire: ");
		int nPar = insert_value.nextInt();

		/* Dichiaro array di nome numeri e dimensione inserita dall'utente. */
		int numeri[];
		numeri = new int[nPar];
		dimension = numeri.length;

		/* Ciclo necessario per caricare l'array. */
		for (int i = 0; i <= nPar - 1; i++) {
			System.out.print("Inserisci il valore n_" + i + " :");
			numeri[i] = insert_value.nextInt();

			/*
			 * Verifica se il numero i-esimo e' minore del numero in posizione zero, se e'
			 * vero scambia di posizione.! a fine ciclo il minore si trova sempre in
			 * posizione zero.
			 */
			if (numeri[i] < numeri[0]) {
				temp = numeri[i];
				numeri[i] = numeri[0];
				numeri[0] = temp;
			}
		}

		/* Ciclo for che scorre l'array per trovare il massimo. */
		for (int i = (dimension - 1); i != 0; i--) {
			/*
			 * Se il numero in posizione i-esima partendo dalla penultima e' maggiore del
			 * numero in posizione fianle scambia di posto. a fine ciclo il massimo si trova
			 * sempre in posizione finale.
			 */
			if (numeri[i - 1] > numeri[dimension - 1]) {
				temp = numeri[i - 1];
				numeri[i - 1] = numeri[dimension - 1];
				numeri[dimension - 1] = temp;
			}
		}

		/*
		 * Stampa il valore in posizione zero il quale e' sicuramente il minore perche'
		 * posizionato nel ciclo precedente. Stampa il maggiore che si trova sicuramente
		 * in posizione finale.
		 */
		System.out.print("Il numero minore e' : " + numeri[0] + "\n");
		System.out.print("Il numero maggiore e': " + numeri[(dimension - 1)]);

		/* Chiudo oggetto scanner. */
		insert_value.close();
	}
}