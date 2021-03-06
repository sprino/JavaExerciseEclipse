

public class Triangolo {
	/* Attribbuto non modificabile. */
	private final int NUMERO_LATI = 3;
	private double lati[] = new double[3];
	private double arrayNull[] = new double[3];
	private double lato_3;
	private double area;
	private double perimetro;

	/**
	 * @return the lato_3
	 */
	public double getLato_3() {
		if (this.lati[0] == this.lati[1] & this.lati[0] == this.lati[2]) {
			return this.lato_3;
		} else {
			this.lato_3 = Math.sqrt((this.lati[0] * this.lati[0]) + (this.lati[1] * this.lati[1]));
			return this.lato_3;
		}
	}

	/**
	 * @param lato_3
	 *            the lato_3 to set
	 */
	public void setLato_3(double lato_3) {
		this.lato_3 = lato_3;
	}

	/**
	 * @return the lati
	 */
	public double[] getLati() {
		return lati;
	}

	/**
	 * @param lati
	 *            the lati to set
	 */
	public void setLati(double[] lati) {
		this.lati = lati;
	}

	public Triangolo() {
		this.lati[0] = 0;
		this.lati[1] = 0;

		this.arrayNull[0] = 0;
		this.arrayNull[1] = 0;
	}

	/**
	 * @return the nUMERO_LATI
	 */
	public int getNUMERO_LATI() {
		return NUMERO_LATI;
	}

	public String getTipoTriangolo() {
		/*
		 * Confronta l'array angoli con quello nullo, se sono diversi comunica che non
		 * sono stati inseriti i lati.
		 */
		if (this.lati.equals(arrayNull) || this.lati[0] == 0 || this.lati[1] == 0 || this.lati[2] == 0) {
			return "inseistente, perche' uno o piu' lati hanno lunghezza nulla.";
		} else if (this.lati[0] == this.lati[1] & this.lati[0] == this.lati[2]) {
			return "EQUILATERO";
		} else if (this.lati[0] == this.lati[1] || this.lati[0] == this.lati[2] || this.lati[1] == this.lati[2]) {
			return "ISOSCELE";
		} else if (this.lati[0] != this.lati[1] & this.lati[0] != this.lati[2]) {
			return "SCALENO";
		} else {
			return "Sconosciuto";
		}
	}

	public double getPerimetro() {
		for (int i = 0; i <= 2; i++) {
			this.perimetro += lati[i];
		}
		return this.perimetro;
	}

	/**
	 * @return Area calcolata con il metodo di Eulero.
	 */
	public double getArea() {
		/* Calcolo il semiperimetro */
		double sPerimetro = 0;
		sPerimetro = this.perimetro / 2;

		if (this.lati[0] != this.lati[1] & this.lati[0] != this.lati[2]) {
			this.area = Math.sqrt(sPerimetro
					* ((sPerimetro - this.lati[0]) * (sPerimetro - this.lati[1]) * (sPerimetro - this.getLato_3())));
		} else {
			this.area = (Math.sqrt(3) * (this.lati[0] * this.lati[0])) / 2;
		}
		return area;
	}
}
