

public class Main {

	public static void main(String[] args) {

		Operazione quad = new Quadrato();
		Operazione cub = new Cubo();

		quad.setValore(10);
		cub.setValore(100);

		quad.operazione();
		cub.operazione();

		stampaRisultato(quad);
		stampaRisultato(cub);
	}

	private static void stampaRisultato(Operazione oper) {

		if (oper instanceof Quadrato) {
			System.out.println("Il quadrato e' : " + oper.getRisultato());
		} else if (oper instanceof Cubo) {
			System.out.println("Il cubo e' : " + oper.getRisultato());
		}
	}

}
