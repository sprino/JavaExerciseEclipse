

import java.io.IOException;
import java.util.Scanner;

//import poligoni.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner insert = new Scanner(System.in);

		String scelta = "";

		Quadrato quad_1 = new Quadrato();
		Rettangolo rett_1 = new Rettangolo();
		Triangolo tri_1 = new Triangolo();
		Cerchio cir_1 = new Cerchio();

		System.out.flush();

		while (scelta.equals("exit") != true) {
			System.out.println(
					"MENU POLIGONI, SCEGLI IL NUMERO DEL POLIGONO DEL QUALE VUOI CONOSCERE PERIMETRO ED AREA:\n"
							+ "Scrivere exit per uscire \n\n" + "1)QuadratoImpl;\n" + "2)RettangoloImpl;\n"
							+ "3)TriangoloImpl;\n" + "4)CerchioImpl;\n");
			scelta = insert.next();

			switch (scelta) {
			/* QuadratoImpl */
			case "1":
				System.out.print("Inserisci la dimensione del lato in cm : ");
				quad_1.setLato(insert.nextDouble());

				System.out.println("Il perimetro è: " + quad_1.getPerimetro() + " l'area è " + quad_1.getArea());

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();

				break;

			/* RettangoloImpl */
			case "2":
				System.out.print("Inserisci la base del rettandolo in centimetri: ");
				rett_1.setBase(insert.nextDouble());

				System.out.print("Inserisci l'altezza del rettandolo in centimetri: ");
				rett_1.setAltezza(insert.nextDouble());

				System.out.println("Il perimetro è: " + rett_1.getPerimetro() + " l'area è " + rett_1.getArea());

				/* Premi un tasto per continuare. */
				System.out.println("Premi un tasto per tornare al menu principale");
				System.in.read();

				break;

			/* TriangoloImpl */
			case "3":
				double temp[] = new double[3];

				for (int i = 0; i <= 2; i++) {
					System.out.print("Inserisci la lunghezza dei due lati n_" + i + " :");
					temp[i] = insert.nextDouble();
				}

				tri_1.setLati(temp);

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
				cir_1.setRaggio(insert.nextDouble());

				System.out.println("L'area del cerchio e' :" + cir_1.getArea() + " La sua circonferenza e' :"
						+ cir_1.getCirconferenza());

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
