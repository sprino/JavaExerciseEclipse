//Stampare il prorpio nome dopo averlo caricato in un array.

package modulo_3_tipi_array;

public class E_3d_StampaMioNome {

	public static void main(String[] args) {
		
		//Dichiaro array.
		String nome[] = new String[20];
		
		//Carico array
		nome[0] = "S";
		nome[1] = "a";
		nome[2] = "v";
		nome[3] = "e";
		nome[4] = "r";
		nome[5] = "i";
		nome[6] = "o";

		nome[7] = " P. ";

		nome[8] = "Z";
		nome[9] = "a";
		nome[10] = "n";
		nome[11] = "g";
		nome[12] = "a";
		nome[13] = "r";
		nome[14] = "o";
		
		//Scorro tutto l'array.
		for(int i = 0; i <= nome.length-1; i++)
		{
			//Se la posizione i-esima � diversa da null stampo.
			if(nome[i] != null)
			{
				System.out.print(nome[i]);
			}
			else
			{
				
			}
		}

		System.out.println("\n");
		
		char nome2[] = {'R', 'i', 'n', 'o'};
		System.out.println(nome2);
	}

}
