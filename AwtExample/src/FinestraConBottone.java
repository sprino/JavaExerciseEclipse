/*indico in quale package si trova la classe.*/


/*importo classe per la grafica.*/
import java.awt.Button;
import java.awt.Frame;

/** Finestra con un bottone centrale */
public class FinestraConBottone {
	public static void main(String args[]) {
		Frame finestra = new Frame("Prima finestra");
		Button bottone = new Button("Cliccami");

		/*
		 * Richiamo oggetti per aggiungere il bottone, indicare la dimensione e per
		 * settare la visibilita'.
		 */
		finestra.add(bottone);
		finestra.setSize(200, 200);
		finestra.setVisible(true);
	}
}
