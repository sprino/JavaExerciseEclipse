package modulo_8_eccezzioni_asserzioni;

public class FileSorgente extends File {

	private String contenuto;

	public FileSorgente(String nome, int tipo, String contenuto)
	{
		super(nome, tipo);
		this.contenuto = contenuto;
	}
	
	/*Gestisco il puntatore nullo con un eccezione perche' le asserzioni sono sconsigliate con metodi
	pubblici.*/
	public void aggiungiTesto(String testo) throws Exception, RuntimeException, NullPointerException {
			if (testo != null && this.contenuto != null) { 
				this.contenuto += testo;
			}
			else if (testo == null) {
				throw new NullPointerException("testo = null"); 
			}
			else {
				throw new Exception("Errore Generico"); 
			}
	}

	public void aggiungiTesto(String testo, int posizione) throws Exception, RuntimeException, NullPointerException 
	{
		try {
			if (testo != null && this.contenuto != null && posizione > 0 && posizione < this.contenuto.length()) {	
				this.contenuto = this.contenuto.substring(0, posizione) + testo + this.contenuto.substring(posizione);
			}
		}
		catch(NullPointerException exc) {
			exc.printStackTrace();
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		finally {
			System.out.println("***TESTO AGGIUNTO CORRETTAMENTE***");;
		}
	}
	
	/**
	 * @return the sorgente
	 */
	public String getContenuto() {
		return contenuto;
	}

	/**
	 * @param sorgente the sorgente to set
	 */
	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}	
}
