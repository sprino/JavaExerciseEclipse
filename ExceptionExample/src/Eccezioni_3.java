

import java.util.Scanner;

public class Eccezioni_3 {

	public static void main(String[] args) {

		Scanner insert = new Scanner(System.in);

		int a, b, c = 0;

		System.out.print("Inserisci il dividendo: ");
		a = insert.nextInt();

		b = (int) Math.random();

		while (true) {

			if (b == 0 | b == 1 | b == 2 | b == 3) {

				try {
					c = a / b;
					System.out.println("Il risultato e' : " + c);
					break;
				} catch (ArithmeticException exc) {
					System.out.println(exc.getMessage());
				} catch (NullPointerException exc) {
					System.out.println(exc.getMessage());
				}
				// Ad ogni modo esegue sempre.
				finally {
					System.out.println("Operazione terminata...");
					if (insert != null) {
						insert.close();
					}
				}
			} else {
				b = (int) Math.random();
			}
		}
	}
}
