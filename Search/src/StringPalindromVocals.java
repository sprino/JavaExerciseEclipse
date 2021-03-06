/* Indico il package della classe. */


/*Importo la libreria per usare la classe Scanner.*/
import java.util.Scanner;

/*Dichiaro classe pubblica di nome StringPalindromVocals.*/
/**
 * Classe che, data una stringa, individua se questa è palindroma e conta il
 * numero di vocali.
 */
public class StringPalindromVocals {
	/* Defiisco il metodo main, entry point del programma. */
	public static void main(String[] args) {

		/*
		 * Istanzio un oggetto della classe scanner per ricevere in ingresso dall'utente
		 * la stringa su cui lavorare.
		 */
		System.out.println("Inserisci parola per controllare se è palindroma e per contare il numero di vocali: ");
		Scanner insert_value = new Scanner(System.in);

		/* Definisco ed inizializzo le variabili, tra cui le temporanee. */
		String parolaTest = insert_value.next();
		String stringTemp1 = "";
		String stringTemp2 = "";

		/*
		 * Definisco la variabile che contiene le lunghezza della stringa -1 perchè
		 * parte da zero.
		 */
		int parolaTestLeng = parolaTest.length() - 1;
		int vocalLeng = 0;

		/*
		 * Rendo tutti i caratteri minuscoli per evitare di mettere nell'if anche le
		 * vocali maiuscole.
		 */
		stringTemp2 = parolaTest.toLowerCase();

		/*
		 * Inizia il ciclo che scansiona la stringa fino a quando la lunghezza della
		 * stringa è diversa di -1.
		 */
		while (parolaTestLeng != -1) {
			/*
			 * Inserisco nella prima posizione dell stringa temporanea il carattere nella
			 * posizione finale della stringa.
			 */
			stringTemp1 = stringTemp1 + parolaTest.charAt(parolaTestLeng);

			/*
			 * Se il carattere inserisci è uguale ad una delle vocali (fà un OR=||)
			 * incrementa il contatore di lunghezza delle vocali.
			 */
			if (stringTemp2.charAt(parolaTestLeng) == 'a' || stringTemp2.charAt(parolaTestLeng) == 'e'
					|| stringTemp2.charAt(parolaTestLeng) == 'i' || stringTemp2.charAt(parolaTestLeng) == 'o'
					|| stringTemp2.charAt(parolaTestLeng) == 'u') {
				/* Incremento il contatore di lunghezza delle vocali. */
				vocalLeng++;
			}

			/*
			 * Decremento l'indice che scorre la stringa inizialmente pari alla lunghezza
			 * della stringa (meno 1 perchè parte da zero).
			 */
			parolaTestLeng--;
		}

		/* Stampo la parola di test e la sua invertita. */
		System.out.println("StringEcho inserita:" + parolaTest);
		System.out.println("StringEcho invertita:" + stringTemp1);

		/*
		 * Se la stringa inserita è uguale alla sua invertita allora la stringa è
		 * palindroma, altrimenti la stringa non è palindroma.
		 */
		if (parolaTest.equals(stringTemp1)) {
			System.out.println("La stringa è palindroma.");
		} else {
			System.out.println("La stringa non è palindroma.");
		}

		/* Stampo la lunghezza delle vocali. */
		System.out.println("Il numero di vocali è: " + vocalLeng);

		/* Chiudo l'oggetto insert_value; */
		insert_value.close();
	}
}
