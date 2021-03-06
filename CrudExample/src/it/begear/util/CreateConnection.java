package it.begear.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {

	private static CreateConnection createConnectionInstance = null;
//Per mysql 8
//	private static String dbURL = "jdbc:mysql://localhost:3306/sampledb?useUnicode="
//			+ "true&useJDBCCompliantTimezoneShift="
//			+ "true&useLegacyDatetimeCode="
//			+ "false&serverTimezone="
//			+ "UTC";
	private static String dbURL = "jdbc:mysql://localhost:3306/sampledb";
	private static String username = "root";
	private static String password = "javajava";
	private static Connection conn;
	
	private CreateConnection() {};

	public static CreateConnection getCreateConnectionInstance() {
		if(createConnectionInstance == null) {
			createConnectionInstance = new CreateConnection();
		}
		return createConnectionInstance;
	}
	
	public Connection mysqlConnection() {
		try {
		    conn = DriverManager.getConnection(dbURL, username, password); 
		    if (conn != null) {
		        System.out.println("Connected");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
		return conn;
	}
}