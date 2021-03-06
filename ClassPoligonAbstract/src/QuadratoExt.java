/*La classe contenuta nella directory PoligoniAbstract, rende tale cartella un package.*/


/*Definisco classe pubblica di nome QuadratoExt estensione della poligoni.*/
public class QuadratoExt extends PoligoniAbstract {
	public QuadratoExt(double lato1) {
		super(lato1);
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