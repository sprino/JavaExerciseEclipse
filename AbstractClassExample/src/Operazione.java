

public abstract class Operazione {

	private double valore;
	private double risultato;

	/**
	 * @return the valore
	 */
	public double getValore() {
		return valore;
	}

	/**
	 * @param valore
	 *            the valore to set
	 */
	public void setValore(double valore) {
		this.valore = valore;
	}

	/**
	 * @return the risultato
	 */
	public double getRisultato() {
		return risultato;
	}

	/**
	 * @param risultato
	 *            the risultato to set
	 */
	public void setRisultato(double risultato) {
		this.risultato = risultato;
	}

	public abstract double operazione();

}
