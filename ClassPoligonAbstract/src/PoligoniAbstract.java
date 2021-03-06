

//Generalizzo i poligoni dichiarando questa classe con modificatore abstract, non si creano istanze di questa classe.
public abstract class PoligoniAbstract {
	private double lato1, lato2, lato3;

	// Costruttore 1, per oggetti che
	public PoligoniAbstract(double lato1) {
		this.lato1 = lato1;
	}

	// Costruttore 2
	public PoligoniAbstract(double lato1, double lato2) {
		this.lato1 = lato1;
		this.lato2 = lato2;
	}

	// Costruttore 3
	public PoligoniAbstract(double lato1, double lato2, double lato3) {
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
	}

	/**
	 * @return the lato1
	 */
	public double getLato1() {
		return lato1;
	}

	/**
	 * @param lato1
	 *            the lato1 to set
	 */
	public void setLato1(double lato1) {
		this.lato1 = lato1;
	}

	/**
	 * @return the lato2
	 */
	public double getLato2() {
		return lato2;
	}

	/**
	 * @param lato2
	 *            the lato2 to set
	 */
	public void setLato2(double lato2) {
		this.lato2 = lato2;
	}

	/**
	 * @return the lato3
	 */
	public double getLato3() {
		return lato3;
	}

	/**
	 * @param lato3
	 *            the lato3 to set
	 */
	public void setLato3(double lato3) {
		this.lato3 = lato3;
	}

	// Sono metodi astratti, non possono essere invocati ma solo soggetti ad
	// override in una sottoclasse.
	// Puo' essere presente solo in una classe astratta, se c'e' anche un solo
	// metodo abstract la classe deve essere abstract.
	public abstract double getPerimetro();

	public abstract double getArea();
}