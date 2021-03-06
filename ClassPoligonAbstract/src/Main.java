

import java.io.IOException;
import java.util.Scanner;

//import poligoni_astratti.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// Istanzio oggetto scanner e dichiaro ed inizializzo la variabile utile per
		// scegliere.
		Scanner insert = new Scanner(System.in);
		String scelta = "";

		QuadratoExt quad_1 = new QuadratoExt(0);
		CerchioExt cir_1 = new CerchioExt(0);
		RettangoloExt rett_1 = new RettangoloExt(0, 0);
		TriangoloExt tri_1 = new TriangoloExt(0, 0, 0);

		while (scelta.equals("exit") != true) {
			System.out.flush();

			System.out.println(
					" !//////////////////////////////////////////////////////////////////////////////////////////////////!\n"
							+ " !MENU POLIGONI, SCEGLI IL NUMERO DEL POLIGONO DEL QUALE VUOI CONOSCERE PERIMETRO ED AREA:           !\n"
							+ " !						Scrivere exit per uscire                                                    !\n"
							+ " !							 1)QuadratoImpl;                                                        !\n"
							+ " !							 2)RettangoloImpl;                                                      !\n"
							+ " !							 3)TriangoloImpl;														!\n"
							+ " !							 4)CerchioImpl;															!\n"
							+ " !///////////////////////////////////////////////////////////////////////////////////////////////////!");
			scelta = insert.next();

			switch (scelta) {
			/* QuadratoImpl */
			case "1":
				System.out.print("Inserisci la dimensione del lato in cm : ");
				quad_1.setLato1(insert.nextDouble());

				System.out.println("Il perimetro è: " + quad_1.getPerimetro() + " l'area è " + quad_1.getArea());

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();

				break;

			/* RettangoloImpl */
			case "2":
				System.out.print("Inserisci la base del rettandolo in centimetri: ");
				rett_1.setLato1(insert.nextDouble());

				System.out.print("Inserisci l'altezza del rettandolo in centimetri: ");
				rett_1.setLato2(insert.nextDouble());

				System.out.println("Il perimetro è: " + rett_1.getPerimetro() + " l'area è " + rett_1.getArea());

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();

				break;

			/* TriangoloImpl */
			case "3":

				System.out.print("Inserisci la dimensione del lato 1 :");
				tri_1.setLato1(insert.nextDouble());

				System.out.print("Inserisci la dimensione del lato 2 :");
				tri_1.setLato2(insert.nextDouble());

				System.out.print("Inserisci la dimensione del lato 3 :");
				tri_1.setLato3(insert.nextDouble());

				System.out.println("In base ai lati inseriti, il triangolo risulta essere un tiangolo "
						+ tri_1.getTipoTriangolo());

				System.out.println("Il perimetro e': " + tri_1.getPerimetro());
				System.out.println("L'area e': " + tri_1.getArea());

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();

				break;

			/* CerchioImpl */
			case "4":
				System.out.print("Inserisci il raggio del cerchio in centimetri :");
				cir_1.setLato1(insert.nextDouble());

				System.out.println("L'area del cerchio e' :" + cir_1.getArea() + " La sua circonferenza e' :"
						+ cir_1.getPerimetro());

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
}
