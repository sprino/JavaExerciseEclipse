package modulo_7_polimorfismo;

public abstract class File {

	private String nome;
	private int tipo;
	
	public File(String nome, int tipo)
	{
		this.nome = nome;
		this.tipo = tipo;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}	
}
