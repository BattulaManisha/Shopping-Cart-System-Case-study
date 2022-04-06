package com.main.shopping.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.shopping.model.Order;
import com.main.shopping.repository.OrderRepository;


//import antlr.collections.List;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderrepository;
	
	
	public List<Order> getAllorder()
	{
		List<Order> order = new ArrayList<>();
		orderrepository.findAll()
		.forEach(order::add);
		return order;
	}
	
	public void addorder(Order order)
	{
		orderrepository.save(order);
	}
	
		
	public void deleteorder(int orderid)
	{
		orderrepository.deleteById(orderid);
	}
}

