package com.main.shopping.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Product")
public class Product {
	@Transient 
	public static final String SEQUENCE_NAME="prod-sequence";
	
	@Id
  int productid;
	
	
	@Field
  String productname;
	
	@Field
	String productimage;
	@Field
  double price;
	
	@Field
	String description;
	
	@Field
	int quantity;
	
	 
  public Product() {
  
  }
public Product(int productid, String productname, String productimage, double price, String description, int quantity) {
	super();
	this.productid=productid;
	this.productname = productname;
	this.productimage=productimage;
	this.price = price;
	this.description = description;
	this.quantity=quantity;
	
}
public String getProductimage() {
	return productimage;
}
public void setProductimage(String productimage) {
	this.productimage = productimage;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

 
 
 
}
