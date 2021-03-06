

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Alimenti extends Prodotti {
	private Date dataScadenza = new Date();

	public Alimenti(String descrizione, String codiceBarre, double prezzo, Date dataScadenza) {
		super(descrizione, codiceBarre, prezzo);
		this.dataScadenza = dataScadenza;
	}

	/**
	 * @return the dataScadenza
	 */
	public Date getDataScadenza() {
		return this.dataScadenza;
	}

	/**
	 * @param dataScadenza
	 *            the dataScadenza to set
	 * @throws ParseException
	 */
	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public double getApplicaSconto() {
		/* Creo oggetto data attuale e do il formato gg/mm/yyyy */
		Date dataAttuale = new Date();
		DateFormat dataAttualeFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
		dataAttualeFormat.setLenient(false);

		/*
		 * Creo oggetto Calendar, per fare elaborazioni con le date e setto il time di
		 * tipo data dell'oggetto Calendar.
		 */
		Calendar dataAttualeC = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
		dataAttualeC.setTime(dataAttuale);

		/* Creo oggetto calendar per la data di scadenza. */
		Calendar dataScadenzaC = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
		dataScadenzaC.setTime(this.dataScadenza);

		/* Sottraggo 10 giorni dalla data di scadenza */
		dataScadenzaC.add(Calendar.DATE, -10);

		if (dataAttuale.compareTo(dataScadenza) > 0) {
			System.out.println("Il prodotto e' scaduto...");
			/* Azzero il prezzo e lo ritorno. */

			return super.getPrezzo();
		}
		/*
		 * Se la data attuale e' minore della data di scadenza e maggiore della data di
		 * scadenza - 10 giorni
		 */
		else if (dataAttuale.compareTo(dataScadenza) < 0 & dataAttuale.compareTo(dataScadenzaC.getTime()) > 0) {
			/* Applico sconto del 20% */
			return super.getApplicaSconto(20);
		} else {
			return super.getPrezzo();
		}
	}
}