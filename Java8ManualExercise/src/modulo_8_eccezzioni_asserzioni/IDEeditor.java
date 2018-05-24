package modulo_8_eccezzioni_asserzioni;

public interface IDEeditor {

	public void apriFile(FileSorgente file);
	
	public void chiudiFile(FileSorgente file);
	
	public void modificaFile(FileSorgente file, String testo) throws NullPointerException, RuntimeException, Exception;
	
	public void scriviFile(FileSorgente file, String testo) throws NullPointerException, RuntimeException, Exception;
}