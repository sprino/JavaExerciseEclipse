package static_class;

//Classe final, non può essere estesa.
public final class ElaborazioneDati {

/*------------------------------------------------------------------------------------------------------------------------------
 * 								ORDINAMENTO DATI SELECT SORT
 * -----------------------------------------------------------------------------------------------------------------------------*/
	
	
	public static double[] SelectSort(double... numeri)
	{
		/*Ricavo dimensione dell'array.*/
		int dimension = numeri.length, posMin = 0;
		double temp = 0;

		/*Fino a quando i è minore della dimensione dell'array esegue il ciclo*/
		for (int i = 0; i < dimension - 1; i++)
		{
			/*posMin riceve il punto di partenza del controllo.*/
			posMin = i;
			
			/*Ciclo che effettua l'ordinamento. j parte da i+1 fino a quando è minore della dimensione (dimensione + 1 = dimension)*/
			for(int j = (i + 1); j < dimension; j++)
			{
				/*Se il numero successivo è minore di quell oin posizione minima, assegna la nuova posizione minima.*/
				if(numeri[j] < numeri[posMin])
				{
					posMin = j;
				}						
			 }

			/*Se posizione minima è diversa da i, cioè se non sono arrivato alla fine, allora fai l'inversione.*/
			if(posMin != i)
			{
				temp = numeri[i];
				numeri[i] = numeri[posMin];
				numeri[posMin] = temp;
			}
		 }
		return numeri;
	}
	
/*------------------------------------------------------------------------------------------------------------------------------
 * 								ELIMINAZIONE ELEMENTI DALL'ARRAY DI DOUBLE
 * -----------------------------------------------------------------------------------------------------------------------------*/

	public static double[] eliminaDatiArray(double array[], double valore)
	{	
			double ordArray[] = new double[array.length];
			
			int ind;
			
			boolean flag = false;
			
			for(int i = 0; i <= array.length - 1; i++)
			{					
				if(array[i] == valore)
				{
					//Cancello quel valore dal portafogli, lo azzero.
					array[i] = 0;
					flag = true;
				}
				else
				{

				}
			}
			
			if(flag == true)
			{
				//Ordino l'array con tutti i vuoti all'inizio
				array = ElaborazioneDati.SelectSort(array);
				
				//indice del nuovo array.
				ind = 0;
				
				//Elimino i valori dall'array e salvo i valori diversi da zero nelle posizioni dell'array partendo dal nuovo indice.
				for(int i = 0; i <= array.length - 1; i++)
				{
					if(array[i] != 0)
					{
						ordArray[ind] = array[i];
						ind++;
					}
					else
					{
						
					}
				}
				return ordArray;
			}
			else
			{
				System.out.println("Il valore " + valore + " non e' presente nell'array...");
				return array;
			}
	}
	
}//END