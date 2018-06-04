package modulo_8_eccezzioni_asserzioni;

public class Try_Catch {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		
		try {
			//La JVM trova la divisione per zero e lancia l'eccezzione, crea l'oggetto ArithmeticException.
			int c = a/b;
			System.out.println(c);
		}
		//catch eseguiti in sequenza, e' imporante l'ordine.
		//catch cattura l'eccezzion della JVM lanciata alla riga 12.
		catch (ArithmeticException exc) {
			System.out.println("Divisione per zero...");		
		}
		catch (NullPointerException exc) {
			System.out.println("Reference nullo...");		
		}
		//Se voglio gestire tutte le modulo_8_eccezzioni_asserzioni devo creare un oggetto della superclasse Exception, exc in questo caso è un parametro polimorfo.
		catch (Exception exc) {			
			//Genera il messaggio di errore come se non fosse gestita l'eccezzione ma non blocca il programma.
			exc.printStackTrace();
		}
	}
}
