package modulo_5_incapsulamento;

public class E_5b_Pilota 
{
	private String nome;
	
	public E_5b_Pilota(String nome)
	{
		this.setNome(nome);
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * @param nome2 the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
