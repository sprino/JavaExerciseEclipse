

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Try width resource che apre e chiude automaticamente lo scanner
		try (Scanner insert = new Scanner(System.in)) {

			// Istanzio oggetto scanner e dichiaro ed inizializzo la variabile utile per
			// scegliere.
			int numeroPoligoni = 0;
			double media = 0;

			System.out.print("Inserisci il numero di quadrati da creare : ");
			numeroPoligoni = insert.nextInt();

			// Creo ArrayList.
			List<PoligoniImplement> pol = new ArrayList<PoligoniImplement>(numeroPoligoni);
			List<Double> tempList = new ArrayList<Double>(numeroPoligoni);

			// Costruisco il numero di oggetti della quantità dell'utente, carico array
			// delle medie e faccio le somme.
			for (int i = 0; i <= numeroPoligoni - 1; i++) {

				double lato = Math.round(Math.random() * 10);

				if (lato != 0) {
					PoligoniImplement q = new QuadratoImpl(lato);
					tempList.add(q.getArea());
					media += q.getArea();
					pol.add(q);
				} else {
					i--;
				}
			}

			// Calcolo la media.
			media = media / pol.size();

			// Creo Iterator per scorrere i poligoni.
			Iterator<PoligoniImplement> iteratorPol = pol.iterator();

			// Stampo le aree generate.
			System.out.println("Stampo le aree generate: ");

			while (iteratorPol.hasNext()) {
				System.out.println(iteratorPol.next().getArea());
			}

			// Ordino le aree dei quadrati.
			Collections.sort(tempList);

			// Stampo la mediaed il valore dell'area minima e massima.
			System.out.println("La media delle aree e' :" + media);
			System.out.println("Il valore dell'area minore e' :" + tempList.get(0));
			System.out.println("Il valore dell'area maggiore e' :" + tempList.get(tempList.size() - 1));
		}

		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}