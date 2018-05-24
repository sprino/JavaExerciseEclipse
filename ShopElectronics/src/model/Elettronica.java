package model;

//Sottoclasse elettronica
public class Elettronica extends Articolo {

	// Variabili di istanza specifiche per oggetti elettronici
	private String marca;
	private String modello;

	// Costruttoe
	public Elettronica(String tipo, String sottoTipo, double prezzo, String marca, String modello) {
		// Costruttore della superclasse
		super(tipo, sottoTipo, prezzo);
		this.marca = marca;
		this.modello = modello;
	}

	// Polimorfismo
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	@Override
	public String toString() {
		return "ID:" + super.getId() + "\nTipo:" + super.getTipo() + "\nSottoTipo:" + super.getSottoTipo() + "\nPrezzo:"
				+ super.getPrezzo() + "\nMarca:" + this.marca + "\nModello:" + this.modello + "\n";
	}
}
