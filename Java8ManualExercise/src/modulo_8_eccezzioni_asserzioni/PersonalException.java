package modulo_8_eccezzioni_asserzioni;

/* Per sopprimere il warning della mancanza di seriale, si puo' scrivere questo: 
 * 	@SuppressWarnings("serial)*/
public class PersonalException extends Exception{

		/**Quando si applica la propagazione dell'errore, bisogna serializzare la classe, perche Throwable
			estende la classeSerializable, serve per la gestione i/o, se ad esempio un oggetto deve lavorare 
			su JVM diverse in rete, il seriale garantisce compatibilità.*/
		private static final long serialVersionUID = 1L;

		public PersonalException () {
			super("Problema con la prenotazione");
		}
		
		@Override
		public String toString() {
			return getMessage() + ": posti Esauriti!";
		}
}