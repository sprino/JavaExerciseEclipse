/*La classe contenuta nella directory PoligoniImplement, rende tale cartella un package.*/


/*Definisco classe pubblica di nome QuadratoImpl.*/
public class Quadrato {
	/* Inserisco il numero di lati. */
	private final int NUMERO_LATI = 4;

	/* Attributo privato di tipo int. */
	private double lato;

	// public QuadratoImpl(int lato)
	// {
	// this.lato = lato;
	// }

	/**
	 * @return the lato
	 */
	public double getLato() {
		return lato;
	}

	/**
	 * @param lato
	 *            the lato to set
	 */
	public void setLato(double lato) {
		this.lato = lato;
	}

	/**
	 * @return the nUMERO_LATI
	 */
	public int getNUMERO_LATI() {
		return NUMERO_LATI;
	}

	public double getPerimetro() {
		return (this.lato * 4);
	}

	public double getArea() {
		return (this.lato * this.lato);
	}
}