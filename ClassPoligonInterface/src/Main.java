

import java.io.IOException;
import java.util.Scanner;

//import poligoni_interfaccia.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// Istanzio oggetto scanner e dichiaro ed inizializzo la variabile utile per
		// scegliere.
		Scanner insert = new Scanner(System.in);
		String scelta = "";

		PoligoniImplement quad_1 = new QuadratoImpl(0);
		PoligoniImplement cir_1 = new CerchioImpl(0);
		PoligoniImplement rett_1 = new RettangoloImpl(0, 0);
		PoligoniImplement tri_1 = new TriangoloImpl(0, 0, 0);

		while (scelta.equals("exit") != true) {
			System.out.flush();

			System.out.println(
					"MENU POLIGONI, SCEGLI IL NUMERO DEL POLIGONO DEL QUALE VUOI CONOSCERE PERIMETRO ED AREA:\n"
							+ "Scrivere exit per uscire \n\n" + "1)QuadratoImpl;\n" + "2)RettangoloImpl;\n"
							+ "3)TriangoloImpl;\n" + "4)CerchioImpl;\n");
			scelta = insert.next();

			switch (scelta) {
			/* QuadratoImpl */
			case "1":
				System.out.print("Inserisci la dimensione del lato in cm : ");

				// (Quadrato)quad_1, comunico che il metodo setLato1 e' stato dichiarato nella
				// classe QuadratoImpl.
				// Si tratta di down cast.
				((QuadratoImpl) quad_1).setLato1(insert.nextDouble());

				stampaAreaPerimetro(quad_1);

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();

				break;

			/* RettangoloImpl */
			case "2":
				System.out.print("Inserisci la base del rettandolo in centimetri: ");
				((RettangoloImpl) rett_1).setLato1(insert.nextDouble());

				System.out.print("Inserisci l'altezza del rettandolo in centimetri: ");
				((RettangoloImpl) rett_1).setLato2(insert.nextDouble());

				stampaAreaPerimetro(rett_1);

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();

				break;

			/* TriangoloImpl */
			case "3":

				System.out.print("Inserisci la dimensione del lato 1 :");
				((TriangoloImpl) tri_1).setLato1(insert.nextDouble());

				System.out.print("Inserisci la dimensione del lato 2 :");
				((TriangoloImpl) tri_1).setLato2(insert.nextDouble());

				System.out.print("Inserisci la dimensione del lato 3 :");
				((TriangoloImpl) tri_1).setLato3(insert.nextDouble());

				stampaAreaPerimetro(tri_1);

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();

				break;

			/* CerchioImpl */
			case "4":
				System.out.print("Inserisci il raggio del cerchio in centimetri :");
				((CerchioImpl) cir_1).setLato1(insert.nextDouble());

				stampaAreaPerimetro(cir_1);

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();

				break;

			default:
				if (!scelta.equals("exit")) {
					System.out.println("Scelta non consentita...premi un tasto per tornare al menu principale...");
					System.in.read();
				}

				break;
			}
		}
		insert.close();
	}

	// Metodo che stampa area e perimetro ed applica il polimorfismo.
	private static void stampaAreaPerimetro(PoligoniImplement pol) {
		System.out.println("Il perimetro e' :" + pol.getPerimetro() + " l'area e' : " + pol.getArea());
	}
}
