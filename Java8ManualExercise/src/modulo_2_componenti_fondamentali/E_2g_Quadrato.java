package modulo_2_componenti_fondamentali;

/** Exe 2.g classe. */
public class E_2g_Quadrato
{	
	//Creo un attribbuto non modificabile (final) che corrisponde al numero di lati.
	public final double NUMERO_LATI = 4;
	
	//Variabile lato.
	public double lato;
	
	//Metodo perimetro.
	public double perimetro()
	{
		return (lato*NUMERO_LATI);
	}
	
	public double area()
	{
		return (lato*lato);
	}
}
