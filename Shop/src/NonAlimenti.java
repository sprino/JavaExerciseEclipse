

public class NonAlimenti extends Prodotti {
	private String materiale;

	public NonAlimenti(String descrizione, String codiceBarre, double prezzo, String materiale) {
		super(descrizione, codiceBarre, prezzo);
		this.materiale = materiale;
	}

	/**
	 * @return the materiale
	 */
	public String getMateriale() {
		return materiale;
	}

	/**
	 * @param materiale
	 *            the materiale to set
	 */
	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	public double getApplicaSconto() {
		/* Rendo la stringa del materiale minuscola per agevolare il confronto. */
		this.materiale = this.materiale.toLowerCase();

		if (this.materiale.equals("plastica") | this.materiale.equals("vetro") | this.materiale.equals("alluminio")) {
			System.out.println("Il prodotto ha la confezione riciclabile quindi applico lo sconto del 20%: ");
			return super.getApplicaSconto(10);
		} else {
			return this.getPrezzo();
		}
	}
}
