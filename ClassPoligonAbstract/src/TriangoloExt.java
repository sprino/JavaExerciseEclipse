

public class TriangoloExt extends PoligoniAbstract {
	public TriangoloExt(double lato1, double lato2, double lato3) {
		super(lato1, lato2, lato3);
	}

	private double getLatoClac() {
		if (this.getLato1() == this.getLato2() & this.getLato2() == this.getLato3()) {
			return this.getLato3();
		} else {
			this.setLato3(Math.sqrt((this.getLato1() * this.getLato1()) + (this.getLato2() * this.getLato2())));

			return this.getLato3();
		}
	}

	public String getTipoTriangolo() {
		/*
		 * Confronta l'array angoli con quello nullo, se sono diversi comunica che non
		 * sono stati inseriti i lati.
		 */
		if (this.getLato1() == 0 || this.getLato2() == 0 || this.getLato3() == 0) {
			return "inseistente, perche' uno o piu' lati hanno lunghezza nulla.";
		} else if (this.getLato1() == this.getLato2() & this.getLato1() == this.getLato3()) {
			return "EQUILATERO";
		} else if (this.getLato1() == this.getLato2() || this.getLato1() == this.getLato3()
				|| this.getLato2() == this.getLato3()) {
			return "ISOSCELE";
		} else if (this.getLato1() != this.getLato2() & this.getLato1() != this.getLato3()) {
			return "SCALENO";
		} else {
			return "Sconosciuto";
		}
	}

	@Override
	public double getPerimetro() {
		return (this.getLato1() + this.getLato2() + this.getLatoClac());
	}

	/**
	 * @return Area calcolata con il metodo di Eulero.
	 */
	@Override
	public double getArea() {
		/* Calcolo il semiperimetro */
		double sPerimetro = 0;
		sPerimetro = this.getPerimetro() / 2;

		return Math.sqrt(sPerimetro * ((sPerimetro - this.getLato1()) * (sPerimetro - this.getLato2())
				* (sPerimetro - this.getLatoClac())));
	}
}
