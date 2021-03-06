/*Indico il punto in cui si trova la classe.*/


/*Importo la classe per usare il metodo scanner.*/
import java.util.Scanner;

/*Dichiaro una classe pubblica di nome StringheControlLenghtIf.*/
/** Classe stringa che individua la lunghezza di una stringa costrutto if. */
public class StringheControlLenghtIf {

	/* Dichiaro il metodo main, Entry point del programma. */
	public static void main(String[] args) {
		/* Creo oggetto di tipo Scanner per ricevere dati dallo stream. */
		Scanner insert_value = new Scanner(System.in);

		/* Chiedo di inserire le parole. */
		System.out.println("Date tre parole identifico la piu' lunga e quelle con stessa lunghezza.\n ");
		System.out.print("Inserisci la prima stringa di caratteri: ");
		String str1 = insert_value.next();
		System.out.print("Inserisci la seconda stringa di caratteri: ");
		String str2 = insert_value.next();
		System.out.print("Inserisci la terza stringa di caratteri: ");
		String str3 = insert_value.next();

		/*
		 * Dichiaro ed inizializzo variabili al valore della lunghezza delle stringhe.
		 */
		int strl1 = str1.length();
		int strl2 = str2.length();
		int strl3 = str3.length();

		/* Verifico uguaglianza. */
		if (strl1 == strl2 & strl2 == strl3 & strl1 == strl3) {
			System.out.println("Le stringhe hanno la stessa lunghezza.");
		} else if (strl1 == strl2 || strl2 == strl3 || strl1 == strl3) {
			if (strl1 == strl2)
				System.out.println("La prima e la seconda sono uguali.");
			if (strl1 == strl3)
				System.out.println("La prima e la terza son ouguali.");
			if (strl2 == strl3)
				System.out.println("La seconda e la terza sono uguali.");
		}

		/* Verifico dimensione maggiore. */
		if (strl1 > strl2 & strl2 >= strl3)
			System.out.println("La prima e' maggiore.");
		if (strl1 <= strl2 & strl2 > strl3)
			System.out.println("La seconda e' maggiore.");
		if (strl1 < strl3 & strl2 <= strl3)
			System.out.println("La terza e' la maggiore.");

		/* Chiudo oggetto Scanner. */
		insert_value.close();
	}
}
