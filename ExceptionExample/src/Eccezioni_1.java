

public class Eccezioni_1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		int T[] = null;

		try {
			T[0] = 7;
		} catch (NullPointerException exc) {
			System.out.println(exc.getMessage());
		}
	}

}
