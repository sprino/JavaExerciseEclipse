package model;

public class Impiegato {

	private int idImpiegato;
	private String nome;
	private String cognome;
	private String dipartimento;
	private int ufficio;
	private int stipendio;
	
	public Impiegato() {
		super();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDipart() {
		return dipartimento;
	}

	public void setDipart(String dipart) {
		this.dipartimento = dipart;
	}

	public int getUfficio() {
		return ufficio;
	}

	public void setUfficio(int ufficio) {
		this.ufficio = ufficio;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	
	public int getIdImpiegato() {
		return idImpiegato;
	}
	public void setIdImpiegato(int idImpiegato) {
		this.idImpiegato = idImpiegato;
	}
	
	@Override
	public String toString() {
		return idImpiegato + nome + cognome + dipartimento + ufficio + stipendio;
	}
}
