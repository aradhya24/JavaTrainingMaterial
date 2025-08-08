package com.aurionpro.ecommerce_miniproject.model;

public class CartItem {
	private int cartId;
	private int productId;
    private String productName;
    private int quantity;
    private double price;

    
    
    

    public CartItem(int cartId, int productId, String productName, int quantity, double price) {
		super();
		this.cartId = cartId;
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
    
    

	public int getCartId() {
		return cartId;
	}



	public int getProductId() {
		return productId;
	}


	public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}
