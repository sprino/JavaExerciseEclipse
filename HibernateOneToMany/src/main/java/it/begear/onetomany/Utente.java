package it.begear.onetomany;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Utente")
public class Utente {

	public Set<Documento> getDocumenti() {
		return documenti;
	}
	public void setDocumenti(Set<Documento> documenti) {
		this.documenti = documenti;
	}
	public int getId_utente() {
		return id_utente;
	}
	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
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
	public void setCognome(String congome) {
		this.cognome = congome;
	}
	
	@Id
	@Column(name="id_utente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_utente;
	private String nome;
	private String cognome;
	
	//Se dichiarata prima di (private int id_utente) causa il seguante errore: 
	//Exception in thread "main" java.lang.NullPointerException
	@OneToMany(fetch=FetchType.EAGER, mappedBy="utente")
	private Set<Documento> documenti;
}
