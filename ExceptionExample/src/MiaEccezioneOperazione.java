

public class MiaEccezioneOperazione {

	public int divisione(int a, int b) throws ArithmeticException, MiaEccezione {

		if (a == 4) {
			throw new MiaEccezione();
		}

		return a / b;
	}
}
