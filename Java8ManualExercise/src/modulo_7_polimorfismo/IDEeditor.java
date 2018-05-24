package modulo_7_polimorfismo;

public interface IDEeditor {

	public void apriFile(FileSorgente file);
	
	public void chiudiFile(FileSorgente file);
	
	public void modificaFile(FileSorgente file, String testo);
	
	public void scriviFile(FileSorgente file, String testo);
}