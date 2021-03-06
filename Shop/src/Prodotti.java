

public class Prodotti {
	private String codiceBarre;
	private double prezzo;
	private String descrizione;

	public Prodotti(String descrizione, String codiceBarre, double prezzo) {
		this.descrizione = descrizione;
		this.codiceBarre = codiceBarre;
		this.prezzo = prezzo;
	}

	public double getApplicaSconto(double sconto) {
		double prezzoScontato = 0;

		prezzoScontato = this.prezzo - ((this.prezzo * sconto) / 100);

		return prezzoScontato;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione
	 *            the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the codiceBarre
	 */
	public String getCodiceBarre() {
		return codiceBarre;
	}

	/**
	 * @param codiceBarre
	 *            the codiceBarre to set
	 */
	public void setCodiceBarre(String codiceBarre) {
		this.codiceBarre = codiceBarre;
	}

	/**
	 * @return the prezzo
	 */
	public double getPrezzo() {
		return prezzo;
	}

	/**
	 * @param prezzo
	 *            the prezzo to set
	 */
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}
