package modulo_3_tipi_array;

public class E_3e_3f_CambiaRisultato {
	
	public float risultatoCambiato;
	
	public E_3e_3f_CambiaRisultato(E_3e_Risultato risultato) {
		
		this.risultatoCambiato = risultato.risultato + 1000;
	}

	public E_3e_3f_CambiaRisultato(float variabile) {
		
		this.risultatoCambiato = variabile + 1000;
	}
}
