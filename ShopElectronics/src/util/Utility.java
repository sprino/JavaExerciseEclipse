package util;

import java.io.IOException;

import model.Articolo;

public final class Utility {

	// Metodo system pause
	public static void pause() throws IOException {
		System.out.println("Premi un tasto per tornare al menu principale");
		System.in.read();
	}

	/*---------------------------------------------------------------------------*/

	public static void stampa(Articolo articolo) {
		System.out.println(articolo);
	}

	/*---------------------------------------------------------------------------*/

}
