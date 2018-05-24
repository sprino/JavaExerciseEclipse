

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

			// Costruisco il numero di oggetti della quantità dell'utente, carico array
			// delle medie e faccio le somme.
			for (int i = 0; i <= numeroPoligoni - 1; i++) {

				double lato = Math.round(Math.random() * 10);

				if (lato != 0) {
					PoligoniImplement q = new QuadratoImpl(lato);
					media += q.getArea();
					pol.add(q);
				} else {
					i--;
				}
			}

			// Calcolo la media.
			media = media / pol.size();

			// Creo oggetto ordinaArea che riscrive il metodo compare che richiama il
			// compareTo della classe Comparator.
			Comparator<PoligoniImplement> ordinaPerArea = new Comparator<PoligoniImplement>() {
				@Override
				public int compare(PoligoniImplement p1, PoligoniImplement p2) {
					return ((Double) p1.getArea()).compareTo(p2.getArea());
				}
			};

			// Ordino l'arrayList di poligoni in base all'area.
			Collections.sort(pol, ordinaPerArea);

			// Creo Iterator per scorrere i poligoni, in questo punto dopo l'ordinamento.
			Iterator<PoligoniImplement> iteratorPol = pol.iterator();

			// Stampo le aree generate.
			System.out.println("Stampo le aree generate: ");

			while (iteratorPol.hasNext()) {
				System.out.println(iteratorPol.next().getArea());
			}

			// Stampo la media ed il valore dell'area minima e massima.
			System.out.println("La media delle aree e' :" + media);
			System.out.println("Il valore dell'area minore e' :" + pol.get(0).getArea() + " Ed il suo perimetro e' del "
					+ pol.get(0).getPerimetro());
			System.out.println("Il valore dell'area maggiore e' :" + pol.get(pol.size() - 1).getArea()
					+ " Ed il suo perimetro e' del " + pol.get(pol.size() - 1).getPerimetro());

		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}