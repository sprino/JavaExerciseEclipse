

public class StatusMessage implements Comparable<Object>, FriendShip {

	// Variabili di istanza della classe stringa.
	private String username, city, text;

	public StatusMessage(String username, String city, String text) {
		this.username = username;
		this.city = city;
		this.text = text;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return this.text;
	}

	// Faccio override del metodo dichiarato nella classe FriendShip creata da me.
	@Override
	public int compareTo(Object x) {

		if (this.city.length() == (((StatusMessage) x).getCity()).length()) {
			return 0;
		} else if (this.city.length() > (((StatusMessage) x).getCity()).length()) {
			return 1;
		} else {
			return -1;
		}
	}

	// Faccio Override del metodo equals della classe Comparable di java.
	@Override
	public boolean equals(Object x) {

		if (this.city == (((StatusMessage) x).getCity())) {
			return true;
		} else {
			return false;
		}
	}
}
