

//Creo un interfaccia di tipo lettore che ha un metodo di default.
public interface Lettore {

	// Il metodo dell'interfaccia lettore ha come modificatore default, quindi ha un
	// implementazione di default.
	default void leggi(Libro libro) {

		// Stampo il titolo e l'autore, dell'oggetto di tipo libro.
		System.out.println("Sto leggendo : " + libro.getTitolo() + " di " + libro.getAutore());

	}

}
