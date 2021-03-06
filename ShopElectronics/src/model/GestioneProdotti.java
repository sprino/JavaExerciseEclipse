package model;

import exception.Exc_ApplicaSconto;
import exception.Exc_Vuoto;
import exception.Exc_max_dim;
import model.Magazzino;

public abstract class GestioneProdotti {

	// Metodi astratti comuni a tutte le classi che gestiscoo i prodotti.
	public abstract void carica(Articolo a) throws Exc_max_dim;

	public abstract void scarica(Integer id);

	public abstract Articolo preleva(Integer id);

	public abstract void stato() throws Exc_Vuoto;

	public abstract double totale() throws Exc_Vuoto, Exc_ApplicaSconto;

	public abstract void carica_default(Magazzino m) throws Exc_max_dim;

	public abstract void cercaValore(String tipo);

}
