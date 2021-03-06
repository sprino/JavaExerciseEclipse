package modulo_7_polimorfismo;

public class IDEjava implements IDE {
	
	public void apriFile(FileSorgente file) {
		System.out.println("File " + file.getNome() + " aperto.");
	};
	
	public void chiudiFile(FileSorgente file) {
		System.out.println("File " + file.getNome() + " chiuso.");
	};

	public void modificaFile(FileSorgente file, String testo) {
		file.aggiungiTesto(testo);
		System.out.println("Contenuto modificato : " + file.getContenuto());
		System.out.println("File " + file.getNome() + " modificato.");
	};

	public void scriviFile(FileSorgente file, String testo) {
		file.aggiungiTesto(testo, file.getContenuto().length() - 1);
		System.out.println("Scritto : " + file.getContenuto());		
		System.out.println("File " + file.getNome() + " Scrittura.");
	};
}
