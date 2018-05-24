/* Indico il package della classe. */


/*Importo la libreria per usare la classe Scanner.*/
import java.util.Scanner;

/*Definisco la classe StringControlLenghtWhile.*/
/** Classe che individua la lunghezza di una stringa tramite ciclo while. */
public class StringControlLenghtWhile {
	/* Defiisco il metodo main, entry point del programma. */
	public static void main(String[] args) {
		/*
		 * Istanzio un oggetto della classe scanner per chiedere all'utente
		 * l'inserimento della stringa.
		 */
		System.out.println("Inserisci parola di test, verranno contati i caratteri con un ciclo while: ");
		Scanner insert_value = new Scanner(System.in);

		/*
		 * Definisco ed inizializzo le variabili e chiedo la stringa all'utente,
		 * inizializzo la stringa temporanea alla stringa inserita.
		 */
		int i = 0;
		String parolaTest = insert_value.next();
		String stringTemp1 = parolaTest;

		/*
		 * Inizia il ciclo che scorre la stringa e termina quando la stringa è vuota.
		 */
		while (stringTemp1.isEmpty() != true) {
			/*
			 * Carico nella stringa temporanea la substringa restante a partire dalla
			 * posizione 1, fino a quando la temporanea non si svuota.
			 */
			stringTemp1 = parolaTest.substring(i);

			/* Incremento l'indice che scorre la stringa. */
			++i;
		}

		/*
		 * Tolgo un elemento dal contatore i per ottenere il valore effettivo della
		 * lunghezza della stringa.
		 */
		i--;

		/* Stampo la lunghezza della stringa. */
		System.out.println("La lunghezza della parola è: " + i);

		/* Chiudo l'oggetto della classe Scanner. */
		insert_value.close();
	}
}
