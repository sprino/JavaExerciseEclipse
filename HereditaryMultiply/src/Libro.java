

//Creo classe libro.
public class Libro {

	// Variabili di istanza della classe. Titolo ed Autore.
	private String titolo;
	private String autore;

	// Costruttore, assegno un titolo e l'autore ad ogni istanza.
	public Libro(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
	}

	// Get e Set.
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
