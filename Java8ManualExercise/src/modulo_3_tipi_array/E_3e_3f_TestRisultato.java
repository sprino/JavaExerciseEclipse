package modulo_3_tipi_array;

public class E_3e_3f_TestRisultato {

	public static void main(String[] args) {

		E_3e_Risultato testRisultato = new E_3e_Risultato(100);
		System.out.println("Il valore del risultato e' :" + testRisultato.risultato);

		//Passso un oggetto di E_3e_Risultato, quindi chiamo il primo costruttore.
		E_3e_3f_CambiaRisultato testRisultatoCambiato = new E_3e_3f_CambiaRisultato(testRisultato);
		System.out.println("Il valore del risultato cambiato e' : " + testRisultatoCambiato.risultatoCambiato);
		
		//Passu una variabile float quindi chiamo il secondo costruttore.
		E_3e_3f_CambiaRisultato testRisultatoCambiato2 = new E_3e_3f_CambiaRisultato(1000);
		System.out.println("Il valore dalla variabile passata al secondo metodo di cambiaRisultato e' :" + testRisultatoCambiato2.risultatoCambiato);
	}

}
