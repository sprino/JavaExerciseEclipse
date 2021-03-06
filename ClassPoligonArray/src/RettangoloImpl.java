/*Nome del package di cui fa parte la classe.*/


/*Classe rettangolo di tipo pubblica.*/
public class RettangoloImpl implements PoligoniImplement {
	private double lato1;

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

	private double lato2;
	private double lato3;

	public RettangoloImpl(double lato1, double lato2) {
		this.lato1 = lato1;
		this.lato2 = lato2;
	}

	@Override
	public double getPerimetro() {
		return ((this.getLato1() * 2) + (this.getLato2() * 2));
	}

	@Override
	public double getArea() {
		return (this.getLato1() * this.getLato2());
	}
}