

import java.io.IOException;
import java.util.Scanner;

import static_class.Utility;

public class TestMonete {

	public static void main(String[] args) throws IOException {
		// Istanzio oggetto scanner e dichiaro ed inizializzo la variabile utile per
		// scegliere.
		Scanner insert = new Scanner(System.in);
		PortaMonete monete = new PortaMonete();
		String scelta = "";

		while (scelta.equals("exit") != true) {
			System.out.flush();

			System.out.println("MENU PORTAFOGLI, SCEGLI L'OPERAZIONE DA ESEGUIRE:\n" + "Scrivere exit per uscire \n\n"
					+ "1)Aggiungi moneta;\n" + "2)Preleva moneta;\n" + "3)Stato del portafogli;\n");

			scelta = insert.next();

			switch (scelta) {
			case "1":

				System.out.print("Inserisci il valore in centesimi di euro della moneta da aggiungere: ");
				monete.aggiungi(insert.nextDouble());

				break;

			case "2":

				System.out.print("Inserisci il valore in centesimi di euro della moneta da prelevare: ");
				monete.preleva(insert.nextDouble());

				Utility.pause();

				break;

			case "3":

				double tempArray[] = new double[monete.stato().length];
				tempArray = monete.stato();

				double totale = 0;

				System.out.print("Nel portafogli hai i seguuenti valori : ");

				for (int i = 0; i < tempArray.length; i++) {
					System.out.print(tempArray[i]);
					totale += tempArray[i];
				}

				System.out.println("\n Il totale è : " + totale);

				Utility.pause();

				break;

			default:

				if (!scelta.equals("exit")) {
					Utility.pause();
				}

				break;
			}
		}
		insert.close();
	}
}
