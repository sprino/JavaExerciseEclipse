

//Creo interfaccia programmatore.
public interface Programmatore {

	// Implemento il metodo default che non ha a che fare con libro, stampa solo il
	// linguaggio passato come parametro.
	default void programma(String linguaggio) {
		System.out.println("Sto programmando in " + linguaggio);
	}

}
