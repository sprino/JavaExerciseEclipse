package modulo_7_polimorfismo;

public class IDEtest {

	public static void main(String[] args) {

		IDEjava jide = new IDEjava();
		FileSorgente primoFile = new FileSorgente("Test.java", FileTipo.JAVA, "public my class  {\n");
		
		jide.modificaFile(primoFile, "//Commento aggiunto...");

		jide.scriviFile(primoFile, "\n} \nParentesi aggiunta dopo l'aggiunta del contenuto.");
	}

}
