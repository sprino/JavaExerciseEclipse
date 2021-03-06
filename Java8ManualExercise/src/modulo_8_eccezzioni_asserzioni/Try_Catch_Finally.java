package modulo_8_eccezzioni_asserzioni;

public class Try_Catch_Finally {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println(c);
		}
		//Il simbolo '|' non è or, e' usato dalla versione 7 per separare i nomi delle classi modulo_8_eccezzioni_asserzioni.
		catch (ArithmeticException | NullPointerException exc) {
			System.out.println(exc.getMessage());		
		}
		catch (Exception exc) {			
			//Genera il messaggio di errore come se non fosse gestita l'eccezzione ma non blocca il programma.
			exc.printStackTrace();
		}
		//Questo blocco di codice (finally) verra' sempre eseguito.
		finally {
			System.out.println("Operazione terminata.");
		}
	}
}
