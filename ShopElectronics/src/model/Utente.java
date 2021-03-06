package model;

import java.util.Map;
import java.util.TreeMap;

import model.Carrello;

public class Utente {

	private Carrello carrello = new Carrello();

	private Map<Integer, Carrello> utente = new TreeMap<Integer, Carrello>();
	private Integer idUtente;

	private static Integer count = 0;

	public Utente() {
		count++;
		this.idUtente = count;
		this.utente.put(this.idUtente, carrello);
	}

	public Carrello getCarrello() {
		return carrello;
	}

	public void setCarrello(Carrello carrello) {
		this.carrello = carrello;
	}

	public Map<Integer, Carrello> getUtente() {
		return utente;
	}

	public Integer getIdUtente() {
		return idUtente;
	}
}
