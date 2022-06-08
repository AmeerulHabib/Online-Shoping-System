package shoppingSystem.order;

public class OrderDetails {
	private String id;
	private String orderId;
	private String shippingAddress;
	private char shippingType;
	private double shippingCost;
	private String billingAddress;
	private String createdDate;

	public OrderDetails(){
		id = "";
		orderId = "";
		shippingAddress = "";
		shippingType = 'x';
		shippingCost = 0.0;
		billingAddress = "";
		createdDate = "";
	}
	
	public void setId (String id) {
		this.id = id;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public void setShippingType(char shippingType) {
		this.shippingType = shippingType;
	}
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public void setCreatedDate (String createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getId() {
		return id;
	}
	public String getOrderId() {
		return orderId;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public char getShippingType() {
		return shippingType;
	}
	public double getShippingCost() {
		return shippingCost;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	
	public void cancelOrder(){}

}
