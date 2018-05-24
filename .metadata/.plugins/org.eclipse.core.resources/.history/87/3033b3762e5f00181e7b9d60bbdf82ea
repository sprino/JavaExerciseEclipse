/*Indico il package nel quale si trova la classe.*/


/* Importo la classe Scanner. */
import java.util.Scanner;

/**
 * La classe matrice diagonale, calcola la diagonale principale della matrice.
 */
public class MatriceDiagonale {

	/* Creo metodo main, entry point del programma. */
	public static void main(String[] args) {
		/* Istanzio oggetto scanner. */
		Scanner insert = new Scanner(System.in);

		/*
		 * Dichiaro ed inizializzo la variabile dimensione, la temporanea e l'array
		 * bidimensionale
		 */
		int dim = 0;
		int temp = 0;
		int matrice[][];

		System.out.print("Inserisci il numero dei valori della matrice quadrata: ");
		dim = insert.nextInt();

		/* Inizializzo l'array bidimensionale matrice. */
		matrice = new int[dim][dim];

		/* Il primo ciclo si sposta lungo le righe. */
		for (int i = 0; i <= dim - 1; i++) {
			/* Il secondo ciclo si sposta lungo le colonne. */
			for (int j = 0; j <= dim - 1; j++) {
				System.out.print("Inserisci i valori della matrice quadrata: ");
				matrice[i][j] = insert.nextInt();

				/*
				 * Se gli indici sono uguali mi trovo sulla diagonale quindi somma i valori
				 * corrispondenti in quella posizione nella variabile temp.
				 */
				if (i == j) {
					temp += matrice[i][j];
				}
			}
		}

		/* Stampo la diagonale. */
		System.out.println("la diagonale è: " + temp);

		/* Chiudo oggetto Scanner. */
		insert.close();
	}
}