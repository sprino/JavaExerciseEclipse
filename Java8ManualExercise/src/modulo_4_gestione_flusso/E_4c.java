package modulo_4_gestione_flusso;

public class E_4c {

	public static void main(String[] args) 
	{
		//Variabile che contiene il prodotto.
		int prod = 0;
		
		//Il promo ciclo si sposta lungo le righe.
		for(int i = 1; i <= 10; i++)
		{
			//Vado a capo ogni riga
			System.out.println("\n");
			
			//Il secondo ciclo si sposta lungo le colonne, fa il prodotto.
			for(int j = 1; j <= 10; j++)
			{
				prod = i * j;
				System.out.print(prod + " | ");
			}
		}
	}
}