package shoppingSystem.actor;

public class User {
	private String id;
	private String email;
	private String password;
	private String lastLogin;
	
	public User() {
		id = "";
		email = "";
		password = "";
		lastLogin = "";
	}
	public User(String id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
		lastLogin = "";
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getId() {
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
