/*Programma che simula un negozio elettronico con il proprio carrello.
 * Visualizza i prodotti in magazzino.
 * Aggiunge prodotti al carrello e li elemina dal magazzino.
 * Rimuove classi_articoli dal carrello e li rimette in magazzino.
 * Stampa oggetti nel carrello.
 * Stampa il prezzo totale degli oggetti nel garrello.
 * Applica lo sconto se il totale supera una soglia.*/

package controller;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import exception.Exc_Vuoto;
import exception.Exc_max_dim;
import model.Utente;
import model.Carrello;
import model.Magazzino;
import util.Utility;

public class Main {

	public static void main(String[] args) {

		try (Scanner insert = new Scanner(System.in)) {

			String scelta = "";
			Integer temp = 0;

			// Creo oggetti magazzino e carrello che gestiscono i prodotti
			Magazzino magazzino = new Magazzino();
			// Carrello carrello = new Carrello();

			Utente utente = new Utente();

			magazzino.carica_default(magazzino);

			// Ciclo while infinito che stampa il menu del carrello e termina se l'utente
			// scrive "exit".
			while (scelta.equals("exit") != true) {
				// Pulisco lo stream.
				System.out.flush();

				// Stampo le voci del menu del costrutto switch case.
				System.out.println("MENU CARRELLO ELETTRONICO, SCEGLI L'OPERAZIONE DA ESEGUIRE:\n"
						+ "Scrivere exit per uscire \n\n" + "1)Visualizza prodotti in magazzino:\n"
						+ "2)Aggiungi prodotti nel carrello: \n" + "3)Rimuovi prodotti dal carrello: \n"
						+ "4)Visualizza prodotti nel carrello: \n" + "5)Stampa totale del carrello: \n"
						+ "6)Cerca oggetti per tipo nel magazzino.\n" + "7)Crea Utente.\n"
						+ "8)Stampa carrello Utente.");

				// L'utente inserisce la scelta..
				scelta = insert.next();

				// Costrutto switch case che attiva il case relativo alla pressione del tasto.
				switch (scelta) {
				case "1":

					// Richiamo il metodo che mi stampa tutti gli elementi caricati nella TreeHash
					// map del magazzino.
					magazzino.stato();

					// Richiamo il metodo che richiama la classe statica utility che fa apparire
					// "premi un tasto per continuare...".
					Utility.pause();

					break;

				case "2":

					// Stampo il contenuto del magazino per permettere la scelta all'utente tramite
					// id.
					magazzino.stato();

					// Chiedo inserimendo dell' Id del prodotto scelto.
					System.out.print("Inserisci l'ID del prodotto da inserire nel carrello: ");
					temp = insert.nextInt();

					// //Caraico nel carrello.
					// carrello.carica(magazzino.preleva(temp));

					utente.getCarrello().carica(magazzino.preleva(temp));

					// Scarico dal magazzino
					magazzino.scarica(temp);

					Utility.pause();

					break;

				case "3":

					utente.getCarrello().stato();

					// Richiamo il metodo della classe carrello che inserisce l'elemento
					// con il relativo ID nel carrello e lo toglie dal magazzino.
					System.out.print("Inserisci l'ID del prodotto da rimuovere nel carrello: ");
					temp = insert.nextInt();

					// Ricarico elemento nel magazzino
					magazzino.carica(utente.getCarrello().preleva(temp));

					// Tolgo elemento nel magazzino.
					utente.getCarrello().scarica(temp);

					Utility.pause();

					break;

				case "4":

					// Stampo il contenuto della TreeHash map del carrello.
					utente.getCarrello().stato();

					Utility.pause();

					break;

				case "5":

					// Stampo il totale da pagare, se l'utente ha superato 100� si applica lo
					// sconto del 30%
					System.out.println("Il totale da pagare e' : " + utente.getCarrello().totale());

					Utility.pause();

					break;

				case "6":

					// Stampo il totale da pagare, se l'utente ha superato 100� si applica lo
					// sconto del 30%
					System.out.println("Inserisci il tipo di articolo da acquistare scegliendo tra:\n" + "-Libro\n"
							+ "-Elettronica\n" + "-Casalinghi.");
					magazzino.cercaValore(insert.next());

					Utility.pause();

					break;

				case "7":

					utente = new Utente();

					break;

				case "8":

					System.out.println("\nDETTAGLI DELL'UTENTE CON ID n°" + utente.getIdUtente());

					// Carrello a = utente.getCarrello();

					for (Map.Entry<Integer, Carrello> entry : utente.getUtente().entrySet()) {
						int tempKey = entry.getKey();
						Carrello carrello = utente.getUtente().get(tempKey);
						carrello.stato();
					}

					Utility.pause();

					break;

				default:

					if (!scelta.equals("exit")) {
						Utility.pause();
					}

					break;
				}
			}
		} catch (Exc_max_dim exc) {
			System.out.println(exc.getMessage());
			System.out.println(exc.toString());
		} catch (Exc_Vuoto exc) {
			System.out.println(exc.getMessage());
			System.out.println(exc.toString());
		}
		// Eccezzione lanciata da errori dell'input.
		catch (InputMismatchException exc) {
			System.out.println("Errore input: " + exc.getMessage());
			exc.printStackTrace();
		} // Eccezione puntatore nullo
		catch (NullPointerException exc) {
			System.out.println("Errore puntatore: " + exc.getMessage());
			exc.printStackTrace();
		} // Tutte le possibili eccezioni.
		catch (Exception exc) {
			System.out.println("Errore generico: " + exc.getMessage());
			exc.printStackTrace();
		}
	}
}
