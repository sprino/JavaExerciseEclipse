package exception;

public class Exc_max_dim extends Exception {

	/**
	 * Quando si applica la propagazione dell'errore, bisogna serializzare la
	 * classe, perche Throwable estende la classeSerializable, serve per la gestione
	 * i/o, se ad esempio un oggetto deve lavorare su JVM diverse in rete, il
	 * seriale garantisce compatibilità.
	 */
	private static final long serialVersionUID = 2L;

	public Exc_max_dim() {
		super("Dimensione massima raggiunta!");
	}

	@Override
	public String toString() {
		return "Dimensione massima raggiunta.";
	}

}
