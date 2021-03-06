

import java.io.IOException;
import java.util.Scanner;

//import poligoni_interfaccia.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// Istanzio oggetto scanner e dichiaro ed inizializzo la variabile utile per
		// scegliere.
		Scanner insert = new Scanner(System.in);

		PoligoniImplement pol[] = new PoligoniImplement[4];

		pol[0] = new QuadratoImpl(10);
		pol[1] = new RettangoloImpl(5, 6);
		pol[2] = new QuadratoImpl(5);
		pol[3] = new RettangoloImpl(5, 6);

		for (PoligoniImplement temp : pol) {
			if (temp instanceof QuadratoImpl) {
				// moltiplico il lato per 2 se temp (oggetto poligono) è un implementazione di
				// quadrato. Applico il casting per acceddere a
				// getLato1 che non è implementata nella Classe PoligoniImplement.
				// Downcast->La superclasse accede ad un metodo della sottoclasse. (forse)
				// Upcast->La sottoclasse accede ad un metodo della supercalsse. (forse)
				((QuadratoImpl) temp).setLato1(((QuadratoImpl) temp).getLato1() * 2);
			}
			stampaAreaPerimetro(temp);
		}
		insert.close();
	}

	// Metodo che stampa area e perimetro ed applica il polimorfismo. Faccio un
	// polimorfismo per dati.
	private static void stampaAreaPerimetro(PoligoniImplement pol) {
		// pol.getPerimetro e pol.getArea sono metodi virtuali!
		System.out.println("Il perimetro e' :" + pol.getPerimetro() + " l'area e' : " + pol.getArea());
	}
}