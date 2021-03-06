package it.begear.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import it.begear.onetomany.Utente;
import it.begear.onetomany.Documento;

public class Crud {

	//La sessionFactory e' aperta una sola volta.
	protected static SessionFactory sessionFactory;
	protected static Utente utente = new Utente();
	protected static Documento documento = new Documento();
	
	protected void setup() {
		//Legge i metadati e li mette  in un ogetto di tipo StandardServiceRegistry. Legge il nostro file cfg.xml.
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
				// hibernate.cfg.xml	
		try {
			//Passo il file registry al metodo MetadataSources, l'oggetto viene analizzato (fetch) ed avvia una sessione. 
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	protected void exit() {
		sessionFactory.close();
	}
	
	protected void create() {
		
		documento.setFormato("Doc");
		documento.setTipo("Aziendale");
		
		Set<Documento> lista = new HashSet<Documento>();
		
		lista.add(documento);

		//documento.setFormato("Doc");
		//documento.setTipo("Aziendale");
		//lista.add(documento);
		
		utente.setNome("Vincenzo");
		utente.setCognome("Selvaggio");
		utente.setDocumenti(lista);

		//Creo oggetto di tipo Session, la session factory si apre e chiude una volta sola. Se la chiudiamo non funziona piu'.
		//Da session possiamo compiere tutte le operazioni sul db.
		Session session = sessionFactory.openSession();

		//Apro transazione che è univoca.
		session.beginTransaction();

		//Inserisce l'oggetto gioco nel database.
		session.save(documento);
		session.save(utente);

		//Committo la tranzazione.
		session.getTransaction().commit();
		
		//Chiudo la sessione.
		session.close();
	}

	protected void read() {
		Session session = sessionFactory.openSession();
		
//		List<Gioco> result = session.createQuery("FROM Gioco").getResultList();
//		for(Gioco tmp : result) {
//			System.out.println(tmp.toString());
//		}
//		
//		int id = 10;
//		Gioco gioco = session.get(Gioco.class, id);
		
//		gioco = session.get(Gioco.class, gioco.getId());
//		System.out.println("ID: " + gioco.getId());
//		System.out.println("Titolo: " + gioco.getTitolo());
//		System.out.println("Autore: " + gioco.getAutore());	
//		System.out.println("Prezzo: " + gioco.getPrezzo());

		session.close();
	}

	protected void update() {
//		Gioco gioco = new Gioco();
		
//		gioco.setTitolo("Planescape Torment");		
//		gioco.setAutore("Bocciato");
//		gioco.setPrezzo(5000);
//		
//		gioco.setId(10);
//		
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.update(gioco);
//		session.getTransaction().commit();
//
//		session.close();
	}

	protected void delete() {
//		Gioco gioco = new Gioco();
	
//		gioco.setId(2);

//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.delete(gioco);
//		session.getTransaction().commit();
//		session.close();
	}
	
	public static void main(String[] args) {
		Crud crud = new Crud();
		// potete inserire qua la logica per lo scanner

		crud.setup();
		crud.create();
//		manager.update();
//		manager.read();
//		manager.delete();
		crud.exit();
	}
}