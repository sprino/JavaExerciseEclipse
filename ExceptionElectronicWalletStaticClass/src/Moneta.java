

public class Moneta {

	// Creo variabile valuta publica e statica(condivisa da tutti, chiamata senza
	// istanziare) e final(non modificabile).
	public final static String VALUTA = "Euro";

	// lo rendo final e tolgo il metodo set, cose' il valore della moneta non si
	// piu' modificare se non cn una nuova istanza.
	private double valore;

	// Costruttore che obbliga il settaggio iniziale della moneta e stampa un
	// messaggio
	public Moneta(double euro) {
		// Creo una variabile temporanea di tipo stringa ed assegno a valore il valore
		// passato al parametro del costruttore.
		String temp = "";
		this.valore = euro;

		// Stampo la valuta dell'euro.
		this.getDescrizioneEuro();

		// Se valore == 1 allora la stringa temporanea temp ha il singolare di
		// centesimi.
		if (this.valore == 1) {
			temp = "centesimo di ";
		}
		// Se valore è minore o uguale di 99 allora temp assume il plurale.
		else if (this.valore <= 99) {
			temp = "centesimi di ";
		}
		// Se valore è maggiore di 100, dividi il valore per 100 e stampa la dicitura
		// euro e non centesimi.
		else if (this.valore % 100 >= 0) {
			this.valore = this.valore / 100;
		} else {

		}

		// Stampa il valore della moneta inserita.
		System.out.println("Il valore della moneta settata e' di " + this.valore + " " + temp + Moneta.VALUTA + "\n");
	}

	// Metodi set e get
	public double getValore() {
		return valore;
	}

	public void setValore(double valore) {
		this.valore = valore;
	}

	public void getDescrizioneEuro() {

		System.out.println("Il tasso di cambio dell'euro e': EUR/USD ___ 1.226645 ___ 19:00	___ -0.29% ");
	}
}
