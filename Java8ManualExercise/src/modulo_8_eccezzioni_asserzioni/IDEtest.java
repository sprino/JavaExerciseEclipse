package modulo_8_eccezzioni_asserzioni;

public class IDEtest {

	public static void main(String[] args) throws NullPointerException, RuntimeException, Exception {
		
		IDEjava jide = new IDEjava();
		FileSorgente primoFile = new FileSorgente("File.java", FileTipo.JAVA, "public my class  {\n");
		
		jide.modificaFile(primoFile, "//Commento aggiunto...");

		System.out.println("---------------------------------------------------------");
		
		jide.scriviFile(primoFile, "\n} \nParentesi aggiunta dopo l'aggiunta del commento.");
		
	}

}
