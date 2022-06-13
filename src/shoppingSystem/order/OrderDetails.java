package shoppingSystem.order;

import java.util.Scanner;

public class OrderDetails {
    private String id;
    private String orderId;
    private String shippingAddress;
    private char shippingType;
    private double shippingCost;
    private String billingAddress;
    private String createdDate;

    public OrderDetails() {
        id = "";
        orderId = "";
        shippingAddress = "";
        shippingType = 'x';
        shippingCost = 0.0;
        billingAddress = "";
        createdDate = "";
    }

    public void setId(String id) {
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

    public void setCreatedDate(String createdDate) {
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


    public void cancelOrder() 
    {
        //take id from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order id: ");
        String id = sc.nextLine();
        //print the order details
        System.out.println("Order has been cancelled");
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Order ID: " + orderId);
        System.out.println("Shipping Address: " + shippingAddress);
        System.out.println("Shipping Type: " + shippingType);
        System.out.println("Shipping Cost: " + shippingCost);
        System.out.println("Billing Address: " + billingAddress);
        System.out.println("Created Date: " + createdDate);

    }

    //add more function to the class
    public void addOrderDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order id: ");
        orderId = sc.nextLine();
        System.out.println("Enter shipping address: ");
        shippingAddress = sc.nextLine();
        System.out.println("Enter shipping type: ");
        shippingType = sc.next().charAt(0);
        System.out.println("Enter shipping cost: ");
        shippingCost = sc.nextDouble();
        System.out.println("Enter billing address: ");
        billingAddress = sc.nextLine();
        System.out.println("Enter created date: ");
        createdDate = sc.nextLine();

        //set all the values to the object
        setId(id);
        setOrderId(orderId);
        setShippingAddress(shippingAddress);
        setShippingType(shippingType);
        setShippingCost(shippingCost);
        setBillingAddress(billingAddress);
        setCreatedDate(createdDate);
    }

    public void updateOrderDetails() {
        //what do you want to update
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the field you want to update: ");
        String field = sc.nextLine();
        System.out.println("Enter the new value: ");
        String value = sc.nextLine();
        //update the field
        if (field.equals("orderId")) {
            setOrderId(value);
        } else if (field.equals("shippingAddress")) {
            setShippingAddress(value);
        } else if (field.equals("shippingType")) {
            setShippingType(value.charAt(0));
        } else if (field.equals("shippingCost")) {
            setShippingCost(Double.parseDouble(value));
        } else if (field.equals("billingAddress")) {
            setBillingAddress(value);
        } else if (field.equals("createdDate")) {
            setCreatedDate(value);
        } else {
            System.out.println("Invalid field");
        }
    }

    public static void main(String args[]) {
        OrderDetails order = new OrderDetails();
        order.addOrderDetails();
        order.displayDetails();
        order.updateOrderDetails();
        order.displayDetails();
        order.cancelOrder();
    }

}

/*
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
*/