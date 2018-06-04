package exception;

public class Exc_Vuoto extends Exception {

	/**
	 * Quando si applica la propagazione dell'errore, bisogna serializzare la
	 * classe, perche Throwable estende la classeSerializable, serve per la gestione
	 * i/o, se ad esempio un oggetto deve lavorare su JVM diverse in rete, il
	 * seriale garantisce compatibilità.
	 */
	private static final long serialVersionUID = 2L;

	public Exc_Vuoto() {
		super("Nessun elemento presente... ");
	}

	@Override
	public String toString() {
		return "Inserisci qualche elemento";
	}

}
