package shoppingSystem.order;

public class ShoppingCart {
	private String id;
	private String productId;
	
	public ShoppingCart() {
		id = "";
		productId = "";
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getId() {
		return id;
	}
	public String getproductId() {
		return productId;
	}
	
	public void addProductToCart() {}
	
	public void removeProductFromCart() {}
	
	public void checkOut() {}
}
