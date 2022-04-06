package com.main.shopping.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.main.shopping.model.Product;
import com.main.shopping.repository.ProductRepository;
import com.main.shopping.resource.ProductResource;
 



@SpringBootTest
class ProductServiceApplicationTests 
{
	


	/* @Mock
	    private ProductRepository productrepository;

	    @InjectMocks
	    private ProductResource productresource;

	    public List<Product> product;

	    @Test
	    @Order(1)
	    public void TestFindById() 
	    {

	        List<Product> product = new ArrayList<Product>();
	        product.add(new Product(3,"Car","laptop.jpg", 500000.0,"Benz",60));
	        when(productrepository.findByproductId(3)).thenReturn(product);
	        assertEquals(1, productrepository.findByproductId(3).size());
	    }
	 
	 @Test
	public void addprod()
	{
	Product product = new Product (2,"Laptop","laptop.jpg", 50000.0,"Utlraprotable",30);
	when((productrepository).insert(product)).thenReturn(product);
	assertEquals(product, (productrepository).insert(product));
	} 
	

	/* @Test 
	  public void getAllprod()
	  {
	  when(productrepository.findAll()).thenReturn(Stream .of(new Product(2,"Laptop","Laptop.jpg", 50000.0,"Utlraprotable",30,50),
	  new Product(2,"Laptop","Laptop.jpg", 50000.0,"Utlraprotable",30,50), 
	  new Product(2,"Laptop","Laptop.jpg", 50000.0,"Utlraprotable",30,50)).collect(Collectors.toList()));
	  assertEquals(2,productresource.getAllProd().size()); 
	  } */

}



