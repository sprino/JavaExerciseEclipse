/* Indico il package in cui si trova la classe. */


/* Importo la classe bufferreader e IOexception per usare i metodi per inserire il carattere. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Classe che chiede di inserire un certo numero di stringhe, un carattere da
 * cercare e restituisce il numero di volte che quel carattere è presente.
 */
public class StringaNumeroOccorrenze {

	/*
	 * Dichiaro metodo main, entry point del programma con abilitazione alla
	 * gestione delle modulo_8_eccezzioni_asserzioni.
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * Istanzio oggetto di tipo scanner e BufferReader per inserire un singolo
		 * carattere.
		 */
		Scanner insert = new Scanner(System.in);
		BufferedReader insert_char = new BufferedReader(new InputStreamReader(System.in));

		/* Dichiaro ed inizializzo variabili necessarie. */
		int dim = 0;
		int occ = 0;
		char c = ' ';

		System.out.print("Inserisci il numero di stringhe che vuoi inserire: ");
		dim = insert.nextInt();

		/* Dichiaro array di stringhe */
		String[] stringhe = new String[dim];

		/* Inizializzo array di stringhe. */
		for (int i = 0; i <= dim - 1; i++) {
			System.out.print("Iserisci la prima stringa: ");
			stringhe[i] = insert.next();
		}

		/* Inserisci il carattere del quale vuoi conoscere le occorrenze. */
		System.out.print("Inserisci il carattere del quale vuoi conoscere le occorrenze: ");
		c = (char) insert_char.read();

		/* Assegno alla variabile dim il numero delle stringhe. */
		dim = stringhe.length;

		/* Il primo for salva la stringa i-esima nella variabile temp. */
		for (int i = 0; i <= dim - 1; i++) {
			String temp = stringhe[i];

			/*
			 * Questo ciclo for confronta tutti i caratteri della stringa con quello
			 * inserito dall'utente.
			 */
			for (int j = 0; j < temp.length(); j++) {
				/* se il carattere e' uguale a quello inserito incrementa la variabile occ. */
				if (temp.charAt(j) == c) {
					occ += 1;
				}
			}
		}

		/* Stampa il numero delle occorrenze. */
		System.out.println("Il numero delle occorrenze di " + c + " e': " + occ);

		/* Chiudo l'oggetto Scanner. */
		insert.close();
	}
}
