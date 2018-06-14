package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DaoDipartimento;
import model.Dipartimento;
import util.CreateConnection;
import util.Utility;

public class CrudDipartimento implements DaoDipartimento{
	
	private static Connection conn;
	private static CrudDipartimento crudInstance = null;
	private static boolean state = false;
	
	public CrudDipartimento() {};
	
	public static CrudDipartimento getCrudInstance() {
		if(crudInstance == null) {
			crudInstance = new CrudDipartimento();
		}
		return crudInstance;
	}
	
	//Insert
	@Override
	public boolean inserisciDipartimento(Dipartimento user) {
		
		System.out.println("INSERISCO DIPARTIMENTO:");
		
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		String sql = "INSERT INTO Dipartimento (nome, indirizzo, citta) VALUES (?,?,?)";
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, user.getNome());
			prepareStatement.setString(2, user.getIndirizzo());
			prepareStatement.setString(3, user.getCitta());

			Utility.getMioLogger(prepareStatement.toString());
			
			int rowsInserted = prepareStatement.executeUpdate();
			
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			    state = true;
			}
			else {
				state = false;
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
		return state;
	}
	
	//Search
	@Override
	public boolean ricercaDipartimento(Dipartimento dip) {

		System.out.println("RICERCO DIPARTIMENTO:");
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		String sql = "SELECT * FROM Dipartimento WHERE nome=?";
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, dip.getNome());
			
			Utility.getMioLogger(prepareStatement.toString());
			
			ResultSet result = prepareStatement.executeQuery();
			 
			int count = 0;
			 
			while (result.next()){
				String nome = result.getString(1);
			    String indirizzo = result.getString(2);
			    String citta = result.getString(3);

			 
			    String output = "User #%d:" + "Nome:" +" %s - %s - %s";
			    System.out.println(String.format(output, ++count, nome, indirizzo, citta));

			}
			if(count == 0) {
				System.out.println("Dipartimento non trovato!");
				state = false;
			}
			else {
				System.out.println("Ho trovato numero " + count + " dipartimenti!");
				state = true;
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
		return state;
	}
	
	//ReadForId
	@Override
	public Dipartimento ricercaPerId(Dipartimento dip) {

		System.out.println("RICERCO DIPARTIMENTO:");
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		Dipartimento dipTemp = new Dipartimento();
		String sql = ("SELECT * FROM Dipartimento WHERE nome=?");
		int count = 0;
		
		//Prepare Statement previene il sqlInjection. Non valuta le or ed il ? sigifica una sola stringa.
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, dip.getNome());
			
			Utility.getMioLogger(prepareStatement.toString());
			
			//Se passo sql come parametro di executeQuery mi da errore, per passare sql devo non preparare lo satement.
			ResultSet result = prepareStatement.executeQuery();
			    		
			while(result.next()) {
				dipTemp.setNome(result.getString(1));
				dipTemp.setIndirizzo(result.getString(2));
				dipTemp.setCitta(result.getString(3));
				count+=1;
			}
			
			if(count!=0) {
				System.out.println("Elemento trovato.");
			}
			else {
				System.out.println("Elemento non trovato");
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
		return dipTemp;
	}
	
	//Update
	@Override
	public boolean aggiornaDipartimento(Dipartimento dip) {
		
		System.out.println("AGGIORNO UTENTE:");
		
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		String sql = "UPDATE Dipartimento SET nome=?, indirizzo=?, citta=? WHERE nome=?";
		PreparedStatement prepareStatement;
		try {
			prepareStatement = conn.prepareStatement(sql);
			
			System.out.print("Inserisci il nuovo nome:");
			prepareStatement.setString(1, Utility.insert().next());
			
			System.out.print("Inserisci il nuovo indirizzo:");
			prepareStatement.setString(2, Utility.insert().next());
			
			System.out.print("Inserisci la nuova citta:");
			prepareStatement.setString(3, Utility.insert().next());
			
			prepareStatement.setString(4, dip.getNome());
			
			Utility.getMioLogger(prepareStatement.toString());
			
			int rowsUpdated = prepareStatement.executeUpdate();
			
			if (rowsUpdated == 0) {
			    System.out.println("User not exist!");
			    state = false;
			}
			else if(rowsUpdated > 0) {
				System.out.println("Update Successfull!");
				System.out.println("Number of rowUpdate : "+ rowsUpdated);
				state = true;
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
		return state;
	}
	
	//Delete
	@Override
	public boolean eliminaDipartimento(Dipartimento dip) {
		
		System.out.println("ELIMINO UTENTE:");
		
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		String sql = "DELETE FROM Dipartimento WHERE nome=?";
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, dip.getNome());
			
			Utility.getMioLogger(prepareStatement.toString());
			
			int rowsDeleted = prepareStatement.executeUpdate();
			
			if (rowsDeleted > 0) {
			    System.out.println("A user was deleted successfully!");
			    state = true;
			}
			else {
				state = false;
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
		return state;
	}
	
	
	//Stampa
	@Override
	public boolean stampaDipartimenti() {
		
		System.out.println("TABELLA DIPARTIMENTI:");
		
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		String sql = "SELECT * FROM Dipartimento";
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			
			Utility.getMioLogger(prepareStatement.toString());
			
			ResultSet result = prepareStatement.executeQuery();
			
			int count = 0;
			
				while (result.next()){
					String nome = result.getString(1);
					String indirizzo = result.getString(2);
				    String citta = result.getString(3);
				    
				    String output = "User #%d: %s - %s - %s";
				    System.out.println(String.format(output, ++count, nome, indirizzo, citta));
				}
				if(count != 0) {
					state = true;
				}
				else {
					System.out.println("Empity!");
					state = false;
				}

		} catch (SQLException e) {
			System.out.println("Catch of StampaImpiegati:");
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
		return state;
	}
}