package shoppingSystem.order;

public class Orders {
	private String id;
	private String customerId;
	private String orderDate;
	private char status;
	private double price;
	
	public Orders() {
		id = "";
		customerId = "";
		orderDate = "";
		status = 'x';
		price = 0.0;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public String getCustomerId() {
		return customerId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public char getStatus() {
		return status;
	}
	public double getPrice() {
		return price;
	}
	
	public void updateOrderStatus() {}
	
	public void placeOrder() {}
}
