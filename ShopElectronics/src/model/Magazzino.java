package model;

import java.util.Map;
import java.util.TreeMap;

import exception.Exc_Vuoto;
import exception.Exc_max_dim;
import model.Magazzino;
import util.Utility;

public class Magazzino extends GestioneProdotti {

	// Creo un oggetto costituito da chiave e tipo.
	private Map<Integer, Articolo> magazzino = new TreeMap<Integer, Articolo>();
	// Dimensione massima del magazzino di tipo final e statica.
	private int dimensioneMaxMagazzino = 100;

	public int getDimensioneMaxMagazzino() {
		return dimensioneMaxMagazzino;
	}

	public void setDimensioneMaxMagazzino(int dimensioneMaxMagazzino) {
		this.dimensioneMaxMagazzino = dimensioneMaxMagazzino;
	}

	// Carico il magazzino con l'oggetto articolo inviato al metodo come parametro
	@Override
	public void carica(Articolo a) throws Exc_max_dim {

		// Se supero le dimensioni del magazzino lancio un eccezione, uso il try perche
		// il metodo e' pubblico.
		if (magazzino.size() == this.getDimensioneMaxMagazzino()) {
			throw new Exc_max_dim();
		} else {

			// Aggiungo aggetto passato nell'HasMap del magazzino con l'id progressivo.
			this.magazzino.put(a.getId(), a);
		}

	}

	@Override
	public void carica_default(Magazzino m) throws Exc_max_dim {

		// Carico manualmente gli oggetti nell'ipotetico magazzino.
		Articolo[] libro = new Libro[3];
		Articolo[] elett = new Elettronica[3];
		Articolo[] casa = new Casalinghi[3];

		// Tipo,SottoTipo,Prezzo,Titolo,Autore
		libro[0] = new Libro("Libro", "Horror", 12, "La tana del verme bianco", "Bram Stoker");
		libro[1] = new Libro("Libro", "Letteratura", 15, "Il visconte dimezzato", "Italo Calvino");
		libro[2] = new Libro("Libro", "Letteratura", 17, "Il barone rampante", "Italo Calvino");
		m.carica(libro[0]);
		m.carica(libro[1]);
		m.carica(libro[2]);

		// Tipo,SottoTipo,Prezzo,Marca,Modello
		elett[0] = new Elettronica("Elettronica", "console", 400, "Sony", "PS4");
		elett[1] = new Elettronica("Elettronica", "HUBusb", 25, "Amazon", "5 porte");
		elett[2] = new Elettronica("Elettronica", "Monitor PC", 93, "Benq", "Wx20L");
		m.carica(elett[0]);
		m.carica(elett[1]);
		m.carica(elett[2]);

		// Tipo,SottoTipo,Prezzo,Materiale,Colore
		casa[0] = new Casalinghi("Casalinghi", "padella", 15, "Metallo", "Argento");
		casa[1] = new Casalinghi("Casalinghi", "mestolo", 2, "Legno", "Marrone");
		casa[2] = new Casalinghi("Casalinghi", "Secchio", 5, "PVC", "Azzurro");
		m.carica(casa[0]);
		m.carica(casa[1]);
		m.carica(casa[2]);
	}

	// Rimuovo l'oggetto con il relativo id dal magazzino.
	@Override
	public void scarica(Integer id) {
		magazzino.remove(id);
	}

	// Prelevo i dati di un determinato oggetto dal magazzino
	@Override
	public Articolo preleva(Integer id) {
		return magazzino.get(id);
	}

	// Stampo tutti gli elementi contenuti nel magazzino
	@Override
	public void stato() throws Exc_Vuoto {
		System.out.println("CONTENUTO DEL MAGAZZINO:");

		// Se il magazzino e' vuoto lancio un eccezione
		if (magazzino.isEmpty()) {
			throw new Exc_Vuoto();
		} else {
			// Scorro l'hasmap con il for each.
			for (Map.Entry<Integer, Articolo> entry : magazzino.entrySet()) {
				int tempKey = entry.getKey();
				Articolo a = magazzino.get(tempKey);
				// System.out.println("ID:" + tempKey + " DETTAGLI: ");

				System.out.println("\nDETTAGLI DELL'OGGETTO: ");

				// Stampo in base al tipo di oggetto
				Utility.stampa(a);
				;
			}
		}
	}

	@Override
	public double totale() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void cercaValore(String tipo) {

		for (Map.Entry<Integer, Articolo> entry : magazzino.entrySet()) {
			int tempKey = entry.getKey();
			Articolo a = magazzino.get(tempKey);

			// Stampo i dati in base al tipo dell'oggetto.
			if (a.getTipo().equals(tipo)) {
				System.out.println("\nDETTAGLI: ");
				a.toString();
			}
		}
	}
}