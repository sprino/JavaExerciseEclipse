package modulo_8_eccezzioni_asserzioni;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		  final String host = "xxxxxxxxxxxxxxxxxxxxxxxx";
		  final String user = "xxxxxxxx";
		  final String passwd = "xxxxxxxxxxx";
		
		try {
		    conn = DriverManager.getConnection("jdbc:mysql://" + host + "/feedback?"+ "user=" + user + 
		    								   "&password=" + passwd );
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM PERSONA");
			
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(rs != null) {
				try {
					rs.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		rs = null;
		
		if(stmt != null) {
			try {
				stmt.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		stmt = null;
		
		if( conn != null) {
			try {
				conn.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		conn = null;
	}
}
