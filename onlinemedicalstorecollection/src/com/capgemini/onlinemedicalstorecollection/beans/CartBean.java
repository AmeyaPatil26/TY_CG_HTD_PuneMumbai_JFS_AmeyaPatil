package com.capgemini.onlinemedicalstorecollection.beans;

public class CartBean {

	private int cartId;
	private int userId;
	private int productId;
	private int price;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CartBean [cartId=" + cartId + ", userId=" + userId + ", productId=" + productId + ", price=" + price
				+ "]";
	}
	
	
	
}
