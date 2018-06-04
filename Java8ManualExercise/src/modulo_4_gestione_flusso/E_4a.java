package modulo_4_gestione_flusso;


public class E_4a 
{
	public static void main(String[] args) 
	{		
			
			//Definisco variabile i
			int	i = 0;
			
			//Dichiaro un ciclo infinito
			for(;;)
			{	
				//incremento l'indice
				i++;
				
				//Se l'indice è maggiore di 10 eschi dal programma
				if(i > 10)
					break;
				
				//Se il resto della divisione tra l'indice i e 2 è falso, salta System.out.println(), altrimenti stampa il valore.
				if(i%2 != 0)
					//Salta System.out.println
					continue;
				System.out.println("Numeri pari: " + i);
			}
	}
}
