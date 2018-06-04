

public class Main {

	public static void main(String[] args) {
		FriendShip status1 = new StatusMessage("Mario Bianchi", "Bologna", "Mario Bianchi e' Felice");
		FriendShip status2 = new StatusMessage("Michele Rossi", "Bologna",
				" Michele Rossi pensa che oggi non può andare peggio di ieri.");

		// Uso il compareTo dichiarato nell' interfaccia FriendShip e del quale ho fatto
		// Override nella classe StatusMessage.
		if (status1.compareTo(status2) == 0) {
			System.out.println("La lunghezza della citta del primo e del secondo e' la stessa.");
			System.out.println(status1.toString() + " /// " + status2.toString());
		} else if (status1.compareTo(status2) == 1) {
			System.out.println("La lunghezza della prima citta e' maggiore della seconda");
			System.out.println(status1.toString());
		} else if (status1.compareTo(status2) == -1) {
			System.out.println("La lunghezza della seconda citta e' maggiore della prima");
			System.out.println(status2.toString());
		} else {
			System.out.println("Tutti di citta con lunghezze diverse.");
		}

		// Uso il metodo equals della classe Comparable di java del quale e' stato fatto
		// override nella classe StatusMessage.
		if (status1.equals(status2)) {
			System.out.println("Sono della stessa citta'.");
			System.out.println(status1.toString() + " /// " + status2.toString());
		} else {
			System.out.println("Sono di citta' diverse.");
		}
	}
}
