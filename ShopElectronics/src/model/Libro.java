package model;

//Sottoclasse letteratura
public class Libro extends Articolo {

	// Variabili di istanza specifiche per questa sottoclasse.
	private String titolo;
	private String autore;

	// Costruttore
	public Libro(String tipo, String sottoTipo, double prezzo, String titolo, String autore) {
		// Costruttore della superclasse
		super(tipo, sottoTipo, prezzo);
		this.titolo = titolo;
		this.autore = autore;
	}

	@Override
	public String toString() {
		return "ID:" + super.getId() + "\nTipo:" + super.getTipo() + "\nSottoTipo:" + super.getSottoTipo() + "\nPrezzo:"
				+ super.getPrezzo() + "\nTitolo:" + this.titolo + "\nAutore:" + this.autore + "\n";
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}
}
