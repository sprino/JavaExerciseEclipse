

public class CerchioImpl implements PoligoniImplement {
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

	public CerchioImpl(double lato1) {
		this.lato1 = lato1;
	}

	@Override
	public double getPerimetro() {
		return (2 * Math.PI * this.getLato1());
	}

	@Override
	public double getArea() {
		return ((this.getLato1() * this.getLato1()) * Math.PI);
	}
}