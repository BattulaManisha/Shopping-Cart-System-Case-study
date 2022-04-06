package com.cart.shopping;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//import antlr.collections.List;

@Service
public class CartService {
	@Autowired
	private CartRepository cartrepository;
	
	
	public List<Cart> getAllprod()
	{
		List<Cart> cart = new ArrayList<>();
		cartrepository.findAll()
		.forEach(cart::add);
		return cart;
	}
	
	public void addprod(Cart cart)
	{
		cartrepository.save(cart);
	}
	
	public void updateprod(int productid, Cart prods) 
	{
		productrepository.save(prods);
	}
	
	public void deleteprod(int productid)
	{
		productrepository.deleteById(productid);
	}
}

public class CartService {

}
