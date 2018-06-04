package modulo_2_componenti_fondamentali;

/** Exe 2.d_Main */
public class E_2d_TestQuadrato
{	
	public static void main(String args[])
	{
		/*Istanzio oggetto quadrato_1.*/
		E_2d_Quadrato quadrato_1 = new E_2d_Quadrato();
		
		/*Assegno alla variabile lato dell'oggetto 
		 * quadrato_1 della classe Exe_2d... il numero 5.*/
		quadrato_1.lato = 5;
		
		/*Stampo il perimetro e l'area richiamando i metodi.*/
		System.out.println(quadrato_1.perimetro());
		System.out.println(quadrato_1.area());
	}
}
