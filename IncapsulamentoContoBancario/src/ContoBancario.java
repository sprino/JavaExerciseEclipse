public class ContoBancario {
	private int codiceConto = 4321;
	private int codiceInserito;
	private String dimansioneConto = "100000 euro";

	public void setCodiceInserito(int code) {
		this.codiceInserito = code;
	}

	public int getCodiceInserito() {
		return this.codiceInserito;
	}

	public String getContoBancario() {
		if (this.codiceInserito == this.codiceConto) {
			return "Il saldo del tuo conto è: " + this.dimansioneConto;
		} else {
			return "Codice inserito errato, hai inserito questo codice " + this.codiceInserito;
		}
	}

}
