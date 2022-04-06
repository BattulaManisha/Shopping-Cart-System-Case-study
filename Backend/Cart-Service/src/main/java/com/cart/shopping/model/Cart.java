package com.cart.shopping.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Cart")
public class Cart 
{
	@Id 
	int cartid;
	
	@Field
	int customerId;
	
	@Field
	String items;
	
	@Field
	double total;
	
	public Cart(int cartid, int customerId, String items, double total)
	{
		this.cartid=cartid;
		this.customerId=customerId;
		this.items=items;
		this.total=total;
	}

	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", customerId=" + customerId + ", items=" + items + ", total=" + total + "]";
	}
	
	
	

}
