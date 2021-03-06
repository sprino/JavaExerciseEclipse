

//Dichiaro classe pubblica di nome VarargsAritmetica
public class VarargsAritmetica {
	// Dichiaro un metodo pubblico che restituisce double e riceve n numeri double.
	public double somma_varargs(double... numeri) {
		// Creo variabile che conterro' la somma dei numeri.
		double temp = 0;

		// for each; Prendi uno ad uno gli elementi "interi" assegnali uno per volta
		// alla variabile intera "interi_temp" ed esegui per ciascuno
		// il blocco di codice successivo.
		for (double numero : numeri) {
			// +=, equivale a scrivere somma=somma+intero
			temp += numero;
		}
		// Restituisce la somma nel momento in cui il metodo viene chiamato.
		return temp;
	}

	// Sottrazione.
	public double differenza_varargs(double... numeri) {
		// Creo variabile che conterro' la somma dei numeri.
		double temp = 0;

		// for each; Prendi uno ad uno gli elementi "interi" assegnali uno per volta
		// alla variabile intera "interi_temp" ed esegui per ciascuno
		// il blocco di codice successivo.
		for (double numero : numeri) {
			// +=, equivale a scrivere somma=somma+intero
			temp -= numero;
		}
		// Restituisce la somma nel momento in cui il metodo viene chiamato.
		return temp;
	}

	// Prodotto.
	public double prodotto_varargs(double... numeri) {
		// Creo variabile che conterro' la somma dei numeri.
		double temp = 0;

		// for each; Prendi uno ad uno gli elementi "interi" assegnali uno per volta
		// alla variabile intera "interi_temp" ed esegui per ciascuno
		// il blocco di codice successivo.
		for (double numero : numeri) {
			// +=, equivale a scrivere somma=somma+intero
			temp *= numero;
		}
		// Restituisce la somma nel momento in cui il metodo viene chiamato.
		return temp;
	}

	// Rapporto.
	public double rapporto_varargs(double... numeri) {
		// Creo variabile che conterro' la somma dei numeri.
		double temp = 0;

		// for each; Prendi uno ad uno gli elementi "interi" assegnali uno per volta
		// alla variabile intera "interi_temp" ed esegui per ciascuno
		// il blocco di codice successivo.
		for (double numero : numeri) {
			// +=, equivale a scrivere somma=somma+intero
			temp /= numero;
		}
		// Restituisce la somma nel momento in cui il metodo viene chiamato.
		return temp;
	}

	// Ordinamento.
	public void ordinamento_varargs(int... numeri) {
		// Dichiaro variabili.
		int left = 0;
		int right = 1;
		int dimension = 0;
		int temp = 0;
		boolean flag = true;

		dimension = numeri.length;

		while (flag == true) {
			left = 0;
			right = 1;

			flag = false;

			for (int i = 0; i < dimension - 1; i++) {
				if (numeri[left] > numeri[right]) {
					temp = numeri[left];
					numeri[left] = numeri[right];
					numeri[right] = temp;
					flag = true;
				}
				left += 1;
				right += 1;
			}
		}
		System.out.println("Stampo l'array ordinato:");
		for (int i = 0; i <= dimension - 1; i++) {
			System.out.println(numeri[i]);
		}
	}
}