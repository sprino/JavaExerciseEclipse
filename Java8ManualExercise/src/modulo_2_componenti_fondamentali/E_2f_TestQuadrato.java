package modulo_2_componenti_fondamentali;

/** Exe 2.f Main */
public class E_2f_TestQuadrato
{	
	public static void main(String args[])
	{				
		/*Istanzio oggetto quadrato_1.*/
		E_2f_Quadrato quadrato_1 = new E_2f_Quadrato(5);
		
		/* Stampo il perimetro e l'area.*/
		System.out.println("Perimetro: " + quadrato_1.perimetro());
		System.out.println("Area: " + quadrato_1.area());
	}
}
