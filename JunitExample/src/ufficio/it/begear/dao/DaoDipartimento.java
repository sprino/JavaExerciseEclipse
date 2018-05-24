package ufficio.it.begear.dao;

import ufficio.it.begear.model.Dipartimento;

public interface DaoDipartimento {

	//Create
	public boolean inserisciDipartimento(Dipartimento dip);
	
	//Read
	public boolean ricercaDipartimento(Dipartimento dip);
	
	//SearchForId
	public Dipartimento ricercaPerId(Dipartimento dip);
	
	//Update
	public boolean aggiornaDipartimento(Dipartimento dip);
	
	//Delete
	public boolean eliminaDipartimento(Dipartimento dip);
	
	//Stampa
	public boolean stampaDipartimenti();
}
