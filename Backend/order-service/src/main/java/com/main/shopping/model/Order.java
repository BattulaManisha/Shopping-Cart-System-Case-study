package com.main.shopping.model;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Order")
public class Order
{
	@Id
	int orderid;
	
	@Field
	Date orderdate;
	
	@Field
	String address;
	
	@Field
	String gmail;
	@Field
	String mobileno;
	
	public Order()
	{
		
	}
	
	 public Order(int orderid, Date orderdate,  String address, String gmail, String mobileno)
	{
		 this.orderid=orderid;
		 this.orderdate=orderdate;
		 this.address=address;
		 this.gmail=gmail;
		 this.mobileno=mobileno;
	}
	 
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

		

	
		
}
	