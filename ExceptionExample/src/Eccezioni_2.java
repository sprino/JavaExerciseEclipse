

public class Eccezioni_2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String s = null;

		try {
			@SuppressWarnings("null")
			int l = s.length();
		} catch (NullPointerException exc) {
			System.out.println(exc.getMessage());
		}

	}

}
