package modulo_5_incapsulamento;

public class E_5b_Auto 
{
	private String scuderia;
	private E_5b_Pilota e_5b_Pilota;
	
	public E_5b_Auto(String scuderia, E_5b_Pilota e_5b_Pilota)
	{
		this.setScuderia(scuderia);
		this.setPilota(e_5b_Pilota);
	}
	
	/**
	 * @return the scuderia
	 */
	public String getScuderia() {
		return scuderia;
	}
	/**
	 * @param scuderia the scuderia to set
	 */
	public void setScuderia(String scuderia) {
		this.scuderia = scuderia;
	}

	/**
	 * @return the e_5b_Pilota
	 */
	public E_5b_Pilota getPilota() {
		return e_5b_Pilota;
	}
	/**
	 * @param e_5b_Pilota the e_5b_Pilota to set
	 */
	public void setPilota(E_5b_Pilota e_5b_Pilota) {
		this.e_5b_Pilota = e_5b_Pilota;
	}
	
	public String dammiDettagli()
	{
		return "Scuderia: " + this.getScuderia() + " Pilota: "+ this.e_5b_Pilota.getNome();
	}
}
