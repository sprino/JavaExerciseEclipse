package dao;

import model.Impiegato;

public interface DaoImpiegato {

	//Create
	public boolean inserisciImpiegato(Impiegato imp);
	
	//Read
	public boolean ricercaImpiegato(Impiegato imp);
	
	//SearchForId
	public Impiegato ricercaPerId(Impiegato imp);
	
	//Update
	public boolean aggiornaImpiegato(Impiegato imp);
	
	//Delete
	public boolean eliminaImpiegato(Impiegato imp);

	//Stampa
	public boolean stampaImpiegati();
	
}
