package it.begear.model;

public class User {

	private int user_id;
	private String username;
	private String password;
	private String fullname;
	private String email;
	
	public User(String username, String password, String fullname, String email) {
		this.user_id=0;
		this.username=username;
		this.password=password;
		this.fullname=fullname;
		this.email=email;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
