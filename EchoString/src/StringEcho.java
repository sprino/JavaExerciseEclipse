

import java.util.Scanner;

//Dichiaro una classe publica di nome EchoStringa.
public class StringEcho {
	public static void main(String[] args) {
		// Dichiaro una variabile di tipo stringa, forma abbreviata di: StringEcho str =
		// new StringEcho().
		String str = "";
		Scanner insert = new Scanner(System.in);

		System.out.print("Inserisci la stringa: ");
		str = insert.next();

		System.out.println(echo(str));

		insert.close();
	}

	// Dichiaro un metodo che restituisce l'echo della stringa.
	public static String echo(String s) {
		// Concateno la stringa ad uno spazio e nuovamente alla stringa.
		return (s + " " + s);
	}
}
