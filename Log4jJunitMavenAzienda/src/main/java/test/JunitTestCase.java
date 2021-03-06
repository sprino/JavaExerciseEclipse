package test;


import org.junit.Test;

import crud.CrudDipartimento;
import crud.CrudImpiegato;
import dao.DaoDipartimento;
import dao.DaoImpiegato;
import model.Dipartimento;
import model.Impiegato;
import util.Utility;
import junit.framework.Assert;;

@SuppressWarnings("deprecation")
public class JunitTestCase {

	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testInserimentoImpiegato() {
		
		DaoImpiegato daoImp = new CrudImpiegato();
		Impiegato imp = new Impiegato();
		
		Utility.getMioLogger("Inizio test inserimento utente:");
		//Nome
		imp.setNome("Alfa");
		
		//Cognome
		imp.setCognome("Beta");
		
		//Dipartimento
		imp.setDipart("Amministrazione");
		
		//Ufficio
		imp.setUfficio(34);
		
		//Stipendio
		imp.setStipendio(22);
		
		Assert.assertEquals(true, daoImp.inserisciImpiegato(imp));

		Assert.assertEquals(true, daoImp.stampaImpiegati());

		Assert.assertEquals(true, daoImp.ricercaImpiegato(imp));
		
		Assert.assertEquals("Test uguaglianza inserimento", true, daoImp.ricercaPerId(imp).toString().equals(imp.toString()));
	
		Assert.assertEquals(true,daoImp.eliminaImpiegato(imp));
		
	}
	
	@Test
	public void testInserimentoDipartimento() {
		
		DaoDipartimento daoDip = new CrudDipartimento();
		Dipartimento dip = new Dipartimento();
		
		Utility.getMioLogger("Inizio test inserimento dipartimento:");
		//Nome
		dip.setNome("ProvaDipartimento");
		
		//Indirizzo
		dip.setIndirizzo("via Alfa, 21");
		
		//Citta
		dip.setCitta("Roma");
		
		Assert.assertEquals(true, daoDip.inserisciDipartimento(dip));

		Assert.assertEquals(true, daoDip.stampaDipartimenti());

		Assert.assertEquals(true, daoDip.ricercaDipartimento(dip));
		
		Assert.assertEquals("Test uguaglianza inserimento", true, daoDip.ricercaPerId(dip).toString().equals(dip.toString()));
	
		Assert.assertEquals(true,daoDip.eliminaDipartimento(dip));
	}
	
}
