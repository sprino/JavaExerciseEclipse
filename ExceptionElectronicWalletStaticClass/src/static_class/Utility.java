package static_class;

import java.io.IOException;

public final class Utility {

	// Metodo system pause
	public static void pause() throws IOException {
		System.out.println("Premi un tasto per tornare al menu principale");
		System.in.read();
	}
}
