package it.begear.main;

import it.begear.crud.Crud;
import it.begear.model.User;

public class Main {

	public static void main(String[] args) {

		User user1 = new User("Bill","132435","Bill Gates","bill.gates@microsoft.com");
		
		//Singleton
		Crud.getCrudInstance();
		System.out.println("Chiamo il CRUD create:");
		System.out.println("\n");
		
		Crud.getCrudInstance().insertData(user1);
		System.out.println("\n");
		
		Crud.getCrudInstance().searchUsers();
		System.out.println("\n");
		
		Crud.getCrudInstance().update(user1);
		System.out.println("\n");
		
		Crud.getCrudInstance().deleteUsers(user1);
		System.out.println("\n");
	}
}
