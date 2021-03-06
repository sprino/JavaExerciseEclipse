package modulo_2_componenti_fondamentali;

/** Exe 2.f classe */
public class E_2f_Quadrato 
{	
	/*Attribbuto privato di nome lato.*/
	private double lato;
	
	/*Costruttore che inizializza la variabile privata lato al valore passato al costruttore in fase di istanziazione.*/
	public E_2f_Quadrato(double l)
	{
		this.lato = l;
	}
	
	/*Metodo per il calcolo del perimetro.*/
	public double perimetro()
	{	
		return (this.lato * 4);
	}
	
	/*Metodo per il calcolo dell'area.*/
	public double area()
	{	
		return (this.lato * this.lato);
	}
}