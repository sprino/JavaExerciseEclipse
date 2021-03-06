

//Dichiaro una classe pubblica di nome Costruttore.
public class Costruttore {
	// Dichiaro gli attributi, privati, quindi visibili solo all'interno della
	// classe.
	private int a;
	private int b;

	// Dichiaro un costruttore che inizializza le variabili a e b.
	public Costruttore() {
		// Uso this per puntare alle variabili a e b di questa stessa classe.
		this.a = 1;
		this.b = 1;
	}

	// Dichiaro un metodo somma che somma a e b e restituisce il risultato in
	// formato intero.
	public int somma(int x, int y) {
		this.a = this.a + x;
		this.b = this.b + y;

		return (this.a + this.b);
	}
}
