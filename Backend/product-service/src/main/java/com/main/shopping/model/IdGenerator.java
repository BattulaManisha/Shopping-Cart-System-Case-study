package com.main.shopping.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection="ProductId")
public class IdGenerator
{
	@Id
	String id;
	 int sequence;


	public IdGenerator()
	{
	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public IdGenerator(String id, int sequence) {
		super();
		id = id;
		sequence = sequence;
	}
	@Override
	public String toString() {
		return "IdGenerator [id=" + id + ", sequence=" + sequence + "]";
	}
	
	


	}

	
