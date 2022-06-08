package shoppingSystem.actor;

public class User {
	private int id;
	private String email;
	private String password;
	private String lastLogin;
	
	public User() {
		id = 0;
		email = "";
		password = "";
		lastLogin = "";
	}
	public User(int id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
		lastLogin = "";
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	
	public void getSession() {}
	
	
}
