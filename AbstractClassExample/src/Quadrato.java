

public class Quadrato extends Operazione {

	@Override
	public double operazione() {

		super.setRisultato(super.getValore() * super.getValore());

		return super.getRisultato();
	}
}
