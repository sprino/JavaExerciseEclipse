package modulo_8_eccezzioni_asserzioni;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWidthResource {

	public static void main(String[] args) {
		
		final String host = "xxxxxxxxxxxxxxxxxxxxxxxx";
		final String user = "xxxxxxxx";
		final String passwd = "xxxxxxxxxxx";

		/*Try width resource, creo cio' che devo chiudere come parametro del try.
			Eventuali finally verranno attivati dopo aver chiuso le risore presenti nel parametro del try.
		 	Se si dovesse presentare una eccezione applicativa, questa sarà prioritaria rispetto quella dei parametri
		 	e del try e le eccezzioni di chiusura delle risorse del try saranno dichiarate suppressed.
		 	Si possono richiamare con getSuppressed se e' stata implementata l'interfaccia AutoClosable o Closable.*/
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://" + host + "/feedback?"+ "user=" + user + 
														  "&password=" + passwd );
			Statement stmt = conn.createStatement(); 
		    ResultSet rs = stmt.executeQuery("SELECT * FROM PERSONA")) {
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
