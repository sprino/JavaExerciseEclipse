/*Nome del package di cui fa parte la classe.*/


/*Classe rettangolo di tipo pubblica.*/
public class Rettangolo {
	private final int NUMERO_LATI = 4;

	private double base;
	private double altezza;

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base
	 *            the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the nUMERO_LATI
	 */
	public int getNUMERO_LATI() {
		return NUMERO_LATI;
	}

	/**
	 * @return the altezza
	 */
	public double getAltezza() {
		return this.altezza;
	}

	/**
	 * @param altezza
	 *            the altezza to set
	 */
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	/* Definisco metodo area */

	public double getArea() {
		return (this.base * this.altezza);
	}

	/* Definisco metodo perimetro. */

	public double getPerimetro() {
		return (2 * (this.base + this.altezza));
	}
}