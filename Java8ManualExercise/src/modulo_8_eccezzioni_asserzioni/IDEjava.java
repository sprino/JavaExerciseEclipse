package modulo_8_eccezzioni_asserzioni;

public class IDEjava implements IDE {
	
	public void apriFile(FileSorgente file) {
		System.out.println("File " + file.getNome() + " aperto.");
	};
	
	public void chiudiFile(FileSorgente file) {
		System.out.println("File " + file.getNome() + " chiuso.");
	};

	public void modificaFile(FileSorgente file, String testo) throws NullPointerException, RuntimeException, Exception {
		try {
			file.aggiungiTesto(testo);
			System.out.println("Contenuto modificato : " + file.getContenuto());
			System.out.println("File " + file.getNome() + " modificato.");			
		}
		catch(NullPointerException exc){
			System.out.print("modificaFile method ERROR : ");
			exc.printStackTrace();
		}
		catch(Exception exc) {
			System.out.print("modificaFile method ERROR : ");
			exc.printStackTrace();
		}
	};

	public void scriviFile(FileSorgente file, String testo) throws NullPointerException, RuntimeException, Exception {
		try {
			file.aggiungiTesto(testo, file.getContenuto().length() - 1);
			System.out.println("Scritto : " + file.getContenuto());		
			System.out.println("File " + file.getNome() + " Scrittura.");			
		}
		catch(NullPointerException exc){
			exc.printStackTrace();
		}
	};
}
