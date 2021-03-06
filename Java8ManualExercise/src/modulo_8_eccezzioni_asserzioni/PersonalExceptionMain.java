package modulo_8_eccezzioni_asserzioni;

import java.util.Scanner;

public class PersonalExceptionMain {

	public static void main(String[] args) {

		int postiDisponibili = 0;

		//Try width resource, apre lo scanner e lo chiude automaticamente alla fine.
		try (Scanner insert = new Scanner(System.in)){
			
			//Se si verifica questa condizione lancia l'eccezzione personale.
			if(postiDisponibili == 0) {
				throw new PersonalException();
			}	
			postiDisponibili--;
		}
		catch(PersonalException exc) {
			//Fa uscire il messaggio di errore.
			System.out.println(exc.toString());
		}
	}
}
