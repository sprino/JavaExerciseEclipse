package it.begear.esempiohibernate;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * GiocoManager.java A Hibernate hello world program
 * 
 */
public class GiocoManager {
	
	//La sessionFactory e' aperta una sola volta.
	protected static SessionFactory sessionFactory;
	protected static Gioco gioco = new Gioco();

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
		
		gioco.setTitolo("Planescape Torment");
		
		gioco.setAutore("Bocciato");
		
		gioco.setPrezzo(10);
		
//		gioco.setId(10);

		//Creo oggetto di tipo Session, la session factory si apre e chiude una volta sola. Se la chiudiamo non funziona piu'.
		//Da session possiamo compiere tutte le operazioni sul db.
		Session session = sessionFactory.openSession();

		//Apro transazione che è univoca.
		session.beginTransaction();

		//Inserisce l'oggetto gioco nel database.
		session.save(gioco);

		//Committo la tranzazione.
		session.getTransaction().commit();
		
		//Chiudo la sessione.
		session.close();
	}

	protected void read() {
		Session session = sessionFactory.openSession();
		
		List<Gioco> result = session.createQuery("FROM Gioco").getResultList();
		for(Gioco tmp : result) {
			System.out.println(tmp.toString());
		}
		
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
		
		gioco.setTitolo("Planescape Torment");		
		gioco.setAutore("Bocciato");
		gioco.setPrezzo(5000);
		
//		gioco.setId(10);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(gioco);
		session.getTransaction().commit();

		session.close();
	}

	protected void delete() {
//		Gioco gioco = new Gioco();
	
//		gioco.setId(2);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(gioco);
		session.getTransaction().commit();
		session.close();
	}

	public static void main(String[] args) {
		GiocoManager manager = new GiocoManager();
		// potete inserire qua la logica per lo scanner

		manager.setup();
		manager.create();
		manager.update();
		manager.read();
		manager.delete();
		
		manager.exit();
	}

}