package it.begear.esempiohibernate;


import javax.persistence.*;


/**
 * Gioco.java
 * Questa classe mappa la tabella Gioco del BD
 */
 
 //Annotation JPA in hibernate 
 //   @Entity specifica che si sta scrivendo una Entity Class
 //   @Table(name= "nome della tabella")
 //   @Id 
 //   @Column(name = "nome della colonna")
 //   @GeneratedValue(strategy = GenerationType.IDENTITY) 


@Entity
@Table(name = "gioco")
public class Gioco {
	private int id;
	private int prezzo;
	private String titolo;
	private String autore;


	public Gioco() {
	}

	@Id
	@Column(name = "gioco_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
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
	
	@Override
	public String toString() {
		return this.id + " " + this.titolo + " " + this.autore + " " + this.prezzo;
	}

}
