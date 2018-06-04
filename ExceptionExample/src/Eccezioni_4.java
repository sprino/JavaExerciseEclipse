

public class Eccezioni_4 {

	public static void main(String[] args) {

		int[] array = new int[5];

		try {

			for (int i = 0; i <= array.length; i++) {

				array[i] = (int) Math.random();
				System.out.println(array[i]);
			}

		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Superata dimensione array, indice errore: " + exc.getMessage());
		}
	}
}
