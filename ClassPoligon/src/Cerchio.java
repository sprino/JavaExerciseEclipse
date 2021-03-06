

public class Cerchio {
	/*
	 * Dichiaro ed inizializzo attribbuto non modificabile pi-greco. Anche se esiste
	 * nella libreria Math.PI
	 */
	private static final double PI = 3.14;

	/* Dichiaro ed inizializzo attribbuti del cerchio. */
	private double raggio;
	private double circonferenza;
	private double area;

	/**
	 * @return the raggio
	 */
	public double getRaggio() {
		return raggio;
	}

	/**
	 * @param raggio
	 *            the raggio to set
	 */
	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	public double getCirconferenza() {
		this.circonferenza = 2 * PI * this.raggio;

		return this.circonferenza;
	}

	public double getArea() {

		this.area = (this.raggio * this.raggio) * PI;

		return this.area;
	}
}