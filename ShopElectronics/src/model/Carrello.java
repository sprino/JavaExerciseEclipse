package model;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import exception.Exc_ApplicaSconto;
import exception.Exc_Vuoto;
import model.Articolo;
import util.Utility;

public class Carrello extends GestioneProdotti {

	// Hash map ordinata con chiave di tipo integer e valore di tipo Articolo.
	private Map<Integer, Articolo> carrello = new TreeMap<Integer, Articolo>();

	// Soglia oltre la quale si applica lo sconto.
	private double sogliaSconto = 100;

	// Metodo che inserisce l'oggetto con specifico id nell'hash map del carrello e
	// la elimina dal magazzino
	@Override
	public void carica(Articolo a) {
		this.carrello.put(a.getId(), a);
	}

	// Metodo che rimuove l'oggetto con specifico id dal magazzino e lo inserisce
	// nuovamente nel magazzino.
	@Override
	public void scarica(Integer id) {
		this.carrello.remove(id);
	}

	// Metodo che stampa tutto cio' che � presente nel carrello
	@Override
	public void stato() throws Exc_Vuoto {
		System.out.println("CONTENUTO DEL CARRELLO:");
		// Se il carrello e' vuoto lancio un eccezione
		if (carrello.isEmpty()) {
			throw new Exc_Vuoto();
		} else {
			// scorro tutta la TreeHash map con forEach
			for (Map.Entry<Integer, Articolo> entry : carrello.entrySet()) {

				int tempKey = entry.getKey();
				Articolo a = carrello.get(tempKey);

				System.out.println("ID:" + tempKey + " DETTAGLI: ");

				Utility.stampa(a);
				;
			}
		}

	}

	// Metodo che stampa il totale del carrello e se esso supera la soglia applica
	// lo sconto.
	@Override
	public double totale() throws Exc_Vuoto, Exc_ApplicaSconto {
		double totaleDaPagare = 0;

		if (carrello.isEmpty()) {
			throw new Exc_Vuoto();
		} else {
			// Scorro l'array con il forEach
			for (Map.Entry<Integer, Articolo> entry : carrello.entrySet()) {
				int tempKey = entry.getKey();
				Articolo a = carrello.get(tempKey);

				// Sommo tutti i prezzi
				totaleDaPagare += a.getPrezzo();
			}
			if (totaleDaPagare > sogliaSconto) {
				// Applico il 30% e lancio l'eccezione
				totaleDaPagare = totaleDaPagare - ((totaleDaPagare * 30) / 100);

				throw new Exc_ApplicaSconto(totaleDaPagare);
			} else {
			}
		}
		return totaleDaPagare;
	}

	public double getSogliaSconto() {
		return sogliaSconto;
	}

	public void setSogliaSconto(double sogliaSconto) {
		this.sogliaSconto = sogliaSconto;
	}

	@Override
	public Articolo preleva(Integer id) {
		return carrello.get(id);
	}

	@Override
	public void carica_default(Magazzino m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cercaValore(String tipo) {

		Iterator<Map.Entry<Integer, Articolo>> iterator = carrello.entrySet().iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getValue().getTipo().equals(tipo)) {
				System.out.println(iterator.next().getValue());
			}
		}
	}
}