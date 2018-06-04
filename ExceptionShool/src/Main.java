

import java.io.IOException;
import java.util.Scanner;

//import scuola.*;

public class Main {

	public static void main(String[] args) throws IOException {
		final int NUMERO_ALUNNI = 30;

		Scanner insert = new Scanner(System.in);
		AlunniMaterie alunni[] = new AlunniMaterie[NUMERO_ALUNNI];
		String select = "";
		int alunno = 0;

		for (int i = 0; i <= NUMERO_ALUNNI - 1; i++) {
			alunni[i] = new AlunniMaterie();
		}

		while (select.equals("exit") != true) {
			System.out.println("MENU CARICAMENTO VOTI SCUOLA:\n" + "scrivi exit per uscire...\n\n"
					+ "1)Carica dati nuovo studente.\n" + "2)Inserisci voti studente.\n" + "3)Ricerca studente.\n"
					+ "4)Ottieni nome dello studente con media piu' alta.\n" + "5)Inserisci nuovo studente.\n");

			select = insert.next();

			switch (select) {
			case "1":

				if (alunno <= NUMERO_ALUNNI - 1) {
					System.out.print("Inserisci nome dello studente:");
					alunni[alunno].setNome(insert.next());
					System.out.print("Inserisci il cognome dello studente:");
					alunni[alunno].setCognome(insert.next());
					System.out.print("Inserisci la classe dello studente:");
					alunni[alunno].setClasse(insert.next());
				} else {
					System.out.println("Numero di studenti superato...");
				}

				break;

			case "2":

				if (alunni[0].getNome().equals("")) {
					System.out.println("Inserisci almeno uno studente...");
					System.out.println("premi un tasto per tornare al menu principale...");
					System.in.read();
				} else {
					double voti[] = new double[alunni[alunno].getMaterie().length];

					for (int i = 0; i <= alunni[alunno].getMaterie().length - 1; i++) {
						System.out.print("Inserisci il voto per " + alunni[alunno].getMaterie()[i] + " : ");
						voti[i] = insert.nextDouble();
					}
					alunni[alunno].setVoti(voti);
				}

				break;

			case "3":

				if (alunni[0].getNome().equals("")) {
					System.out.println("Inserisci almeno uno studente...");
					System.out.println("premi un tasto per tornare al menu principale...");
					System.in.read();
				} else {
					String alunnoSearchN = "";
					String alunnoSearchC = "";
					String alunnoSearch = "";
					String temp = "";

					System.out.print("Inserisci il nome dello studente che vuoi trovare: ");
					alunnoSearchN = insert.next();
					System.out.print("Inserisci il cognome dello studente che vuoi trovare: ");
					alunnoSearchC = insert.next();

					alunnoSearch = alunnoSearchN + alunnoSearchC;
					alunnoSearch = alunnoSearch.toLowerCase();

					for (int i = 0; i <= NUMERO_ALUNNI - 1; i++) {
						temp = alunni[i].getNome() + alunni[i].getCognome();
						temp = temp.toLowerCase();

						if (temp.equals(alunnoSearch)) {
							System.out.println("La media di " + temp + " e' di : " + alunni[i].getMediaVoti());

							System.out.println("premi un tasto per tornare al menu principale...");
							System.in.read();
						}
					}
				}

				break;

			case "4":

				if (alunni[0].getNome().equals("") | alunni[1].getNome().equals("")) {
					System.out.println("Inserisci almeno uno studente...");
					System.out.println("premi un tasto per tornare al menu principale...");
					System.in.read();
				} else {
					double mediaH = alunni[alunni.length - 1].getMediaVoti();
					int indice = 0;

					for (int i = alunni.length - 1; i != 0; i--) {
						if (alunni[i - 1].getMediaVoti() > mediaH) {
							mediaH = alunni[i - 1].getMediaVoti();
							indice = i - 1;
						}
					}

					System.out.println("L'alunno con media piu' alta e': " + alunni[indice].getNome() + " "
							+ alunni[indice].getCognome() + " della classe " + alunni[indice].getClasse());
					System.out.println("La sua media e' di: " + mediaH);
				}

				break;

			case "5":

				alunno++;

				break;

			default:
				if (!select.equals("exit")) {
					System.out.println("Scelta non consentita...premi un tasto per tornare al menu principale...");
					System.in.read();
				}

				break;
			}
		}
		insert.close();
	}
}
