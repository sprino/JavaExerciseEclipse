/*Nome del package di cui fa parte la classe.*/


/*Classe rettangolo di tipo pubblica.*/
public class RettangoloExt extends PoligoniAbstract {
	public RettangoloExt(double lato1, double lato2) {
		super(lato1, lato2);
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