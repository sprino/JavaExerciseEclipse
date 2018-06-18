package model;

public class SingletonObject{
	
	private static SingletonObject instance = new SingletonObject();
	
	private SingletonObject() {};
	
	public static SingletonObject getInstance() {
		return instance;
	}
	
	public String stampa() {
		return "Hello World!";
	}
}