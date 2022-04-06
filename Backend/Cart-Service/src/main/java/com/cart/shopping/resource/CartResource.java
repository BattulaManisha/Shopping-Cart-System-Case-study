package com.cart.shopping.resource;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

import com.cart.shopping.CartService;
import com.cart.shopping.repository.CartRepository;

	
	@Controller
	@RestController
	@RequestMapping("/cart")
	public class CartResource {
		@Autowired
		private CartService cartservice;
		@Autowired
		CartRepository cartrepository;
		
		@Autowired
		
		
				
		public ProductResource(ProductService productservice) {
			this.productservice = productservice;
		}
		
		@RequestMapping(method = RequestMethod.GET, value="/prodt")
		public List<Product> getAllprod()
		{
			return productservice.getAllprod();
		}
		/*
		 * @RequestMapping(method = RequestMethod.GET, value="/product/{productname}")
		 * public List<Product> getProductname(@PathVariable("productname") String
		 * productname){ return productservice.getProductname(productname); }
		 */
		/*
		 * @RequestMapping(method = RequestMethod.POST, value="/product") public void
		 * addprod(@RequestBody Product prod) { productservice.addprod(prod);
		 * prod.setId(service.getSequenceNumber(Product.SEQUENCE_NAME)); return
		 * productrepository.save(prod); }
		 */
		
		//@PostMapping("/post")
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
		
		
	}


}
