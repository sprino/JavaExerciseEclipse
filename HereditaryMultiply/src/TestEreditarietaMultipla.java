

public class TestEreditarietaMultipla {

	public static void main(String args[]) {

		// Creo un istanza della classe Libro e della classe ChiStaLeggendo.
		ChiStaLeggendo tu = new ChiStaLeggendo();
		Libro java8 = new Libro("Manuale di java8", "Claudio de Sio Cesari");

		// Accedo ai metodi di default delle interfaccie dall'oggetto ChiStaLeggendo che
		// implementa l'ereditarietà multipla.
		tu.programma("java");
		tu.leggi(java8);
	}
}
