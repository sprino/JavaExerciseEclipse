package it.begear.model;

public class Dipartimento {

	private String nome;
	private String indirizzo;
	private String citta;
	
	public Dipartimento() {
		super();
	}
	
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo=indirizzo;
	}
	public String getIndirizzo() {
		return this.indirizzo;
	}

	@Override
	public String toString() {
		return nome + indirizzo + citta;
	}

}
