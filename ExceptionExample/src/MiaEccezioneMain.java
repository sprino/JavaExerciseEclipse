

public class MiaEccezioneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiaEccezioneOperazione gs = new MiaEccezioneOperazione();

		try {
			int result = gs.divisione(5, 0);

			System.out.println(result);
		} catch (ArithmeticException exc) {
			System.out.println(exc.getMessage());
		} catch (MiaEccezione exc) {
			System.out.println(exc.getMessage());
		}

	}
}
