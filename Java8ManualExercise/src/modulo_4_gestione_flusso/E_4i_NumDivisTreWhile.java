package modulo_4_gestione_flusso;

public class E_4i_NumDivisTreWhile {

	public static void main(String[] args) {

		int n = 1 ,i = 0;
		
		while (n <= 10)
		{
			if(i%3 == 0)
			{
				System.out.println("Il " + n + "� divisore per tre e' :" + i);
				++n;
			}
			else
			{
				
			}
			
			++i;
		}

	}

}
