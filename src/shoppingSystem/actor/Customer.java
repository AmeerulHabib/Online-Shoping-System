package shoppingSystem.actor;

public class Customer extends User{
	private String name;
	private String billingAddress;
	private String defaultShippingAddress;
	
	public Customer() {
		name = "";
		billingAddress = "";
		defaultShippingAddress = "";
	}
	public Customer(String name) {
		this.name = name;
		billingAddress = "";
		defaultShippingAddress = "";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBillingAddress(String Address) {
		billingAddress = Address;
	}
	public void setDefaultShippingAddress(String Address) {
		defaultShippingAddress = Address;
	}
	
	public String getName() {
		return name;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public String getDefaultShippingAddress(){
		return defaultShippingAddress;
	}
	
	public void signUp() {}
	
	public void login() {}
	
	public boolean equals(Customer c) {
		System.out.println("-"+this.getName()+"-");
		System.out.println("-"+c.getName()+"-");
		return (this.getName() == c.getName());
	}
}
