package com.main.shopping.resource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.shopping.model.Order;
import com.main.shopping.service.OrderService;



@Controller
@RestController
@RequestMapping("/getorder")
public class OrderResource {
	@Autowired
	private OrderService orderservice;
	
	@RequestMapping(method = RequestMethod.GET, value="/order")
	public List<Order> getAllorder()
	{
		return orderservice.getAllorder();
	}
	@RequestMapping(method = RequestMethod.POST, value="/order")
	 public void addorder(@RequestBody Order order) 
	{
		 orderservice.addorder(order);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/order/{orderid}")
	public void deleteorder(@PathVariable int orderid)
	{
		orderservice.deleteorder(orderid);
	}
}
