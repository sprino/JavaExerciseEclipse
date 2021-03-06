

public class CerchioExt extends PoligoniAbstract {
	public CerchioExt(double lato1) {
		super(lato1);
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