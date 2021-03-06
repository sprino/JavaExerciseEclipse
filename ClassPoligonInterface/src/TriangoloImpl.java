

public class TriangoloImpl implements PoligoniImplement {
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

	public TriangoloImpl(double lato1, double lato2, double lato3) {
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
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
