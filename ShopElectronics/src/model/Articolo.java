package model;

//Classe astratta
public abstract class Articolo {

	// Variabili di istanza comuni a tutti gli classi_articoli
	private Integer id;
	private String tipo;
	private String sottoTipo;
	private double prezzo;

	static int count = 0;

	// Costruttore che inizializza le variabili
	public Articolo(String tipo, String sottoTipo, double prezzo) {
		this.tipo = tipo;
		this.sottoTipo = sottoTipo;
		this.prezzo = prezzo;
		count++;
		this.id = count;
	}

	public Integer getId() {
		return this.id;
	}

	// Applico incapsulamento
	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSottoTipo() {
		return sottoTipo;
	}

	public void setSottoTipo(String sottoTipo) {
		this.sottoTipo = sottoTipo;
	}

	@Override
	public abstract String toString();

}