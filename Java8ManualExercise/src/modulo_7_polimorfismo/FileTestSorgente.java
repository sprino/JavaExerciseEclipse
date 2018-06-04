package modulo_7_polimorfismo;

public class FileTestSorgente {
	
	public static void main(String args [])
	{
		FileSorgente fileSorgente = new FileSorgente("Test.java", FileTipo.JAVA, "public my class  {\n");
				
		fileSorgente.aggiungiTesto("\n//commento", fileSorgente.getContenuto().length() - 1);

		fileSorgente.aggiungiTesto("}");
		
		fileSorgente.aggiungiTesto("***aggiunto in posizione 5***", 5);		
		
		System.out.println(fileSorgente.getContenuto());
	}	
}
