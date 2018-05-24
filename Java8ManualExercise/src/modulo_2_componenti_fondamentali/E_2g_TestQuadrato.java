package modulo_2_componenti_fondamentali;

/** Exe 2.g Main */
public class E_2g_TestQuadrato
{	
	public static void main(String args[])
	{
		//Istanzio oggetto quadrato_1.
		E_2g_Quadrato quadrato_1 = new E_2g_Quadrato();
		
		//Metto la dimensione del lato.
		quadrato_1.lato = 5;
		
		System.out.println("Perimetro: " + quadrato_1.perimetro());
		System.out.println("Area: " + quadrato_1.area());
	}
}
