/*La classe contenuta nella directory PoligoniImplement, rende tale cartella un package.*/


/*Definisco classe pubblica di nome QuadratoImpl implementazione della poligoni.*/
public class QuadratoImpl implements PoligoniImplement {
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

	public QuadratoImpl(double lato1) {
		this.lato1 = lato1;
		;
	}

	@Override
	public double getPerimetro() {
		return (this.getLato1() * 4);
	}

	@Override
	public double getArea() {
		return (this.getLato1() * this.getLato1());
	}
}