package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.DaoImpiegato;
import model.Impiegato;
import util.CreateConnection;
import util.Utility;

public class CrudImpiegato implements DaoImpiegato{
	
	private static Connection conn;
	private static boolean state = false;
	private static CrudImpiegato crudInstance = null;
	
//	private CrudImpiegato() {};
	
	public CrudImpiegato() {
		
	}
	
	public static CrudImpiegato getCrudInstance() {
		if(crudInstance == null) {
			crudInstance = new CrudImpiegato();
		}
		return crudInstance;
	}
	
	//Insert
	@Override
	public boolean inserisciImpiegato(Impiegato imp) {
		
		System.out.println("INSERISCO IMPIEGATO:");
		
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		String sql = "INSERT INTO Impiegato (Nome, Cognome, Dipartimento, Ufficio, Stipendio) VALUES (?,?,?,?,?)";
		
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			prepareStatement.setString(1, imp.getNome());
			prepareStatement.setString(2, imp.getCognome());
			prepareStatement.setString(3, imp.getDipart());
			prepareStatement.setInt(4, imp.getUfficio());
			prepareStatement.setInt(5, imp.getStipendio());

			Utility.getMioLogger().info(prepareStatement.toString());
			
			int rowsInserted = prepareStatement.executeUpdate();
			ResultSet id = prepareStatement.getGeneratedKeys();
			id.next();
			
			imp.setIdImpiegato(id.getInt(1));
			
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
	
	//ReadForId
	@Override
	public Impiegato ricercaPerId(Impiegato imp) {

		System.out.println("RICERCO IMPIEGATO:");
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		Impiegato impTemp = new Impiegato();
		String sql = ("SELECT * FROM Impiegato WHERE idImpiegato=?");
		int count = 0;
		
		//Prepare Statement previene il sqlInjection. Non valuta le or ed il ? sigifica una sola stringa.
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setInt(1, imp.getIdImpiegato());
			
			Utility.getMioLogger().info(prepareStatement.toString());
			
			//Se passo sql come parametro di executeQuery mi da errore, per passare sql devo non preparare lo satement.
			ResultSet result = prepareStatement.executeQuery();
			    		
			while(result.next()) {
				impTemp.setIdImpiegato(result.getInt(1));
				impTemp.setNome(result.getString(2));
				impTemp.setCognome(result.getString(3));
				impTemp.setDipart(result.getString(4));
				impTemp.setUfficio(result.getInt(5));
				impTemp.setStipendio(result.getInt(6));
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
		return impTemp;
	}

	
	//Search
	@Override
	public boolean ricercaImpiegato(Impiegato imp) {

		System.out.println("RICERCO IMPIEGATO:");
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		
		String sql = ("SELECT * FROM Impiegato WHERE Nome=? AND Cognome=? ");
		//String sql = ("SELECT * FROM Impiegato WHERE Nome='"+nome+"'" +" AND Cognome='"+cognome+"'");
		
		//Prepare Statement previene il sqlInjection. Non valuta le or ed il ? sigifica una sola stringa.
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, imp.getNome());
			prepareStatement.setString(2, imp.getCognome());
			
			Utility.getMioLogger().info(prepareStatement.toString());
			
			//Se passo sql come parametro di executeQuery mi da errore, per passare sql devo non preparare lo satement.
			ResultSet result = prepareStatement.executeQuery();
			
			int count = 0;
			
				while (result.next()){
					int userId = result.getInt(1);
				    String dipart = result.getString(4);
				    int ufficio = result.getInt(5);
				    int stipendio = result.getInt(6);
				    
				    String output = "User #%d:" + "ID_IMPIEGATO:" +" %d - %s - %s - %s - %d - %d";
				    System.out.println(String.format(output, ++count, userId, imp.getNome(), imp.getCognome(), dipart, ufficio, stipendio));
				    
				}

				if(count == 0) {
					System.out.println("Impiegato non trovato!");
					state = false;
				}
				else {
					System.out.println("Ho trovato n� " + count + " impiegati!");
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
	
	//Update
	@Override
	public boolean aggiornaImpiegato(Impiegato imp) {
		
		System.out.println("AGGIORNO IMPIEGATO:");
		
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		String sql = "UPDATE Users SET nome=?, cognome=?, dipart=?, ufficio=?, stipendio=? WHERE id_impiegato=?";
		
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			
			System.out.print("Inserisci il nuovo nome:");
			prepareStatement.setString(1, Utility.insert().next());
			
			System.out.print("Inserisci il nuovo cognome:");
			prepareStatement.setString(2, Utility.insert().next());
			
			System.out.print("Inserisci il nuovo dipartimento di appartenenza:");
			prepareStatement.setString(3, Utility.insert().next());
			
			System.out.print("Inserisci il nuovo numero id ufficio:");
			prepareStatement.setInt(4, Utility.insert().nextInt());
			
			System.out.print("Inserisci il nuovo stipendio:");
			prepareStatement.setInt(5, Utility.insert().nextInt());
			
			prepareStatement.setInt(6, imp.getIdImpiegato());

			Utility.getMioLogger().info(prepareStatement.toString());
			
			Utility.getMioLogger().info(prepareStatement.toString());
			
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
	public boolean eliminaImpiegato(Impiegato imp) {
		
		System.out.println("ELIMINO IMPIEGATO:");
		
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		boolean state = false;
		
		String sql = "DELETE FROM Impiegato WHERE idImpiegato=?";
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setInt(1, imp.getIdImpiegato());

			Utility.getMioLogger().info(prepareStatement.toString());
			
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
	public boolean stampaImpiegati() {
		
		System.out.println("TABELLA IMPIEGATI:");
		
		conn = CreateConnection.getCreateConnectionInstance().mysqlConnection();
		
		String sql = "SELECT * FROM Impiegato";
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = conn.prepareStatement(sql);
			
			Utility.getMioLogger().info(prepareStatement.toString());
			
			ResultSet result = prepareStatement.executeQuery();
			
			int count = 0;
			
				while (result.next()){
					int userId = result.getInt(1);
					String nome = result.getString(2);
					String cognome = result.getString(3);
				    String dipart = result.getString(4);
				    int ufficio = result.getInt(5);
				    int stipendio = result.getInt(6);			    
				    String output = "User #%d: %d - %s - %s - %s - %d - %d";
				    System.out.println(String.format(output, ++count, userId, nome, cognome, dipart, ufficio, stipendio));
				    
//					String output = "User #%d: %s";
//				    System.out.println(String.format(output, ++count, result.toString()));
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