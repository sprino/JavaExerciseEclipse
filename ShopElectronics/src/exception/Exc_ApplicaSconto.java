package exception;

public class Exc_ApplicaSconto extends Exception {

	/**
	 * Quando si applica la propagazione dell'errore, bisogna serializzare la
	 * classe, perche Throwable estende la classeSerializable, serve per la gestione
	 * i/o, se ad esempio un oggetto deve lavorare su JVM diverse in rete, il
	 * seriale garantisce compatibilità.
	 */
	private static final long serialVersionUID = 1L;
	private double totaleDaPagare;

	public Exc_ApplicaSconto(double totaleDaPagare) {
		super("Aggiornamento! ");
		this.totaleDaPagare = totaleDaPagare;
	}

	public double getTotaleDaPagare() {
		return totaleDaPagare;
	}

	@Override
	public String toString() {
		return "Complimenti, hai diritto ad uno sconto del 30 %";
	}
}
