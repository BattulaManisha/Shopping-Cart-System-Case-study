

package com.main.shopping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.shopping.model.Product;
import com.main.shopping.repository.ProductRepository;


@Service
public class ProductService {
	@Autowired
	private ProductRepository productrepository;
	
	
	public List<Product> getAllprod()
	{
		List<Product> prods = new ArrayList<>();
		productrepository.findAll()
		.forEach(prods::add);
		return prods;
	}
	
	public void addprod(Product prods)
	{
		productrepository.save(prods);
	}
	
	public void updateprod(int productid, Product prods) 
	{
		productrepository.save(prods);
	}
	
	public void deleteprod(int productid)
	{
		productrepository.deleteById(productid);
		
	}
	
	}
