package modulo_7_polimorfismo;

public class FileSorgente extends File {

	private String contenuto;
	
	public FileSorgente(String nome, int tipo)
	{
		super(nome, tipo);
	}

	public FileSorgente(String nome, int tipo, String contenuto)
	{
		this(nome, tipo);
		this.contenuto = contenuto;
	}
	
	public void aggiungiTesto(String testo)
	{
			if (testo != null && this.contenuto != null)
			{
				this.contenuto += testo;
			}
			else
			{
				System.out.println("Contenuto del testo nullo...");
			}
	}

	public void aggiungiTesto(String testo, int posizione)
	{
			if (testo != null && this.contenuto != null && posizione > 0 && posizione < this.contenuto.length())
			{	
				this.contenuto = this.contenuto.substring(0, posizione) + testo + this.contenuto.substring(posizione);
			}
			else if (testo == null && this.contenuto == null)
			{
				System.out.println("Contenuto del testo nullo...");
			}
			else
			{
				System.out.println("Posizione del testo non corretta...");
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
