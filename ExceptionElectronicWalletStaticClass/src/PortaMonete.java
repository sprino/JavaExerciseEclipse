

import static_class.ElaborazioneDati;

//Creo una classe portamonete
public class PortaMonete {

	private final int DIMENSIONE_PORTA_MONETE = 10;
	private int indice = 0;

	// creo un array di oggetti di tipo Moneta che puo' contenere al massimo 10
	// valori.
	private Moneta monete[] = new Moneta[this.DIMENSIONE_PORTA_MONETE];

	// Il metodo aggiungi riceve tramite varargs le monete passate come parametri e
	// fa le dovute analisi.
	public void aggiungi(double valore) {
		// Stampa la descrizione del portamonte.
		this.getDescrizione();

		// Le prime 10 vengono messe nel portafogli.
		if (this.indice < this.DIMENSIONE_PORTA_MONETE) {
			monete[this.indice] = new Moneta(valore);
			System.out.println("Moneta inserita correttamente");
			this.indice++;
		}
		// Per le successive mi dice che non vanno nel portafogli e mi dice quali sono.
		else {
			System.out.println("Il seguente valore non entra nel portafogli : " + valore);
		}
	}

	public void preleva(double valore) {
		// Stampo la descrizione di questo metodo.
		this.getDescrizionePreleva();

		double tempArray[] = new double[this.indice];

		for (int i = 0; i <= this.indice - 1; i++) {
			tempArray[i] = monete[i].getValore();
		}

		double tempArrayDel[] = ElaborazioneDati.eliminaDatiArray(tempArray, valore);

		for (int i = 0; i <= this.indice - 1; i++) {
			monete[i].setValore(tempArrayDel[i]);
		}

		if (!tempArrayDel.equals(tempArray))
			this.indice -= 1;
	}

	public double[] stato() {
		double tempArray[] = new double[this.indice];

		for (int i = 0; i <= this.indice - 1; i++) {
			tempArray[i] = monete[i].getValore();
		}
		return tempArray;
	}

	public void getDescrizione() {
		System.out.println("Queste monete vengono inserite nel portafogli...\n");
	}

	public void getDescrizionePreleva() {
		System.out.println("Prelevo la moneta richiesta...\n");
	}
}