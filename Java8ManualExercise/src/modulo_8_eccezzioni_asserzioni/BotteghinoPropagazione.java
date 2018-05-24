package modulo_8_eccezzioni_asserzioni;

public class BotteghinoPropagazione {
	
	private int postiDisponibili;
	
	public BotteghinoPropagazione() {
		postiDisponibili = 100;
	}
	
	//Con throws applico la propagazione delle ecezzioni, il metodo prenota lancia l'eccezzione creata nella classe
	//PersonalException.
	
	public void prenota() throws PersonalException {
		
			if(postiDisponibili == 0) {
				throw new PersonalException();
			}
			else {
				postiDisponibili--;				
			}
	}	
}