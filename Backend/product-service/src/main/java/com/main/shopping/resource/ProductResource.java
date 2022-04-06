package com.main.shopping.resource;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.shopping.model.Product;
import com.main.shopping.repository.ProductRepository;
import com.main.shopping.service.ProductService;
import com.main.shopping.service.SeqGenerator;


@Controller
@RestController
@RequestMapping("/getprod")
@CrossOrigin(origins = "*")
public class ProductResource {
	@Autowired
	private ProductService productservice;
	@Autowired
	ProductRepository productrepository;
	
	@Autowired
	private SeqGenerator service;
	
	public ProductResource(ProductService productservice) {
		this.productservice = productservice;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/prodt")
	public List<Product> getAllprod()
	{
		return productservice.getAllprod();
	}
		@RequestMapping(method = RequestMethod.POST, value="/prodt") 
	public Product addprod(@RequestBody Product product) {
		product.setProductid(service.getSequenceNumber(Product.SEQUENCE_NAME));
		return productrepository.save(product);
		}
	@RequestMapping(method = RequestMethod.PUT, value="/prodt/{productid}")
	public void updateprod(@RequestBody Product prod, @PathVariable int productid)
	{
		productservice.updateprod(productid, prod);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/prodt/{productid}")
	public void deleteprod(@PathVariable int productid)
	{
		productservice.deleteprod(productid);
	}

	@RequestMapping(method = RequestMethod.GET, value="/prodt/{productid}")
	public Optional<Product> getcart(@PathVariable int productid){
	return productrepository.findById(productid);
	}

	

		
}
