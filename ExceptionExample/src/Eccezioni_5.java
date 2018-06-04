

import java.util.Scanner;

public class Eccezioni_5 {

	public static void main(String[] args) {

		double numero = 0;

		Scanner insert = new Scanner(System.in);

		try {
			System.out.print("Inserire un numero reale o immaginario nel formato jvalore : ");
			numero = insert.nextDouble();
			System.out.println(numero);
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
		} finally {
			insert.close();
		}
	}
}
