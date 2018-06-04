package modulo_7_polimorfismo;

public interface IDE extends IDEeditor {

	default void compilaFile(FileSorgente file) {
		System.out.println("File " + file.getNome() + " compilato.");
	}
	
	default void eseguiFile(FileSorgente file) {
		System.out.println("File " + file.getNome() + " eseguito.");		
	}
}
