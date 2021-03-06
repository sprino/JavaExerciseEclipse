package modulo_8_eccezzioni_asserzioni;

import java.util.Scanner;

public class BotteghinoPropagazioneMain {

	public static void main(String[] args) {

		BotteghinoPropagazione botteghino = new BotteghinoPropagazione();
		
		//Applico la propagazione degli errori, questo blocco try cattura l'eccezzione lanciata dalla classe
		//BotteghinoPropagazione che a sua volta lancia PersonalException.
		try (Scanner insert = new Scanner(System.in)) {
			
			System.out.print("Inserisci il numero di posti che vuoi prenotare (> di 100 per lanciare l'eccezione) : ");
			int posti = insert.nextInt();
			
			for(int i = 1; i <= posti; i++) {
				botteghino.prenota();
				System.out.println("Prenotato posto n° " + i);
			}			
		}
		catch(PersonalException exc) {
			System.out.println(exc.toString());
		}
	}
}
