package it.begear.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.begear.model.User;
import it.begear.util.CreateConnection;

public class Crud {
	
	private static Connection conn;
	private static Crud crudInstance = null;
	
	private Crud() {};
	
	public static Crud getCrudInstance() {
		if(crudInstance == null) {
			crudInstance = new Crud();
		}
		return crudInstance;
	}
	
	//Insert
	public void insertData(User user) {
		
		System.out.println("INSERISCO UTENTE:");
		
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?,?,?,?)";
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, user.getUsername());
			prepareStatement.setString(2, user.getPassword());
			prepareStatement.setString(3, user.getFullname());
			prepareStatement.setString(4, user.getEmail());
			 
			int rowsInserted = prepareStatement.executeUpdate();
			
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
		} catch (SQLException e) {
			System.out.println("Catch of InsertData:");
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				System.out.println("Connection close correctly!");
			} catch (SQLException e) {
				System.out.println("Database not close:");
				e.printStackTrace();
			}
		}
	}
	
	//Search
	public void searchUsers() {

		System.out.println("RICERCO UTENTE:");
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		String sql = "SELECT * FROM Users";
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			ResultSet result = prepareStatement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
				int userId = result.getInt(1);
			    String name = result.getString(2);
			    String pass = result.getString(3);
			    String fullname = result.getString(4);
			    String email = result.getString(5);
			 
			    String output = "User #%d: %s - %d - %s - %s - %s";
			    System.out.println(String.format(output, ++count, name, userId, pass, fullname, email));
			}
		} catch (SQLException e) {
			System.out.println("Catch of searchUser:");
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				System.out.println("Connection close correctly!");
			} catch (SQLException e) {
				System.out.println("Database not close:");
				e.printStackTrace();
			}
		}
	}
	
	
	//Update
	public void update(User user) {
		
		System.out.println("AGGIORNO UTENTE:");
		
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
		PreparedStatement prepareStatement;
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, "123456789");
			prepareStatement.setString(2, "William Henry Bill Gates");
			prepareStatement.setString(3, "bill.gates@microsoft.com");
			prepareStatement.setString(4, user.getUsername());
			 
			int rowsUpdated = prepareStatement.executeUpdate();
			if (rowsUpdated == 0) {
			    System.out.println("User not exist!");
			}
			else if(rowsUpdated > 0) {
				System.out.println("Update Successfull!");
				System.out.println("Number of rowUpdate : "+ rowsUpdated);
			}
		} catch (SQLException e) {
			System.out.println("Catch of Search User:");
			e.printStackTrace();
		}finally{
			try {
				conn.close();
				System.out.println("Connection close correctly!");
			} catch (SQLException e) {
				System.out.println("Database not close:");
				e.printStackTrace();
			}
		}
	}
	
	//Delete
	public void deleteUsers(User user) {
		
		System.out.println("ELIMINO UTENTE:");
		
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		String sql = "DELETE FROM Users WHERE username=?";
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, user.getUsername());
			 
			int rowsDeleted = prepareStatement.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A user was deleted successfully!");
			}
		} catch (SQLException e) {
			System.out.println("Catch of deleteUser:");
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				System.out.println("Connection close correctly!");
			} catch (SQLException e) {
				System.out.println("Database not close:");
				e.printStackTrace();
			}
		}
	}
}