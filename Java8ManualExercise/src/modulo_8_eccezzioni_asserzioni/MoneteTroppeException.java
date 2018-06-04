package modulo_8_eccezzioni_asserzioni;

public class MoneteTroppeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	public MoneteTroppeException() {
		super("Problema con l'inserimento delle monete...");
	}
	
	@Override
	public String toString() {
		return "ERROR: Portafogli pieno";
	}
}
