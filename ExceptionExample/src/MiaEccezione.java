

@SuppressWarnings("serial")
public class MiaEccezione extends Exception {

	public MiaEccezione() {
		super("Mia Eccezione");
	}

	@Override
	public String toString() {
		return "Questa e' la mia prima eccezione";
	}

}
