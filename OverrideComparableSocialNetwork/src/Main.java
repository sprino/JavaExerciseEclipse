

public class Main {

	public static void main(String[] args) {
		FriendShip status1 = new StatusMessage("Mario Bianchi", "Bologna", "Mario Bianchi e' Felice");
		FriendShip status2 = new StatusMessage("Michele Rossi", "Bologna",
				" Michele Rossi pensa che oggi non può andare peggio di ieri.");
		FriendShip status3 = new StatusMessage("Aldo Verdi", "Milano", "Aldo Verdi si diverte un sacco!");

		if (status1.isNearTo(status2) & status2.isNearTo(status3)) {
			System.out.println("Sono tutti della stessa citta'.");
			System.out.println(status1.toString() + " /// " + status2.toString() + " /// " + status3.toString());
		} else if (status1.isNearTo(status2)) {
			System.out.println("Il primo ed il secondo sono della stessa citta'.");
			System.out.println(status1.toString() + " /// " + status2.toString());
		} else if (status1.isNearTo(status3)) {
			System.out.println("Il primo ed il terzo sono della stessa citta'.");
			System.out.println(status1.toString() + " /// " + status3.toString());
		} else if (status2.isNearTo(status3)) {
			System.out.println("Il secondo ed il terzo sono della stessa citta'.");
			System.out.println(status2.toString() + " /// " + status3.toString());
		} else {
			System.out.println("Tutti di citta diverse.");
		}
	}
}
