package controller;

import crud.CrudDipartimento;
import crud.CrudImpiegato;
import dao.DaoDipartimento;
import dao.DaoImpiegato;
import model.Dipartimento;
import model.Impiegato;
import util.Utility;
import view.MenuDipartimento;
import view.MenuImpiegato;

public class Main {

	public static void main(String[] args) {
		
		String scelta = "";
		
		Impiegato imp = new Impiegato();
		Dipartimento dip = new Dipartimento();
		DaoImpiegato daoImp = new CrudImpiegato();
		DaoDipartimento daoDip = new CrudDipartimento();
		
		//Utility.getMioLogger().setLevel(Level.INFO);
		
		System.out.flush();

		while(scelta.equals("exit") != true)
		{
			MenuImpiegato.stampaMenu();
			MenuDipartimento.stampaMenu();
			
			System.out.print("Scelta:");
			scelta = Utility.insert().next();
			
			switch(scelta)
			{
				case "1" :
					
					System.out.println("Inserisci dati del nuovo utente:\n");
					System.out.print("Nome:");
					imp.setNome(Utility.insert().next());
					
					System.out.print("Cognome:");
					imp.setCognome(Utility.insert().next());
					
					System.out.print("Dipart:");
					imp.setDipart(Utility.insert().next());
					
					System.out.print("Ufficio:");
					imp.setUfficio(Utility.insert().nextInt());
					
					System.out.print("Stipendio:");
					imp.setStipendio(Utility.insert().nextInt());

					daoImp.inserisciImpiegato(imp);
					
					break;
				
				case "2" :
					
					System.out.println("Inserisci il nome ed il cognome dell'impiegato che vuoi cercare:");
					
					System.out.print("Nome:");
					imp.setNome(Utility.insert().next());
					
					System.out.print("Cognome:");
					imp.setCognome(Utility.insert().next());
					
					daoImp.ricercaImpiegato(imp);
					//CrudImpiegato.getCrudInstance().ricercaImpiegato(imp);
					
					break;
				
				case "3" :
					
					System.out.println("Inserisci il nome ed il cognome dell'impiegato del quale vuoi aggiornare i dati:");
					System.out.print("Nome:");
					imp.setNome(Utility.insert().next());
					
					System.out.println("\n");
					
					System.out.print("Cognome:");
					imp.setCognome(Utility.insert().next());
					
					daoImp.ricercaImpiegato(imp);
					//CrudImpiegato.getCrudInstance().ricercaImpiegato(imp);
					
					System.out.print("Inserisci l'id dell'impiegato del quale vuoi aggiornare i dati:");
					imp.setIdImpiegato(Utility.insert().nextInt());
					daoImp.aggiornaImpiegato(imp);
//					CrudImpiegato.getCrudInstance().aggiornaImpiegato(Utility.insert().nextInt());
					
					break;
					
				case "4" :
					
					System.out.println("Inserisci il nome ed il cognome dell'impiegato che vuoi eliminare:");
					
					System.out.print("Nome:");
					imp.setNome(Utility.insert().next());
					
					System.out.println("\n");
					
					System.out.print("Cognome:");
					imp.setCognome(Utility.insert().next());
					
					daoImp.ricercaImpiegato(imp);
					//CrudImpiegato.getCrudInstance().ricercaImpiegato(imp);
					
					System.out.print("Inserisci l'id dell'impiegato che vuoi eliminare:");
					imp.setIdImpiegato(Utility.insert().nextInt());
					daoImp.aggiornaImpiegato(imp);
					//CrudImpiegato.getCrudInstance().eliminaImpiegato(Utility.insert().nextInt());
					
					break;
										
				case "5" :
					
					daoImp.stampaImpiegati();
//					CrudImpiegato.getCrudInstance().stampaImpiegati();
					
					break;	
					
				case "6" :
					
					System.out.println("Inserisci dati del nuovo dipartimento:\n");
					System.out.print("Nome:");
					dip.setNome(Utility.insert().next());
					
					System.out.print("Cognome:");
					dip.setIndirizzo(Utility.insert().next());
					
					System.out.print("Citta:");
					dip.setCitta(Utility.insert().next());
										
					daoDip.inserisciDipartimento(dip);
//					CrudDipartimento.getCrudInstance().inserisciDipartimento(dip);
					
					break;
				
				case "7" :
					
					System.out.println("Inserisci il nome del dipartimento:");
					
					System.out.print("Nome:");
					dip.setNome(Utility.insert().next());
					
					daoDip.ricercaDipartimento(dip);
//					CrudDipartimento.getCrudInstance().ricercaDipartimento(dip);
					
					break;
				
				case "8" :
					
					System.out.println("Inserisci il nome del dipartimendo del quale vuoi cambiare indirizzo:");
					System.out.print("Nome:");
					
					dip.setNome(Utility.insert().next());
					daoDip.aggiornaDipartimento(dip);

//					daoDip.aggiornaDipartimento(Utility.insert().next());
//					CrudDipartimento.getCrudInstance().aggiornaDipartimento(Utility.insert().next());
					
					break;
					
				case "9" :
					
					System.out.println("Inserisci il nome del dipartimento che vuoi eliminare:");
					
					System.out.print("Nome:");

					dip.setNome(Utility.insert().next());
					daoDip.eliminaDipartimento(dip);
//					daoDip.eliminaDipartimento(Utility.insert().next());
//					CrudDipartimento.getCrudInstance().eliminaDipartimento(Utility.insert().next());
					
					break;
			
				case "10" :

					daoDip.stampaDipartimenti();
//					CrudDipartimento.getCrudInstance().stampaDipartimenti();
					
					break;	
					
				default:
					if(!scelta.equals("exit")) {
						System.out.println("Scelta non consentita..."
										 + "premi un tasto per tornare al menu principale...");
					}
					break;
			}
		}
		Utility.insert().close();
	}
}