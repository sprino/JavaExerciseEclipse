package modulo_4_gestione_flusso;

import java.util.Scanner;

public class E_4m_ProgrammaInterattivo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String stringa = "";
		
		System.out.println("Digita qualcosa e batti enter, oppure " + 
							"scrivi \"fine\" per terminare il programma");
		
		while(!(stringa = scanner.next()).equals("fine"))
		{
			if(stringa.equals("stronzo") || stringa.equals("vaffa") || stringa.equals("cretino"))
			{
				System.out.println("Modera il linguaggio...");
			}
			else
			{
				System.out.println("Hai digitato la seguente stringa : " + stringa.toUpperCase());
			}
		}
		System.out.println("Fine programma...");
		scanner.close();
	}
}
