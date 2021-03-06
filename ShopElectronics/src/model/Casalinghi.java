package model;

//Sottoclasse articolo
public class Casalinghi extends Articolo {

	// Variabili di istanza specifici per i casalinghi
	private String materiale;
	private String colore;

	// Costruttore che inizializza le variabili
	public Casalinghi(String tipo, String sottoTipo, double prezzo, String materiale, String colore) {
		// Costruttore della superclasse
		super(tipo, sottoTipo, prezzo);
		this.materiale = materiale;
		this.colore = colore;
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	@Override
	public String toString() {
		return "ID:" + super.getId() + "\nTipo:" + super.getTipo() + "\nSottoTipo:" + super.getSottoTipo() + "\nPrezzo:"
				+ super.getPrezzo() + "\nMateriale:" + this.materiale + "\nColore:" + this.colore + "\n";
	}
}
