package control;

import model.SingletonObject;

public class SingletonDemoTest {

	public static void main(String[] args) {
		
		SingletonObject singleton = SingletonObject.getInstance();
		System.out.println("Il primo referce �:" + singleton +"\n");
		
		System.out.println("Tramite il metodo stampa faccio una stampa: " + singleton.stampa() + "\n");
		
		SingletonObject singleton2 = SingletonObject.getInstance();
		System.out.println("Il secondo referce �:" + singleton2 + "\n");		
		
	}

}