

public class AlunniMaterie {
	private final int NUMERO_MATERIE = 6;

	private double voti[] = new double[NUMERO_MATERIE];
	private String materie[] = new String[NUMERO_MATERIE];

	private String nome;
	private String cognome;
	private String classe;

	public AlunniMaterie() {
		for (int i = 0; i <= NUMERO_MATERIE - 1; i++) {
			voti[i] = 0;
		}

		/*
		 * Non mettere mai il caricamento dei valori di un array in un costruttore, in
		 * questo modo obbligo lo svilupatore a dover conoscere la mia classe.
		 * this.materie[0] = "Italiano"; this.materie[1] = "Matematica"; this.materie[2]
		 * = "Storia e Geografia"; this.materie[3] = "Scienze"; this.materie[4] =
		 * "Storia"; this.materie[5] = "Educazione fisica";
		 */

		this.materie[0] = "Italiano";
		this.materie[1] = "Matematica";
		this.materie[2] = "Storia e Geografia";
		this.materie[3] = "Scienze";
		this.materie[4] = "Storia";
		this.materie[5] = "Educazione fisica";

		this.nome = "";
		this.cognome = "";
		this.classe = "";
	}

	public String[] getMaterie() {
		return materie;
	}

	public void setMaterie(String[] materie) {
		this.materie = materie;
	}

	public double[] getVoti() {
		if (voti.equals(null)) {
			System.out.println("Non sono stati inseriti voti...");
			return null;
		} else {
			return voti;
		}
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome
	 *            the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the classe
	 */
	public String getClasse() {
		return classe;
	}

	/**
	 * @param classe
	 *            the classe to set
	 */
	public void setClasse(String classe) {
		this.classe = classe;
	}

	public void setVoti(double voti[]) {
		for (int i = 0; i <= NUMERO_MATERIE - 1; i++) {
			this.voti[i] = voti[i];
		}
	}

	public double getMediaVoti() {
		double temp = 0;

		for (double voto : voti) {
			temp += voto;
		}

		return (temp / NUMERO_MATERIE);
	}
}
